import java.util.*;

public class p03989 {
    static int mod = 924844033;
    static int rng = 2010;
    static int[] fctr = new int[rng];
    static int[] finv = new int[rng];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Arrays.fill(fctr, 1);
        Arrays.fill(finv, 1);
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1] * i % mod;
            finv[i] = pow(fctr[i], mod - 2, mod);
        }

        int ans = cmb(n, k);
        if ((n - k) * 2 <= n) {
            ans = 0;
            for (int i = 1; i <= (n - k) * 2; i++) {
                if (i % 2 == 0) {
                    ans += cmb(n - k, i) * fctr[n - i];
                } else {
                    ans -= cmb(n - k, i) * fctr[n - i];
                }
                ans %= mod;
            }
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
            for (int i = entry.getKey(); i <= entry.getValue(); i++) {
                cpp += entry.getKey();
                cp.add(cpp);
            }
            cp.add(1);
        }

        int[][] dp = new int[nn + 1][n + 1];
        Arrays.fill(dp[0], new int[]{1});
        for (int i = 1; i <= nn; i++) {
            Arrays.fill(dp[i], Arrays.copyOf(dp[i - 1], n + 1));
            if (!cp.contains(i)) {
                for (int j = 1; j <= min(i, n); j++) {
                    dp[i][j] += dp[i - 2][j - 1];
                    dp[i][j] %= mod;
                }
            } else {
                for (int j = 1; j <= min(i, n); j++) {
                    dp[i][j] += dp[i - 1][j - 1];
                    dp[i][j] %= mod;
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans += fctr[n - i] * dp[nn][i];
            } else {
                ans -= fctr[n - i] * dp[nn][i];
            }
            ans %= mod;
        }
        System.out.println(ans);
    }

    static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr[n] * finv[n - k] * finv[k];
        }
    }

    static int pow(int a, int b, int mod) {
        int res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}