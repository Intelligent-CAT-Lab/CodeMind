import java.util.*;

public class p02636 {
    static int MOD = 998244353;
    static int[][][] dp;
    static int[][][] dpf;
    static int[] fact;
    static int[] inv;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        dp = new int[n][n+1][n+1];
        dpf = new int[n][n+1][n+1];
        fact = new int[2*n+1];
        inv = new int[2*n+1];
        fact[0] = 1;
        inv[0] = 1;
        for (int i = 1; i <= 2*n; i++) {
            fact[i] = (int) ((long) fact[i-1] * i % MOD);
            inv[i] = modInverse(fact[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = -1;
                    dpf[i][j][k] = -1;
                }
            }
        }
        int ans = solve(s, n-1, 0, 0);
        System.out.println(ans);
    }

    static int solve(String s, int i, int j, int k) {
        if (i < 0) {
            if (j == 0 && k == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (dp[i][j][k]!= -1) {
            return dp[i][j][k];
        }
        int a = s.charAt(i) - '0';
        int b = 1 - a;
        int ans = 0;
        ans = Math.max(ans, solve(s, i-1, j+a, k+b) - 2);
        ans = Math.max(ans, dpf(s, i-1, j+a, k+b) - 1);
        ans = Math.max(ans, 2 * (dpf(s, i-2, j+b, k+b) / 2));
        ans = Math.max(ans, 2 * (solve(s, i-2, j+b, k+b) / 2));
        return dp[i][j][k] = ans;
    }

    static int dpf(String s, int i, int j, int k) {
        if (i < 0) {
            if (j == 0 && k == 0) {
                return i + 1;
            } else {
                return 0;
            }
        }
        if (dpf[i][j][k]!= -1) {
            return dpf[i][j][k];
        }
        int a = s.charAt(i) - '0';
        int b = 1 - a;
        int ans = 0;
        ans = Math.max(ans, dpf(s, i-1, j+a, k+b) + 1);
        ans = Math.max(ans, solve(s, i-1, j+a, k+b) + 1 - solve(s, i-1, j+a, k+b) % 2);
        return dpf[i][j][k] = ans;
    }

    static int nCr(int n, int r) {
        if (n < r || r < 0) {
            return 0;
        }
        return (int) ((long) fact[n] * inv[r] % MOD * inv[n-r] % MOD);
    }

    static int modInverse(int a) {
        a %= MOD;
        for (int x = 1; x < MOD; x++) {
            if ((a * x) % MOD == 1) {
                return x;
            }
        }
        return 1;
    }
}