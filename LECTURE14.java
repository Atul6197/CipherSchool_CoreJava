interface Aaa
{
    int var = 90;
    void func();
}
interface Bbb
{
    int var = 44;
    void func();
}

interface Ccc extends Aaa,Bbb    // Multiple inheritance
{
    int var = 83;
    void func();
}

class Sample implements Ccc
{
    public void func()
    {
        System.out.println("In class C");
    }
}

class Lecture14
{
    public static void main(String t[])
    {
        Sample obj = new Sample();
        obj.func();
    }
}