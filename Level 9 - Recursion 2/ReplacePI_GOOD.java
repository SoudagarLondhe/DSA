Given a String, replace all "pi" with "3.14"

e.g.
i/p: abcpi      o/p: abc3.14
i/p: depighpik  o/p: de3.14gh3.14k


----------------------------------------------
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void replaceIt(String str,int i,StringBuilder sb)
    {
        if(i >= str.length() )
        {
            return;
        }
        if( i+1<str.length() && str.substring(i,i+2).equals("pi"))
        {
            sb.append("3.14");
            // System.out.println("My String: "+sb);
            replaceIt(str,i+2,sb);
        }
        else
        {
            sb.append(str.charAt(i));
            // System.out.println("My String: "+sb);
            replaceIt(str,i+1,sb);
        }
    }
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        String str = "abcdpiefghijklmpil";
        StringBuilder sb=new StringBuilder();
        replaceIt(str,0,sb);
        System.out.println(sb);
    }
}