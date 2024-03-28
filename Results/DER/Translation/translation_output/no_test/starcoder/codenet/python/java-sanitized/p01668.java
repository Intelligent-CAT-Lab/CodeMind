import java.util.*;
import java.io.*;

public class p01668 {
    public static void main(String[] args) {
        new Main().run();
    }

    class RollingHash {
        int[] pw;
        int[] h;
        int mod;
        public RollingHash(String s, int base, int mod) {
            this.mod = mod;
            pw = new int[s.length() + 1];
            h = new int[s.length() + 1];
            int v = 0;
            for (int i = 0; i < s.length(); i++) {
                h[i + 1] = v = (v * base + s.charAt(i)) % mod;
            }
            v = 1;
            for (int i = 0; i < s.length(); i++) {
                pw[i + 1] = v = v * base % mod;
            }
        }
        public int get(int l, int r) {
            return (h[r] - h[l] * pw[r - l]) % mod;
        }
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = sc.next();
        }
        int L = Math.max(s[0].length(), s[1].length());
        int[] pw10 = new int[L + 1];
        int r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = r * 10 % MOD;
        }
        RollingHash rh = new RollingHash(s[1], 37, MOD);
        int[] hY = new int[s[1].length() + 1];
        for (int i = 0; i <= s[1].length(); i++) {
            hY[i] = rh.get(0, i);
        }
        int ans = 0;
        int cur = 0;
        for (int i = 0; i < s[0].length(); i++) {
            int v = s[0].charAt(i) - '0';
            ans += cur * v * pw10[s[0].length() - (i + 1)] % MOD;
            for (int j = i - s[1].length() + 1; j <= i; j++) {
                if (j + s[1].length() > s[0].length()) {
                    break;
                }
                int l = i - j;
                if (l > 0 && rh.get(j, j + l)!= hY[l]) {
                    continue;
                }
                if (v <= s[1].charAt(i - j) - '0') {
                    continue;
                }
                ans += pw10[s[0].length() - (j + s[1].length())];
            }
            if (s[1].length() + (i + 1) <= s[0].length()) {
                ans += v * pw10[s[0].length() - (s[1].length() + i + 1)] * (s[0].length() - (i + 1) - s[1].length() + 1) % MOD;
            }
            if (i - s[1].length() + 1 >= 0 && rh.get(i - s[1].length() + 1, i + 1) == hY[s[1].length()]) {
                cur += 1;
            }
        }
        for (int j = 0; j < s[0].length() - s[1].length() + 1; j++) {
            if (rh.get(j, j + s[1].length())!= hY[s[1].length()]) {
                continue;
            }
            ans += 1;
        }
        if (s[1].equals("0")) {
            for (int i = 1; i < s[0].length(); i++) {
                ans -= 9 * pw10[s[0].length() - i - 1] * i % MOD;
            }
            ans -= s[0].length() - 1;
        }
        System.out.println(ans % MOD);
    }
}