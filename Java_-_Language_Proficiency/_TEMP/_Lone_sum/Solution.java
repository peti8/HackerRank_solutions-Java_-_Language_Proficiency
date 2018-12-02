import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int sum=0;

        if ((a==b)&&(a==c))
            sum=0;
        else
            if (a==b)
                sum=c;
            else
                if (a==c)
                    sum=b;
                else
                    if (b==c)
                        sum=a;
                    else
                        sum=a+b+c;
        System.out.println(sum);
    }
}
