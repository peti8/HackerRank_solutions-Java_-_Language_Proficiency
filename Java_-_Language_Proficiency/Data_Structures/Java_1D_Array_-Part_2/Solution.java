import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        return winnable(leap, game, 0);
        }
    
    public static boolean winnable(int leap, int[] game, int i){
        // i: the current position no. in array
        // checking requisits:
        if (i<0||game[i]==1)
            return false;
        if (i+leap>=game.length||i+1>=game.length)
            return true;
        // We have checked this pos. already. Preventing endless loop:
        game[i]=1;
        // Checking the possible movements recursively:
        if (winnable(leap,game,i+leap)||winnable(leap,game,i+1)||winnable(leap,game,i-1))
            return true;
        else 
            return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
