import java.util.*;
import java.io.*;

public class p02635 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S_K = br.readLine().split(" ");
        String S = S_K[0];
        int K = Integer.parseInt(S_K[1]);
        K = Math.min(K, 300);
        int mod = 998244353;
        int[] a = new int[S.length()];
        int val = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                a[i] = val;
                val = 0;
            } else {
                val++;
            }
        }
        if (val!= 0) {
            a[S.length() - 1] = val;
        }
        int m = a.length;
        K = Math.min(Arrays.stream(a).sum(), K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];

        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }

        int[] b = new int[m + 1];
        int[] c = new int[m + 1];
        for (int i = 1; i <= m; i++) {
            b[i] = a[i - 1] + b[i - 1];
        }
        for (int i = m - 1; i >= 1; i--) {
            c[i] = a[i] + c[i + 1];
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= K; k++) {
                for (int j = 0; j <= Math.min(K, k + c[i]); j++) {
                    int M = Math.max(k - j, -a[i]);
                    dp[i][j][k] = (int) ((long) dp[i + 1][j + l][k] * (b[i + 1] - b[i]) % mod + (long) dp[i + 1][j][k + l] * (c[i + 1] - c[i]) % mod) % mod;
                }
            }
        }

        System.out.println(dp[0][0][0]);
    }
}