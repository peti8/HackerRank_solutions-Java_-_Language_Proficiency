import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        sc.close();
        int lt = A.length();
        String result="Yes";
        for (int i=0; i<=(lt/2)-1; i++)
            if(A.charAt(i)!=A.charAt(lt-i-1)){
                result="No";
                break;
            }
        System.out.println(result);
    }
}
