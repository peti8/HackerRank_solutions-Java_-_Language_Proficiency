import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        // String delimiters="[ !,?._'@]+";
        String delimiters = "[^A-Za-z]+";
        String[] tokens = s.split(delimiters);
        int n = tokens.length;
        System.out.println(n);
        for (int i = 0; i < n; i++)
            System.out.println(tokens[i]);
        scan.close();
    }
}