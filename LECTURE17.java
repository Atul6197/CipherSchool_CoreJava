class ArrayStudy{

//  static void addOne(int x)
//   {
//       x = x + 1;
//   }
//   static void addOne(int arr[])
//   {
//        for(int i = 0; i<arr.length;i++)
//        {
//              arr[i]++;
//        }    

//   }    

    static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
public static void main(String [] args){
//      1. Array Creation Expression
        int size = 5 ;
        int arr[] = new int[size]; // Combination of 19 and 20
//      int arr[], int[] arr, int [] arr -> all are the same
//      int arr[] -> Array Declaration expression.
//      arr = new int[size]; -> creation of object
        System.out.println(arr[0]);
        System.out.println(arr[0]);
        System.out.println(arr[0]);
        System.out.println(arr[0]);
        System.out.println(arr[0]);

        print(arr);

       for(int i=0;i<size;i++)
        {
            arr[i] = i+1 ;
        }
       
        print(arr);

//      2.Array Initializers list
        int arr2[] = {1,2,3};
        print(arr2);

//      if we want to increase size of an Array?
        int copyArray[] = new int[2*size];//Creat ean array of double size
        for(int i = 0;i<size;i++)
        {
            copyArray[i] = arr[i];// copy all elements from old to new array
        }
        copyArray[5] = 6;
        copyArray[6] = 7;
        print(copyArray);

//      int x = 10;
//      addOne(x);
//      System.out.println(x);
//      int arr3 [] = {1,2,3,4,5}; 
//      addOne(arr3);
//      for(int i = 0; i<arr3.length;i++)
//      {
//          System.out.print(arr[i] + " ");
//      }
//      System.out.println();

    }
}
