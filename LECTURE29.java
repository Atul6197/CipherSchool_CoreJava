class StringStudy
{
    public static void main(String [] args)
    {
        String name = "CipherSchools";//created using string literals - stored in method area
        String name2 = "CipherSchools";

        String name3 = new String("CipherSchools");// creating string using constructors
        String name4 = new String("CipherSchools");

        System.out.println(name == name2); //== operator compares referneces for objects and values for primitive
        System.out.println(name3 == name4);
        System.out.println(name == name3);

//      STRINGS ARE IMMUTABLE
//      Everytime we do an operation on a string, a  new object is created
        System.out.println("************************************");
        System.out.println("1. CONCATENATION");
        //1. Concatenation
        String s1 = "Hello";
        s1 = s1 + "Peeps";
        System.out.println(s1);
        System.out.println(s1 + ", How are you doing?");
        System.out.println(s1); // s1 remains same because

        //Another way to concat is to use function
        String s2 = new String("Hello");
        String s3 = new String(" People");
        String s4 = s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2);// remains same

        System.out.println("**********************");
        System.out.println("2 . CHECKING IF STRINGS SRE EQUAL IN VALUE");
        //2. CHECKING IF STRINGS IS TO USE FUNCTION

        System.out.println(name.equals(name2));
        //Equals functions -> object class
        //This generally compares references(hashcodes) of objects (just like ==)
        //But, for String class it has been overridden to check for content equality


        System.out.println("***************************");
        System.out.println("3. reating new String object from charactr array");
        //3. Creating new String object from character array
        char arr[] = {'C','I','P','H','E','R'};
        String strFromArr = new String(arr); //constructor overloaded
        System.out.println(strFromArr);


    }
}