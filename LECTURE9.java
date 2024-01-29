// we cant inherit multiple classes but we can inherit multiple interfaces 
class A
{
    int a;
    public void funcA()
    {
        System.out.println("In class A");
    }
}

interface C
{
    public void funcC();
}

class B extends A implements C
{
    int b;
    public void funcB()
    {
        System.out.println("In class B");
    }

    @Override
    public void funcC()
    {
        System.out.println("In class C");
    }
}

class Lecture9
{
    public static void main(String u[])
    {
        B obj = new B();
        obj.funcB();
        obj.funcA();
        obj.funcC();
    }
}