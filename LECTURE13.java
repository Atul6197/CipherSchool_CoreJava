interface Shape
{
    double pi = 3.14; // public static final
    int a = 10;
    double getSquare(double r); // public and abstract
}

interface Square
{
    int side = 8;
    int a = 89;
    double getSquare();
}

class Circle implements Shape,Square
{
    public double getSquare(double r)
    {
        return r*r;
    }
    public double getSquare()
    {
        System.out.println(side*side);
        return 0;
    }
    void func()
    {
        System.out.println("Circle class");
    }
}

class Lecture13
{
    public static void main(String r[])
    {
        Circle obj = new Circle();
        System.out.println(obj.getSquare(8.2));
        System.out.println(obj.getSquare());
        System.out.println(Square.a); // Calling the variable using static reference
        obj.func();
    }
}