import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p03989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 924844033;
        int rng = 2010;
        ArrayList<Integer> fctr = new ArrayList<Integer>();
        ArrayList<Integer> finv = new ArrayList<Integer>();
        for (int i = 0; i < rng; i++) {
            fctr.add(i, 1);
            finv.add(i, 1);
        }
        for (int i = 1; i < rng; i++) {
            fctr.set(i, fctr.get(i - 1) * i % mod);
            finv.set(i, pow(fctr.get(i), mod - 2, mod));
        }
        if ((n - k) * 2 <= n) {
            int x = (n - k) * 2;
            int ans = 0;
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 0) {
                    ans += cmb(x, i) * fctr.get(n - i) % mod;
                } else {
                    ans -= cmb(x, i) * fctr.get(n - i) % mod;
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
            dc.put(cnt, dc.getOrDefault(cnt, 0) + 2);
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
        int[][] dp = new int[nn + 1][n + 1];
        for (int i = 0; i <= nn; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = 0;
            }
        }
        dp[0][0] = 1;
        for (int i = 1; i <= nn; i++) {
            if (!cp.contains(i)) {
                for (int j = 1; j <= min(i, n); j++) {
                    dp[i][j] += dp[i - 2][j - 1] % mod;
                }
            } else {
                for (int j = 1; j <= min(i, n); j++) {
                    dp[i][j] += dp[i - 1][j - 1] % mod;
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans += fctr.get(n - i) * dp[nn][i] % mod;
            } else {
                ans -= fctr.get(n - i) * dp[nn][i] % mod;
            }
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return fctr.get(n) * finv.get(n - k) * finv.get(k) % mod;
        }
    }
}