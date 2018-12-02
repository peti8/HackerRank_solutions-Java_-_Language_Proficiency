import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        System.out.println(A.length()+B.length());
        
        int minLt=Math.min(A.length(), B.length());
        boolean ALarger = false;
        for (int i=0; i<minLt; i++){
            if (A.charAt(i)==B.charAt(i))
            continue;
            if (A.charAt(i)>B.charAt(i))
                ALarger=true;
            break;
            }
        System.out.println(ALarger?"Yes":"No");
        
        System.out.print(A.substring(0,1).toUpperCase());
        for (int i=1; i<A.length(); i++)
            System.out.print(A.charAt(i));
        System.out.print(" ");
        System.out.print(B.substring(0,1).toUpperCase());
        for (int i=1; i<B.length(); i++)
            System.out.print(B.charAt(i));
    }
}