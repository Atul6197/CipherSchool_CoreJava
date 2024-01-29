class Student
{
    String name;
    int marks;
    boolean result(int mark)
    {
        if(mark<60) return false;
        else return true;
    }
}

class Lecture8
{
    public int findGreatest(int a, int b,int c)
    {
        if(a>b)
        {
            if(a>c) return a;
            else return c;
        }
        else
        {
            if(b>c) return b;
            else return c;
        }
    }

    public static void main(String re[])
    {
        Student obj = new Student();
        obj.marks = 78;
        obj.name = "John";
        System.out.println(obj.marks+" "+obj.name);
        System.out.println(obj.result(obj.marks));

        Lecture8 lec = new Lecture8();
        System.out.println(lec.findGreatest(3,6,1));


        char c = 'b';
        switch(c)
        {
            case 'a':
                {
                    System.out.println("This is A");
                    break;
                }
            case 'b':
                {
                    System.out.println("This is B");
                    break;
                }
            case 'c':
                {
                    System.out.println("This is C");
                    break;
                }
            default:
                {
                    System.out.println("Other than A,B,C");
                    break;
                }
        }

    }
}