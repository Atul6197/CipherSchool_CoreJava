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
    }
}