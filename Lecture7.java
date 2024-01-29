import java.util.*;

class Lecture7
{
    class Student
    {
        int roll;
        String name;
        public Student(int a, String b)
        {
            this.roll = a;
            this.name = b;
        }
    }

    public static void main(String yt[])
    {
        
        Student obj = new Lecture7().new Student(67,"Robert");
        System.out.println(obj.roll+" "+obj.name);

    }
}