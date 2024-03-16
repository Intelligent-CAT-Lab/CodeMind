import java.util.*;
import java.io.*;

public class p03989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 924844033;
        int rng = 2010;

        List<Integer> fctr = new ArrayList<>();
        List<Integer> finv = new ArrayList<>();
        fctr.add(1);
        finv.add(1);

        for (int i = 1; i < rng; i++) {
            fctr.add((int) ((long) fctr.get(i - 1) * i % mod));
        }

        for (int i = 1; i < rng; i++) {
            finv.add(pow(fctr.get(i), mod - 2, mod));
        }

        int ans;

        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += cmb(x, i, fctr, finv, n) * fctr.get(n - i);
                } else {
                    ans -= cmb(x, i, fctr, finv, n) * fctr.get(n - i);
                }
                ans %= mod;
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
                cnt += 1;
            }
            dc.put(cnt, dc.getOrDefault(cnt, 0) + 2);
        }

        int nn = (n - k) * 2;
        Set<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (Map.Entry<Integer, Integer> entry : dc.entrySet()) {
            int i = entry.getKey();
            int x = entry.getValue();
            for (int j = 0; j < x; j++) {
                cpp += i;
                cp.add(cpp);
            }
        }
        cp.add(1);

        int[][] dp = new int[nn + 1][n + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= nn; i++) {
            dp[i] = Arrays.copyOf(dp[i - 1], n + 1);
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

        ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                ans += fctr.get(n - i) * dp[nn][i];
            } else {
                ans -= fctr.get(n - i) * dp[nn][i];
            }
            ans %= mod;
        }

        System.out.println(ans);
    }

    static int cmb(int n, int k, List<Integer> fctr, List<Integer> finv, int mod) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return (int) ((long) fctr.get(n) * finv.get(n - k) % mod * finv.get(k) % mod);
        }
    }

    static int pow(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (int) ((long) result * base % mod);
            }
            base = (int) ((long) base * base % mod);
            exp /= 2;
        }
        return result;
    }
}