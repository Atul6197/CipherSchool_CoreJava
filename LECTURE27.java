class SelectionSort {
    public static void main(String [] args){

        int arr[] = { 23,43,3,55,99,17};
        int n = arr.length;

        for(int i=0; i<n;i++)
        {
            // find the index of minimum element
            int minIndex = 1;
            for( int j = i+1 ; j<n-1 ; j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            //the index of min element is found in minIndex
            //now we will swap the min element and bring it in its place
            //i.e swap elements at minIndex and i

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        //then our array should be sorted

        for(int i = 0 ; i <n ; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
}