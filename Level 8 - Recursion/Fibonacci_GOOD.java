Given n, return the nth fibonacci number 


Example : 
n=0,  o/p: 0
n=1,  o/p: 1
n=4,  o/p: 3
n=6,  o/p: 5


----------------------------

// Always think in a way that as accorinding to Principal of MAthematical Induction : 
// If we make code correct for base cases then any nth term can be calculated.
// But here as we need last 2 term to calculate fibonacci, we have to have to handle the base cases for
// that last two terms, 
// And once base cases are satisfied we can calculate any general term using f(n)=f(n-1)+f(n-2)



class Main {
    public static int fibo(int n)
    {
       if(n==1)
       {
           return 0;
       }
       
       if(n==2)
       {
           return 1;
       }
       
       int fn = fibo(n-1);
       int sn = fibo(n-2);
       return fn+sn;
    }
    public static void main(String[] args) {
        System.out.println(fibo(3));
        // fibo(6);
    }
}

