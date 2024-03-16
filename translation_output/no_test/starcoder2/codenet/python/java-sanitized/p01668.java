import java.io.*;
import java.util.*;

public class p01668 {
    static class RollingHash {
        long mod;
        long[] pw;
        long[] h;
        RollingHash(String s, long base, long mod) {
            this.mod = mod;
            pw = new long[s.length() + 1];
            h = new long[s.length() + 1];
            pw[0] = 1;
            for (int i = 0; i < s.length(); i++) {
                h[i + 1] = (h[i] * base + s.charAt(i)) % mod;
            }
            for (int i = 0; i < s.length(); i++) {
                pw[i + 1] = pw[i] * base % mod;
            }
        }
        long get(int l, int r) {
            return (h[r] - h[l] * pw[r - l] % mod + mod) % mod;
        }
    }
    static long MOD = (long)1e9 + 7;
    static long[] pw10;
    static long calc(String X, String Y) {
        long mod = (long)1e9 + 9;
        int N = X.length();
        int M = Y.length();
        if (N < M) {
            return 0;
        }
        RollingHash hx = new RollingHash(X, 37, mod);
        RollingHash hy = new RollingHash(Y, 37, mod);
        long[] hY = new long[M + 1];
        for (int i = 0; i <= M; i++) {
            hY[i] = hy.get(0, i);
        }
        long res = 0;
        long cur = 0;
        for (int i = 0; i < N; i++) {
            int v = X.charAt(i) - '0';
            res += cur * v * pw10[N - (i + 1)] % MOD;
            for (int j = i - M + 1; j <= i; j++) {
                if (j + M > N) {
                    break;
                }
                int l = i - j;
                if ((0 < l && hx.get(j, j + l) != hY[l]) || v <= Y.charAt(i - j) - '0') {
                    continue;
                }
                res += pw10[N - (j + M)] * (N - (j + M) - (i - j) + 1) % MOD;
            }
            if (M + (i + 1) <= N) {
                res += v * pw10[N - (M + i + 1)] * (N - (i + 1) - M + 1) % MOD;
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
                res -= 9 * pw10[N - i - 1] * i % MOD;
            }
            res -= N - 1;
        }
        return res % MOD;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        String C = st.nextToken();
        int L = Math.max(A.length(), B.length());
        pw10 = new long[L + 1];
        pw10[0] = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = pw10[i - 1] * 10 % MOD;
        }
        long ans = calc(B, C);
        long a = Long.parseLong(A);
        if (a > 0) {
            A = Long.toString(a - 1);
            ans -= calc(A, C);
        }
        bw.write(Long.toString(ans % MOD) + "\n");
        bw.flush();
    }
}