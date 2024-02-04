class TimeComplexity
{
    static boolean isPrimeRam(int n)
    {
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2; i<n ;i++)
        {
            if(n%i == 0) return false;
        }
        return true;
    }

    static boolean isPrimeSham(int n)
    {
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2; i<=Math.sqrt(n) ;i++)
        {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        int n = 999999999;
        long start = System.currentTimeMillis();//note time before function executed
        System.out.println(isPrimeRam(n));
        long end = System.currentTimeMillis();//note time after function executed
        System.out.println("Time by RAM's approach: "+ (end*start));//this is the time taken by the function
        
        start = System.currentTimeMillis();//note time before function executed
        System.out.println(isPrimeSham(n));
        end = System.currentTimeMillis();//note time after function executed
        System.out.println("Time by SHAM's approach: "+ (end*start));//this is the time taken by the function


    
    }
}