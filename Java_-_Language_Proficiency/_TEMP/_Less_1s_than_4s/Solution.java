import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int ones=0;
        int fours=0;
        for (int i=0; i<n; i++){
            arr[i]=scan.nextInt();
            if (arr[i]==1)
                ones++;
            if (arr[i]==4)
                fours++;
        }
        scan.close();
        boolean result=false;
        if (ones<fours)
            result=true;
        System.out.println(result);
    }
}
