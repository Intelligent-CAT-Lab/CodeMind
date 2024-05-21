import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class p01668 {
    static final int MOD = 100000009;
    static final int BASE = 10;

    static class RollingHash {
        int[] h, pw;
        int mod;

        RollingHash(String s, int base, int mod) {
            this.mod = mod;
            pw = new int[s.length() + 1];
            h = new int[s.length() + 1];
            int v = 0;
            for (int i = 0; i < s.length(); i++) {
                h[i + 1] = v = (int) ((v * (long) base + s.charAt(i)) % mod);
            }
            v = 1;
            for (int i = 0; i < s.length(); i++) {
                pw[i + 1] = v = (int) (v * (long) base % mod);
            }
        }

        int get(int l, int r) {
            return (h[r] - (int) ((h[l] * (long) pw[r - l]) % mod) + mod) % mod;
        }
    }

    static int solve(String A, String B, String C) {
        int L = Math.max(A.length(), B.length());
        int[] pw10 = new int[L + 1];
        pw10[0] = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = (int) ((pw10[i - 1] * (long) BASE) % MOD);
        }
        RollingHash hx = new RollingHash(A, BASE, MOD);
        RollingHash hy = new RollingHash(B, BASE, MOD);
        int[] hY = new int[C.length() + 1];
        for (int i = 0; i < C.length(); i++) {
            hY[i + 1] = hy.get(0, i + 1);
        }
        int res = 0, cur = 0;
        for (int i = 0; i < A.length(); i++) {
            int v = A.charAt(i) - '0';
            res = (int) ((res + (long) cur * v * pw10[A.length() - i - 1]) % MOD);
            for (int j = i - B.length() + 1; j <= i; j++) {
                if (j + B.length() > A.length()) {
                    break;
                }
                int l = i - j;
                if ((l > 0 && hx.get(j, j + l)!= hY[l]) || v < C.charAt(i - j) - '0') {
                    continue;
                }
                res = (int) ((res + pw10[A.length() - (j + B.length())]) % MOD);
            }
            if (i - B.length() + 1 >= 0 && hx.get(i - B.length() + 1, i + 1) == hY[B.length()]) {
                cur++;
            }
        }
        for (int j = 0; j <= A.length() - B.length(); j++) {
            if (hx.get(j, j + B.length()) == hY[B.length()]) {
                res = (res + 1) % MOD;
            }
        }
        if (C.equals("0")) {
            for (int i = 1; i < A.length(); i++) {
                res = (int) ((res - (long) 9 * pw10[A.length() - i - 1] * i) % MOD);
            }
            res = (int) ((res - (A.length() - 1)) % MOD);
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] tokens = in.readLine().split(" ");
        int ans = solve(tokens[0], tokens[1], tokens[2]);
        int a = Integer.parseInt(tokens[0]);
        if (a > 0) {
            ans = (ans - solve(String.valueOf(a - 1), tokens[1], tokens[2]) + MOD) % MOD;
        }
        out.println(ans);
        in.close();
        out.close();
    }
}