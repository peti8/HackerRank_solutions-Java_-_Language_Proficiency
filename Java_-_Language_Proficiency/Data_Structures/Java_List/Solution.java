import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> AL = new ArrayList<Integer>();
        for (int i=0; i<N; i++)
            AL.add(i,scan.nextInt());
        int Q = scan.nextInt();
        for (int j=0; j<Q; j++){
            scan.nextLine();
            String QType = scan.nextLine();
            if (QType.equals("Insert")){
                int x = scan.nextInt();
                int y = scan.nextInt();
                AL.add(x,y);
            }
            else if (QType.equals("Delete")){
                int x = scan.nextInt();
                AL.remove(x);
            }
        }
        for (int item:AL)
            System.out.print(item+" ");
    }
}
