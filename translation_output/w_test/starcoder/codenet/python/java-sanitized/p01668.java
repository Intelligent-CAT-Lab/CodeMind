import java.util.*;
import java.io.*;

public class p01668 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int MOD = 1000000007;
        String[] s = in.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int l = Math.max(s[0].length(), s[1].length());
        int[] pw10 = new int[l+1];
        pw10[0] = 1;
        for (int i = 1; i <= l; i++) {
            pw10[i] = pw10[i-1] * 10 % MOD;
        }
        int calc(int x, int y) {
            int mod = 1000000009;
            int n = (int) Math.log10(x) + 1;
            int m = (int) Math.log10(y) + 1;
            if (n < m) return 0;
            int[] h = new int[m+1];
            for (int i = 0; i <= m; i++) {
                h[i] = (int) (h[i-1] * 37 % mod + y % mod) % mod;
            }
            int res = 0;
            int cur = 0;
            for (int i = 0; i < n; i++) {
                int v = x % 10;
                res = (res + cur * v * pw10[n - i - 1]) % mod;
                for (int j = i - m + 1; j <= i; j++) {
                    if (j + m > n) break;
                    int l = i - j;
                    if (l > 0 && (h[l]!= h[0] || v <= y % 10)) continue;
                    res = (res + pw10[n - j - m]) % mod;
                }
                if (m + i + 1 <= n) {
                    res = (res + v * pw10[n - m - i - 1] * (n - i - m + 1)) % mod;
                }
                if (i - m + 1 >= 0 && h[m] == h[0]) {
                    cur = (cur + 1) % mod;
                }
            }
            for (int j = 0; j < n - m + 1; j++) {
                if (h[0]!= h[m]) continue;
                res = (res + 1) % mod;
            }
            if (y == 0) {
                for (int i = 1; i < n; i++) {
                    res = (res - 9 * pw10[n - i - 1] * i) % mod;
                }
                res = (res - n + 1) % mod;
            }
            return res;
        }
        int ans = calc(b, c);
        if (a > 0) {
            ans = (ans - calc(a - 1, c)) % MOD;
        }
        System.out.println(ans);
    }
}