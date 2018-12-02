import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        int testlth = n;
        int helpnum = 0;
        int mirrorlth = 1;
        boolean eq = true;
        int farPiecesCt = 0;
        int maxFarPiecesCt = 0;

        lab0:while (testlth >= 2) {
            for (int k = 0; k <= helpnum; k++) {
                for (int j = 0; j < testlth / 2; j++)
                    if (arr[j + k] == arr[testlth - j - 1 + k])
                        farPiecesCt+=1;
                    else {
                        eq = false;
                        break;
                    }
                if (eq == true) {
                    mirrorlth = testlth;
                    break lab0;
                }
                if (farPiecesCt>maxFarPiecesCt)
                    maxFarPiecesCt=farPiecesCt;
                farPiecesCt=0;
                eq = true;
            }
            testlth -= 1;
            helpnum += 1;
        }
        System.out.println(Math.max(mirrorlth,maxFarPiecesCt));
    }
}
