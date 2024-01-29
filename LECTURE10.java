class Students
{
    int roll; // Instance variable
    String name;
    static int count; // Static variable

    public Students(int a, String s)
    {
        this.roll = a;
        this.name = s;
        count++;
    }

    static void show()
    {
        System.out.println("Count value is "+count);
    }
}

class Lecture10
{
    public static void main(String o[])
    {
        Students Obj1 = new Students(5,"John");
        Students Obj2 = new Students(8,"Pant");
        Students Obj3 = new Students(9,"Gill");

        System.out.println(Students.count);
        Students.show();

    }
}