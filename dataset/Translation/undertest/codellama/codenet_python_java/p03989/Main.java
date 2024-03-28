import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class p03989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 924844033;
        int rng = 2010;
        int[] fctr = new int[rng];
        int[] finv = new int[rng];
        for (int i = 1; i < rng; i++) {
            fctr[i] = (fctr[i - 1] * i) % mod;
            finv[i] = (int) Math.pow(fctr[i], mod - 2) % mod;
        }
        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            int ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += (fctr[x] * finv[x - i] * finv[i]) % mod;
                } else {
                    ans -= (fctr[x] * finv[x - i] * finv[i]) % mod;
                }
                ans %= mod;
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
        Set<Integer> cp = new HashSet<>();
        int cpp = 1;
        for (int i : dc.keySet()) {
            for (int j = 0; j < dc.get(i); j++) {
                cpp += i;
                cp.add(cpp);
            }
        }
        cp.add(1);
        int[][] dp = new int[nn + 1][n + 1];
        for (int i = 0; i <= nn; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = 0;
            }
        }
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            for (int j = 1; j <= n; j++) {
                if (!cp.contains(i)) {
                    dp[i][j] += dp[i - 2][j - 1];
                    dp[i][j] %= mod;
                } else {
                    dp[i][j] += dp[i - 1][j - 1];
                    dp[i][j] %= mod;
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans += (fctr[n - i] * dp[nn][i]) % mod;
            } else {
                ans -= (fctr[n - i] * dp[nn][i]) % mod;
            }
            ans %= mod;
        }
        System.out.println(ans);
    }
}