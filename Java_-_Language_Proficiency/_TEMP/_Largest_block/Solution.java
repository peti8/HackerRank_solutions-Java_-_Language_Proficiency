import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        scan.close();
        int n = st.length();
        int equal = 0;
        int maxequal = 0;
        for (int i=1; i<n; i++) {
            if (st.charAt(i) == st.charAt(i - 1))
                equal++;
            else {
                if (equal>maxequal)
                    maxequal = equal;
                equal = 0;
            }
        }
        if (equal>maxequal)
            maxequal=equal;
        System.out.println(maxequal+1);
    }
}
