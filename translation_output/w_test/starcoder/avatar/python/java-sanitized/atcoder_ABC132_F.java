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
        for (int i = 1; i <= n; i++) {
            coef[i - 1] = (n / i) - (n / (i + 1));
        }
        int nn = coef.length;
        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        long ans = 0;
        for (int i = 0; i < nn; i++) {
            ans += dp[k][i];
            ans %= mod;
        }
        System.out.println ( ans );
    }
}