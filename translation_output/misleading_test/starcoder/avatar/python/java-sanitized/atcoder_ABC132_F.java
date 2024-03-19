import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ( );
        int k = sc.nextInt ( );
        int mod = (int) ( 1e9 + 7 );
        int[] coef = new int[n];
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            coef[i - 1] = (n / i) - (n / (i + 1));
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += coef[i];
        }
        int[] dp = new int[k + 1];
        dp[0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = n - 1; j >= 0; j--) {
                tmp += dp[i - 1] * coef[j];
                tmp %= mod;
                dp[i] += tmp;
                dp[i] %= mod;
            }
        }
        System.out.println ( dp[k] );
    }
}