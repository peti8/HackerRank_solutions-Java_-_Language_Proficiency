import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
            return false;
        char[] chArrA = a.toLowerCase().toCharArray();
        char[] chArrB = b.toLowerCase().toCharArray();
        char temp=' ';
        for (int i=a.length()-1;i>0;i--)
            for (int j=0; j<i; j++)
                if (chArrA[j]>chArrA[j+1]){
                    temp=chArrA[j];
                    chArrA[j]=chArrA[j+1];
                    chArrA[j+1]=temp;
                }
        for (int i=b.length()-1;i>0;i--)
            for (int j=0; j<i; j++)
                if (chArrB[j]>chArrB[j+1]){
                    temp=chArrB[j];
                    chArrB[j]=chArrB[j+1];
                    chArrB[j+1]=temp;
                }
        boolean result = true;
        for (int i=0;i<a.length();i++)
            if (chArrA[i]!=chArrB[i]){
                result=false;
                break;
            }
        return result;
    }
        public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
