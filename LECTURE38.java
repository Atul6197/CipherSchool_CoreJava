class ReverseString
{
    public static void main(String [] args)
    {
        String s1 ="CipherSchools";
        int n = s1.length();
        char arr[] = new char [n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = s1.charAt(n-1-i);
        }
        //arr has reversed string
        String rev = new String(arr);
        System.out.println(rev);
        //what is the time complexity -> O(n)
        //Is it an In plac e solution? -> no, we created arr[]
        //What is the space complexity? -> O(n) -> for arr[n]

        String res = new String();
        for(int i= n-1; i>=0;i--)
        {
            res = res + s1.charAt(i);
        }
        System.out.println(res);

        //Approach - 3
        char strArr[] = s1.toCharArray();
        int l = 0;
        int r = n-1;
        while(l<r)
        {
            char temp = strArr[l];
            strArr[l] = strArr[r];
            strArr[r] = temp;
        }
        //swapping completed
        String result = new String(strArr);
    
    }
}