import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
            for (int i=0; i<n; i++) {
                int d = scan.nextInt();
                ArrayList<Integer> row = new ArrayList<Integer>();
                for (int j = 0; j < d; j++) {
                    Integer k = scan.nextInt();
                    row.add(k);
                }
                rows.add(row);
            }
            int q=scan.nextInt();
            for (int i=0; i<q; i++){
                int x=scan.nextInt();
                int y=scan.nextInt();
                try {
                    System.out.println(rows.get(x-1).get(y-1));
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("ERROR!");
                }
            }
        }    
}
