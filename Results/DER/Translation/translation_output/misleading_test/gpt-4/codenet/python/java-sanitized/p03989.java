import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class p03989 {
    static final int mod = 924844033;
    static final int rng = 2010;
    static long[] fctr = new long[rng];
    static long[] finv = new long[rng];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        // Initialize factorials and modular inverses
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }
        for (int i = 1; i < rng; i++) {
            finv[i] = pow(fctr[i], mod - 2);
        }

        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            long ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += cmb(x, i) * fctr[n - i];
                } else {
                    ans -= cmb(x, i) * fctr[n - i];
                }
                ans = (ans + mod) % mod;
            }
            System.out.println(ans);
            return;
        }

        HashMap<Integer, Integer> dc = new HashMap<>();
        for (int j = 1; j <= k; j++) {
            int a = j;
            int b = k + j;
            int cnt = 0;
            while (a <= n && b <= n) {
                if (a > b) {
                    b += 2 * k;
                } else {
                    a += 2 * k;
                }
                cnt++;
            }
            dc.put(cnt, dc.getOrDefault(cnt, 0) + 2);
        }

        int nn = (n - k) * 2;
        HashSet<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (int i : dc.keySet()) {
            int x = dc.get(i);
            for (int j = 0; j < x; j++) {
                cpp += i;
                cp.add(cpp);
            }
        }
        cp.add(1);

        long[][] dp = new long[nn + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            System.arraycopy(dp[i - 1], 0, dp[i], 0, dp[i - 1].length);
            if (!cp.contains(i)) {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] += dp[i - 2][j - 1];
                    dp[i][j] %= mod;
                }
            } else {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] += dp[i - 1][j - 1];
                    dp[i][j] %= mod;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                ans += fctr[n - i] * dp[nn][i];
            } else {
                ans -= fctr[n - i] * dp[nn][i];
            }
            ans = (ans + mod) % mod;
        }
        System.out.println(ans);
    }

    private static long pow(long base, int exponent) {
        if (exponent == 0) return 1;
        long half = pow(base, exponent / 2);
        long result = half * half % mod;
        return (exponent % 2 == 0) ? result : result * base % mod;
    }

    private static long cmb(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            return 0;
        } else {
            return fctr[n] * finv[n - k] % mod * finv[k] % mod;
        }
    }
}