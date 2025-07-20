Factorial : 
n = 4
24

n=5
120


----------------------


class Main {
    
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}