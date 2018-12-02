import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++)
            arr[i]=scan.nextInt();
        scan.close();

        boolean diff = true;
        int count3=0;
        if (arr[0]==3)
            count3=1;
        for (int i=1; i<n; i++){
            if (arr[i]==3){
                count3++;
                if (arr[i]==arr[i-1]){
                    diff=false;
                    break;
                }
            }
        }
        if (diff&&(count3==3))
            System.out.println(false);
        else
            System.out.println(true);
    }
}
