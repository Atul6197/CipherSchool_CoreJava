abstract class Car // abstract class makes the child class to forcely override the methods
{
    int speed;
    abstract void accelerate();
    abstract void brake();
}

abstract class Benz extends Car // this class can either override the parent class methods or leave it to it's child class to override
{
    
}

class BMW extends Benz
{
    void brake()
    {
        System.out.println("Brakes are applied");
    }
    void accelerate()
    {
        System.out.println("Acceleration.......");
    }
}

class Lecture12
{
    public static void main(String d[])
    {
        BMW obj = new BMW();
        obj.accelerate();
        obj.brake();
    } 
}