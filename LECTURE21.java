import java.util.Scanner;

class ScannerStudy
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your First Name: ");
        String firstName = sc.nextLine(); // It will take input till a space occurs
        System.out.print("Please enter your Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Please enter your professionn: ");
        String profession = sc.nextLine();
        System.out.print("Please enter your address: ");
        String address = sc.nextLine();
        System.out.print("Please enter your house number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print("Please enter your average percentage: ");
        float percentage = Float.parseFloat(sc.nextLine());
        
        
        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Profession: " + profession);
        System.out.println("Address: " + address);
        System.out.println("House Number: " + number);
        System.out.println("Percentage: " + percentage);

//      Whenever we need to take mixed inputs like:
//      1. Numbers and Strings both are there
//      2. Words from a single like then complete next line or something like tha
//      -> use nextLine and parse the data

        
    }
    
}
