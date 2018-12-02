import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest=s.substring(0,k);
        String largest=s.substring(0,k);
        String temp = "";
        for (int i=0; i<=s.length()-k; i++) {
            temp = s.substring(i, i + k);
            //looking for smallest
            for (int j = 0; j < k; j++) {
                if (smallest.charAt(j) != temp.charAt(j))
                    if (smallest.charAt(j) < temp.charAt(j))
                        break;
                    else {
                        smallest = temp;
                        break;
                    }
            }
            // looking for longest
            for (int j = 0; j < k; j++) {
                if (largest.charAt(j) != temp.charAt(j))
                    if (largest.charAt(j) > temp.charAt(j))
                        break;
                    else {
                        largest = temp;
                        break;
                    }
            }
        }
        return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
