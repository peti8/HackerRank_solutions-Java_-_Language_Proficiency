import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = scan.nextInt();
        scan.close();
        boolean result=false;
        for (int i=2; i<n; i++) {
            if (arr[i] - arr[i - 2] <= 2) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
