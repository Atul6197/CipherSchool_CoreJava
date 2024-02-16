class RecursionStudy {
    static void printDescending(int n)
    {
        //Base Condition
        if(n<1) return;
        System.out.println(n);
        printDescending(n-1);
    }

    public static void main(String [] args)
    {
        int n = 5;
        printDescending(n);
    }
}