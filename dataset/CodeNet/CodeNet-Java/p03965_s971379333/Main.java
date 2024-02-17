/*
* Author. Silviase(@silviasetitech)
* For AtCoder
*/

import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == 'p') {
                    ans--;
                }
            } else {
                if (s.charAt(i) == 'g') {
                    ans++;
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }


    private static long gcd(Long m, long n) {
        if(m < n) {
            return gcd(n, m);
        }
        if(n == 0){
            return m;
        } 
        return gcd(n, m % n);
    }

    private static long[][] Combination_nCk(long n, long k) {
        n++; k++;
        long[][] ans = new long[(int)n][(int)k];
        for (int i = 0; i < n; i++) {
            ans[i][0] = 1;
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < k-1; j++) {
                if (i < j) {
                    ans[i][j] = 0;
                }else{
                    ans[i+1][j+1] = ans[i][j] + ans[i][j+1];
                }
            }
        }
        return ans;
    }
    private static double[][] Probability_nCk(int n, int k) {
        n++; k++;
        double[][] ans = new double[n][k];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[i][0] = 1;
            }else{
                ans[i][0] = ans[i-1][0]/2;
            }
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < k-1; j++) {
                if (i < j) {
                    ans[i][j] = 0;
                }else{
                    ans[i+1][j+1] = (ans[i][j] + ans[i][j+1])/2;
                }
            }
        }
        return ans;
    }
}