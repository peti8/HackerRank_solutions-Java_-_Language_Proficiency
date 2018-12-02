import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i]=scan.nextInt();
        scan.close();
        boolean decr = true;
        for (int i=1; i<n; i++)
            if (arr[i]>arr[i-1]){
                decr = false;
                break;
            }
        System.out.println(decr);
    }
}
