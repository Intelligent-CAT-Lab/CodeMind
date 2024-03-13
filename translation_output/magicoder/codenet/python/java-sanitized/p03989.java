import java.util.*;

public class p03989 {
    static int mod = 924844033;
    static int rng = 2010;
    static int[] fctr = new int[rng];
    static int[] finv = new int[rng];

    static void preprocess() {
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = (fctr[i - 1] * i) % mod;
            finv[i] = pow(fctr[i], mod - 2, mod);
        }
    }

    static int pow(int a, int b, int m) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = (res * a) % m;
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }

    static int cmb(int n, int k) {
        if (n < 0 || k < 0)
            return 0;
        else
            return (fctr[n] * finv[n - k] % mod * finv[k] % mod) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        preprocess();
        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            int ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0)
                    ans = (ans + cmb(x, i) * fctr[n - i]) % mod;
                else
                    ans = (ans - cmb(x, i) * fctr[n - i]) % mod;
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
                if (a > b)
                    b += 2 * k;
                else
                    a += 2 * k;
                cnt++;
            }
            dc.put(cnt, dc.getOrDefault(cnt, 0) + 2);
        }
        int nn = (n - k) * 2;
        Set<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (Map.Entry<Integer, Integer> entry : dc.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                cpp += entry.getKey();
                cp.add(cpp);
            }
        }
        cp.add(1);
        int[][] dp = new int[nn + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            System.arraycopy(dp[i - 1], 0, dp[i], 0, n + 1);
            if (!cp.contains(i)) {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] = (dp[i][j] + dp[i - 2][j - 1]) % mod;
                }
            } else {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % mod;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                ans = (ans + fctr[n - i] * dp[nn][i]) % mod;
            else
                ans = (ans - fctr[n - i] * dp[nn][i]) % mod;
        }
        System.out.println(ans);
    }
}