import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh){
        HashMap<String, Integer> HM = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            int number = scan.nextInt();
            scan.nextLine();
            HM.put(name, number);
        }
        while (scan.hasNextLine()) {
            String q = scan.nextLine();
            if (HM.containsKey(q)) {
                System.out.println(q + "=" + HM.get(q));
            } else
                System.out.println("Not found");
        }
        scan.close();
	}
}
