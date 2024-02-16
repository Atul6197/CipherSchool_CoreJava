import java.util.Scanner;

class StringStudy1
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
        System.out.println(s1);// remains same

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


        //4. Creating partial String object from character array
        System.out.println("************************");
        System.out.println("4. Creating partial String object from character array");
        String partialStrFromArr = new String(arr, 1, 3); //we can pass an array: array, String index(included),count of elements after starting index
        System.out.println(partialStrFromArr);

        String partialStrFromArr2 = new String(arr, 2, 3); //we can pass an array: array, String index(included),count of elements after starting index
        System.out.println(partialStrFromArr2); 

        //4. Changing the case
        System.out.println("************************");
        System.out.println("5. Changing the case");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
//      name = naem.toUpperCase();
        System.out.println(name);//remain same
        
      /*   //6.Splitting
        System.out.println("************************");
        System.out.println("6. Splitting");
        System.out.println("please enter you full name: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();// Eg;- I am Atul Prakash
        String strArr[] = fullName.split(" ");// here delimiter is space
        for(int i = 0; i< strArr.length ; i++ )
        {
            System.out.println(strArr[i]);
        }

       System.out.println("please enter something seperated by comma: ");
        String csvTxt = sc.nextLine();// Eg;- I,am,Atul,Prakash
        String csvArr[] = csvTxt.split(",");// here delimiter is comma
        for(int i = 0; i< csvArr.length ; i++ )
        {
            System.out.println(csvArr[i]);
        }

        System.out.println("please enter something seperated by dots: ");
        String dotTxt = sc.nextLine();// Eg;- I.am.Atul.Prakash
        String dotArr[] = dotTxt.split("[.]");//a dot is a meta char in regex, so we will need to use it inside square bracketsj
        // instead of passing split(".") we have to use split("[.]")
        for(int i = 0; i< dotArr.length ; i++ )
        {
            System.out.println(dotArr[i]);
        }

        String backSlashText = "Hello, I attend \"java\" class";//these are special chars : \ ' ' etc we need to create these using \ if we want them in our string
        String backSlashArr[] =backSlashText.split("\"");
        for(int i = 0; i< backSlashArr.length ; i++ )
        {
            System.out.println(backSlashArr[i]);
        }*/

        //7. Length of a string
        System.out.println("******************************");
        System.out.println("7. Length of a string");
        int len = name.length();
        System.out.println("Length of: " + name + "is: " + len);


        //8. Finding Index of a char on a string
        System.out.println("***********************");
        System.out.println("8. Finding index of a char in a string");
        int index = name.indexOf('e');// return first occurrence of that character
        System.out.println("Index of 'e' in  "+ name + " is: "+ index );

        int index2 = name.indexOf('E');//return first occurrence of that character
        System.out.println("Index of 'E' in "+ name +" is: "+ index2);

        int index3 = name.indexOf("School");//return first occurrence of that string
        System.out.println("Index of 'School' in "+ name +" is: "+ index3);

        int index4 = name.indexOf('o',10);//return first occurrence of that character
        System.out.println("Index of 'o' in "+ name +" is: "+ index4);

        int indexOfO =0;

        while(indexOfO != -1) //Stop at -1 or Run till not -1
        {
            indexOfO = name.indexOf('o', indexOfO + 1);
            if(indexOfO == -1) break;
            System.out.println("O found at: " + indexOfO);
        }

        //9. Extract a substring
        System.out.println("*************************");
        System.out.println("9. Extract a Substring");
        String wF = "Wakanda Forever";
        String subString = wF.substring(3);//From starting index included till the end of string.
        System.out.println(subString);

        String subString2 = wF.substring(3,7); //From starting index included till ending index[excluded]
        System.out.println(subString2);

        //10. Finding a character at a given index 
        System.out.println("************************************");
        System.out.println("10. Finding a character at a given index");
        System.out.println(name.charAt(4));
        int charAtIndex = name.charAt(6);
        System.out.println(charAtIndex);

        //11. Char Array from a string
        System.out.println("************************************");
        System.out.println("11. Char Array from a string");
        char arr2[] = name.toCharArray();
        for (int i = 0; i <arr2.length ;i++)
        {
            System.out.println(arr2[i]);
        }

        //12 .Check if a string is empty
        System.out.println("******************************");
        System.out.println("12. Check if a string is empty");
        String emptyString = new String();
        String emptyString2 = "";
        String blankString = "           ";
        System.out.println(emptyString);
        System.out.println(emptyString2);
        System.out.println(emptyString.equals(""));
        System.out.println(emptyString2.equals(""));
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString2.isEmpty());
        System.out.println(blankString.isEmpty());
        System.out.println(emptyString.isBlank()); 

        //13. Comparing strings lexicographically -> alphabateically
        System.out.println("***************************");
        System.out.println("13. Comparing strings lexicographically -> alphabetically");
        String textOne = "Qhey!";
        String textTwo = "QBye";
        System.out.println(textOne.compareTo(textTwo));//compares character by character
        System.out.println(textTwo.compareTo(textOne));
        System.out.println(textOne.compareTo(textOne));

        //14. Triming white spaces from front and end
        System.out.println("***************************");
        System.out.println("14. Triming white spaces from front and end");
        String s5 = new String("Hello          ");
        String s6 = new String("     Hello     ");
        String s7 = new String("     Hello       People       ");
        System.out.println("*" + s5.trim() + "*");
        System.out.println("*" + s6.trim() + "*");
        System.out.println("*" + s7.trim() + "*");

        //15. Replacing a Character
        System.out.println("*****************************");
        System.out.println("15. Replacing a character");
        System.out.println(name.replace('o', 'O'));
        System.out.println(name.replace("oo" , "OOOO"));

        
    }

         


}