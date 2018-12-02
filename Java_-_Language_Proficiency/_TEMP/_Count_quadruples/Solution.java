import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        String st = in.next();
        int n = st.length();
        int equals = 0;
        int qrs = 0;
        char prev=st.charAt(0);
        for(int i=1;i<n;i++){
            if (prev!=(st.charAt(i))){
                if (equals>=3) {
                    qrs = qrs + (equals - 2);
                    equals = 0;
                }
            } else ++equals;
            prev = st.charAt(i);
        }
        if (equals>=3)
            qrs=qrs+(equals-2);
        System.out.println(qrs);
    }
}
