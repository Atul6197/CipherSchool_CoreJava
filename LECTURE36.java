class Solution36
{
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr, int N)
    {
    /*     int max = Integer.MIN_VALUE;
        for(int i = 0; i<=N -K ; i++)
        {
            int sum = 0;
            for(int j = 0; j<K;j++)
            {
                sum = sum + Arr.get(i+j);
            }
            //where we have found the sum of the sub array
            if(sum>max) max = sum;
        }
        return max;*/
        // int max = Integer.MIN_VALUE;
        int sum = 0;
        //Finding sum of first window
        for(int i = 0; i<K ;i++)
        {
            sum = sum + Arr.get(i);
        }
        int max = sum;//to include comparison for first window 
        //Sum of first window found
        for(int i = 0; i<N-K;i++)
        {
            sum = sum - Arr.get(i) + Arr.get(i+k);
            if(sum>max) max = sum;
        }

        return max;
    }
}
