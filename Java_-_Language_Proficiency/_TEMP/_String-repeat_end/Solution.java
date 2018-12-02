import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = scan.nextInt();
        scan.close();
        String part=s.substring(s.length()-n,s.length());

        for (int i=1; i<=n+1; i++)
            System.out.print(part);    
    }
}
