import java.util.*;

public class p03989 {
    static int mod = (int)924844033e9;
    static int rng = 2010;
    static long[] fctr = new long[rng];
    static long[] finv = new long[rng];

    static void precompute() {
        fctr[0] = 1;
        finv[0] = 1;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i-1]*i%mod;
            finv[i] = pow(fctr[i], (int)(mod-2));
        }
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    static long cmb(int n, int k) {
        if (n < 0 || k < 0)
            return 0;
        else
            return fctr[n]*finv[n-k]%mod*finv[k]%mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        precompute();
        if ((n-k)*2 <= n) {
            int x = (n-k)*2;
            long ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0)
                    ans = (ans + cmb(x,i)*fctr[n-i]) % mod;
                else
                    ans = (ans - cmb(x,i)*fctr[n-i] + mod) % mod;
            }
            System.out.println(ans);
            System.exit(0);
        }
        Map<Integer, Integer> dc = new HashMap<>();
        for (int j = 1; j <= k; j++) {
            int a = j;
            int b = k+j;
            int cnt = 0;
            while (a <= n && b <= n) {
                if (a > b)
                    b += 2*k;
                else
                    a += 2*k;
                cnt++;
            }
            dc.put(cnt, dc.getOrDefault(cnt, 0) + 2);
        }
        int nn = (n-k)*2;
        Set<Integer> cp = new HashSet<>();
        cp.add(1);
        long[][] dp = new long[nn+1][n+1];
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            dp[i] = Arrays.copyOf(dp[i-1], dp[i].length);
            if (!cp.contains(i)) {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] = (dp[i][j] + dp[i-2][j-1]) % mod;
                }
            } else {
                for (int j = 1; j <= Math.min(i, n); j++) {
                    dp[i][j] = (dp[i][j] + dp[i-1][j-1]) % mod;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                ans = (ans + fctr[n-i]*dp[nn][i]) % mod;
            else
                ans = (ans - fctr[n-i]*dp[nn][i] + mod) % mod;
        }
        System.out.println(ans);
    }
}