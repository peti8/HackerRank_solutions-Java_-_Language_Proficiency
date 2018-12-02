import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++)
            arr[i]=scan.nextInt();
        scan.close();

        boolean near2=false;
        boolean near4=false;
        for (int i=1; i<n; i++){
            if(arr[i-1]==arr[i]){
                if (arr[i]==2)
                    near2=true;
                else
                    if (arr[i]==4)
                        near4=true;
            }
        }
        if (near2!=near4)
            System.out.println("true");
        else System.out.println("false");
    }
}
