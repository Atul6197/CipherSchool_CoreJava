class MultiDimArrays{
    public static void main(String [] args)
    {
        int rows = 5;
        int cols = 3;
        int arr[][] = new int[rows][cols];//Array Creation Expression

        for(int i = 0;i < arr.length;i++) // i-> rows
        {
            for(int j = 0;j < arr[0].length;j++)// j-> columns
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // leaving fine as one row printing completed here

        }

        System.out.println("*************************************************");
        //Array initializaers list
//      We wants to create the following array
//      1 2 3
//      4 5 6
//      7 8 9
        int arr2[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i = 0;i < arr2.length;i++) // i-> rows
        {
            for(int j = 0;j < arr2[0].length;j++)// j-> columns
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(); // leaving fine as one row printing completed here

        }
    }
}