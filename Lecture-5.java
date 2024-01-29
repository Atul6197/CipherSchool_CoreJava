import java.util.*;

class Lecture5
{
    public static void main(String ar[])
    {
        int x = 6;
        int y = 9;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);

        byte b = 8;
        System.out.println("b = "+b);
        //Typecasting

        byte c = (byte) 131;
        System.out.println("c = "+c);

        int i = c;
        System.out.println("i = "+i);

        float f = (float) 6.45;
        System.out.println("f = "+f);

        // Increment and Decrement operators
        int m = 8;
        int n = ++m;
        System.out.println("n value is = "+n);

        int p = 8;
        int q = ++p;
        System.out.println("q value is = "+q);


    }
}