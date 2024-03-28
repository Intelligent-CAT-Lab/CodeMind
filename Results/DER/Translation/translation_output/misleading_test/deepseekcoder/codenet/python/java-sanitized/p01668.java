import java.io.*;
import java.util.*;

public class p01668 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static final long MOD = (long) Math.pow(10, 9) + 7;
    static final long BASE = 37;

    static class RollingHash {
        long[] h, pw;
        int mod;

        RollingHash(String s, int mod) {
            this.mod = mod;
            int l = s.length();
            h = new long[l + 1];
            pw = new long[l + 1];

            long v = 0;
            for (int i = 0; i < l; i++) {
                h[i + 1] = v = (v * BASE + s.charAt(i)) % mod;
            }
            v = 1;
            for (int i = 0; i < l; i++) {
                pw[i + 1] = v = v * BASE % mod;
            }
        }

        long get(int l, int r) {
            return (h[r] - h[l] * pw[r - l]) % mod;
        }
    }

    static long calc(String X, String Y) throws IOException {
        int mod = (int) Math.pow(10, 9) + 9;
        int N = X.length();
        int M = Y.length();
        if (N < M) {
            return 0;
        }
        RollingHash hx = new RollingHash(X, mod);
        long[] hY = new long[M + 1];
        for (int i = 0; i < M; i++) {
            hY[i + 1] = hx.get(0, i + 1);
        }
        long res = 0, cur = 0;
        for (int i = 0; i < N; i++) {
            int v = X.charAt(i) - '0';
            res = (res + cur * v * pow10(N - i - 1, MOD)) % MOD;
            for (int j = Math.max(i - M + 1, 0); j <= i; j++) {
                int l = i - j;
                if ((j > 0 && hx.get(j, j + l) != hY[l]) || v <= X.charAt(j) - '0') {
                    continue;
                }
                res = (res + pow10(N - j - M, MOD)) % MOD;
            }
            if (i - M + 1 >= 0) {
                res = (res + v * pow10(N - i - M, MOD) * (N - i - M)) % MOD;
            }
            if (i - M + 1 >= 0 && hx.get(i - M + 1, i + 1) == hY[M]) {
                cur++;
            }
        }
        for (int j = 0; j <= N - M; j++) {
            if (hx.get(j, j + M) != hY[M]) {
                continue;
            }
            res++;
        }
        if (Y.equals("0")) {
            for (int i = 1; i < N; i++) {
                res = (res - 9 * pow10(N - i - 1, MOD) * i) % MOD;
            }
            res = (res - (N - 1)) % MOD;
        }
        return (res + MOD) % MOD;
    }

    static long pow10(int n, long mod) {
        long res = 1, pw = 10;
        while (n > 0) {
            if ((n & 1) != 0) {
                res = (res * pw) % mod;
            }
            pw = (pw * pw) % mod;
            n >>= 1;
        }
        return res;
    }

    static void solve() throws IOException {
        String[] input = br.readLine().split(" ");
        String A = input[0], B = input[1], C = input[2];
        long ans = calc(B, C);
        int a = Integer.parseInt(A);
        if (a > 0) {
            A = String.valueOf(a - 1);
            ans = (ans - calc(A, C) + MOD) % MOD;
        }
        pr.println(ans);