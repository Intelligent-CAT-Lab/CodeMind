import java.util.*;
import java.math.*;
public class p03989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 924844033;
        int rng = 2010;
        long[] fctr = new long[rng];
        long[] finv = new long[rng];
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
        }
        finv[1] = 1;
        for (int i = 2; i < rng; i++) {
            finv[i] = finv[i - 1] * i % mod;
        }
        long cmb(int n, int k) {
            if (n < 0 || k < 0) {
                return 0;
            } else {
                return fctr[n] * finv[n - k] * finv[k] % mod;
            }
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
                ans %= mod;
            }
            System.out.println(ans);
            return;
        }
        Map<Integer, Integer> dc = new HashMap<Integer, Integer>();
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
            if (dc.containsKey(cnt)) {
                dc.put(cnt, dc.get(cnt) + 2);
            } else {
                dc.put(cnt, 2);
            }
        }
        int nn = (n - k) * 2;
        Set<Integer> cp = new HashSet<Integer>();
        int cpp = 1;
        for (int i : dc.keySet()) {
            for (int j = 0; j < dc.get(i); j++) {
                cpp += i;
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
            if (i % 2 == 0) {
                ans += fctr[n - i] * dp[nn][i];
            } else {
                ans -= fctr[n - i] * dp[nn][i];
            }
            ans %= mod;
        }
        System.out.println(ans);
    }
}