Input : 
abc def ghi

Output : 
cba fed ihg

--------------------------

class Main {
    public static StringBuffer reverseIt(StringBuffer sb)
    {
        int i=0;
        int j=sb.length()-1;
        char temp;
        while(i<j)
        {
            temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return sb;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str = "abc def ghi";
        StringBuffer sb = new StringBuffer("");
        String result="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                result = result+" "+reverseIt(sb);
                sb.setLength(0);
                // OR sb=new StringBuffer("");
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        result = result+" "+reverseIt(sb);
        System.out.println(result);
    }
}