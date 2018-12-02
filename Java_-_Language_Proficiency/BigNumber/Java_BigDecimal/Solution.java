import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for (int i = n - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                BigDecimal x = new BigDecimal(s[j]);
                BigDecimal y = new BigDecimal(s[j + 1]);
                // if s[j]<s[j+1]:
                if (x.compareTo(y) == -1) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}