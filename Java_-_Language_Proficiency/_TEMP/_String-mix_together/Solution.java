import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        scan.close();
        int maxLth=Math.max(a.length(),b.length());
        for (int i=0; i<maxLth; i++){
            if (b.length()>i)
                System.out.print(b.charAt(i));
            if (a.length()>i)
                System.out.print(a.charAt(i));
        }
    }
}
