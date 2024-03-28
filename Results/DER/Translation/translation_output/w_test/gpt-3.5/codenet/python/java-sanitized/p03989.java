import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class p03989 {
    static final long mod = 924844033;
    static final int rng = 2010;
    static long[] fctr = new long[rng];
    static long[] finv = new long[rng];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        initializeFactorials();

        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            long ans = 0;
            for (int i = 0; i <= x; i++) {
                ans += (i % 2 == 0) ? cmb(x, i) * fctr[n - i] : -cmb(x, i) * fctr[n - i];
                ans %= mod;
            }
            System.out.println(ans);
            System.exit(0);
        }

        HashMap<Integer, Integer> dc = new HashMap<>();
        for (int j = 1; j <= k; j++) {
            int a = j;
            int b = k + j;
            int cnt = 0;
            while (a <= n && b <= n) {
                if (a > b) b += 2 * k;
                else a += 2 * k;
                cnt++;
            }
            dc.put(cnt, dc.getOrDefault(cnt, 0) + 2);
        }

        int nn = (n - k) * 2;
        HashSet<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (int x : dc.values()) {
            for (int j = 0; j < x; j++) {
                cpp += x;
                cp.add(cpp);
            }
        }
        cp.add(1);
        long[][] dp = new long[nn + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            dp[i] = dp[i - 1].clone();
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
            ans += (i % 2 == 0) ? fctr[n - i] * dp[nn][i] : -fctr[n - i] * dp[nn][i];
            ans %= mod;
        }
        System.out.println(ans);
    }

    static void initializeFactorials() {
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = (fctr[i - 1] * i) % mod;
        }
        for (int i = 1; i < rng; i++) {
            finv[i] = pow(fctr[i], mod - 2, mod);
        }
    }

    static long cmb(int n, int k) {
        if (n < 0 || k < 0) return 0;
        else return (fctr[n] * finv[n - k] % mod) * finv[k] % mod;
    }

    static long pow(long base, int exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}