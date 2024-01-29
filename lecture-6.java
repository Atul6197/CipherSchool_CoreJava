import java.util.*;

class Lecture6
{
    int roll;
    String name;
    public Student(int a, String b)
    {
        this.roll = a;
        this.name = b;
    }
}

class Lecture6
{
    public static void main(String yt[])
    {
        // Character to integer
        char c = 'U';
        int a = Character.getNumericValue(c);
        System.out.println("Integer value of Character "+c+" is "+a);

        char c2 = 'i';
        System.out.println('a'- c2);

        // Creating an instance of Student class

        Student obj = new Student(67,"Robert");
        System.out.println(obj.roll+" "+obj.name);

    }
}