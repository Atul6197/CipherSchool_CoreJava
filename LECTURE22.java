import java.util.Scanner;
class ArrayInput{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
//      Input the size
        int n = sc.nextInt();
//      Create the array
        int arr[] = new int[n];
//      Take the elements as input
        for(int i = 0; i<n ; i++ )
        {
            System.out.println("Please enter "+(i+1) +" element: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Array is: ");
        for(int i = 0; i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}