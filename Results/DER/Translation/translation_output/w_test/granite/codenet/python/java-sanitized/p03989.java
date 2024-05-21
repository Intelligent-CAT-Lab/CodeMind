import java.util.*;

public class p03989 {
    static int MOD = 924844033;
    static int RNG = 2010;
    static int[] fctr = new int[RNG];
    static int[] finv = new int[RNG];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < RNG; i++) {
            fctr[i] = (int) ((long) fctr[i - 1] * i % MOD);
            finv[i] = pow(fctr[i], MOD - 2);
        }
        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            int ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += cmb(x, i) * fctr[n - i];
                } else {
                    ans -= cmb(x, i) * fctr[n - i];
                }
                ans %= MOD;
            }
            System.out.println(ans);
            return;
        }
        Map<Integer, Integer> dc = new HashMap<>();
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
        Set<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (Map.Entry<Integer, Integer> entry : dc.entrySet()) {
            for (int j = 0; j < entry.getValue(); j++) {
                cpp += entry.getKey();
                cp.add(cpp);
            }
        }
        cp.add(1);
        int[][] dp = new int[nn + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            dp[i] = Arrays.copyOf(dp[i - 1], n + 1);
            if (!cp.contains(i)) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] += dp[i - 2][j - 1];
                    dp[i][j] %= MOD;
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] += dp[i - 1][j - 1];
                    dp[i][j] %= MOD;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                ans += fctr[n - i] * dp[nn][i];
            } else {
                ans -= fctr[n - i] * dp[nn][i];
            }
            ans %= MOD;
        }
        System.out.println(ans);
    }

    static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        }
        return (int) ((long) fctr[n] * finv[n - k] % MOD * finv[k] % MOD);
    }

    static int pow(int a, int b) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (int) ((long) res * a % MOD);
            }
            a = (int) ((long) a * a % MOD);
            b /= 2;
        }
        return res;
    }
}