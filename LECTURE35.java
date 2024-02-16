class BinarySearchingWithoutRecursion{
    public static void main(String [] args)
    {
        int arr[] = {2,5,8,12,16,23,38,56,72}; //Pre.requisite -> Sorted Array
        int x =23 ;
 //       int x =19;
        
        //Binary Search below
        int l = 0; //Leftmost Index
        int r = arr.length - 1;// Rightmost Index

        while(l<=r)
        {
//          int mid = (r-1)/2 + l;
            int mid = (l+r)/2;
            if(arr[mid] == x)
            {
                System.out.println("Value found at index: " + mid);
                return;
            }
            else if(x<arr[mid])
            {
                r = mid - 1;
            }
            else 
            {
                l = mid + 1;
            }
            
        }
        System.out.println("Vlaue not found.");
    }
}