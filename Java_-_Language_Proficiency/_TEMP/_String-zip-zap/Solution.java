import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String st=scan.nextLine();
        scan.close();

        for (int i=0; i<st.length(); i++)
            if (st.charAt(i)!='z')
                System.out.print(st.charAt(i));
            else
                if (st.charAt(i+2)=='p') {
                    System.out.print(st.charAt(i));
                    System.out.print(st.charAt(i+2));
                    i+=2;
                }
                else
                    System.out.print(st.charAt(i));
    }
}
