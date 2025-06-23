Push Zero to end

➡ A
2 0 0 1 3 0 0

➡ Ans
2 1 3 0 0 0 0

📄 Relative order of non zero number should remain same

--------------------------------------

// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0,temp;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                //swap arr i,j
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                j++;
            }
          
        }
    }
}

----------------------------------------

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
          int arr[] = {2,0,0,1,3,0,0};
          int j=-1,temp;
        for(int i=0;i<arr.length;i++)
        {
            // System.out.println(arr[i]);
            if(arr[i]==0)
            {
                if(j==-1)
                {
                     j=i;
                }
            }
            else
            {
                if(j==-1)
                {
                    
                }
                else
                {
                    //swap arr i, j 
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
            }
        }
    }
}