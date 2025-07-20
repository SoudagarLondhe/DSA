Sum of N Natural numbers :
n=4, 1+2+3+4  o/p : 10
n=5, 1+2+3+4+5 0/p : 15

----------------------------

More Optimized is using formula N*(N+1)/2
----------------------------

class Main {
    
    public static int sumn(int n)
    {
       if(n==0)
       {
           return 0;
       }
       return n+sumn(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumn(10));
    }
}