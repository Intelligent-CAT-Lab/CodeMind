import java.io.*;
import java.util.*;

public class p01668 {

    static class RollingHash {
        private int mod;
        private long[] pw, h;

        public RollingHash(String s, int base, int mod) {
            this.mod = mod;
            int l = s.length();
            this.pw = new long[l + 1];
            this.h = new long[l + 1];

            long v = 0;
            pw[0] = 1;
            for (int i = 0; i < l; ++i) {
                h[i + 1] = v = (v * base + s.charAt(i)) % mod;
                pw[i + 1] = v = v * base % mod;
            }
        }

        public long get(int l, int r) {
            return (h[r] - h[l] * pw[r - l] % mod + mod) % mod;
        }
    }

    static long solve(String A, String B, String C) {
        final int MOD = (int)1e9 + 7;
        int L = Math.max(B.length(), C.length());
        long[] pw10 = new long[L + 1];
        long r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = r * 10 % MOD;
        }

        long calc(String X, String Y) {
            final int mod = (int)1e9 + 9;
            int N = X.length();
            int M = Y.length();
            if (N < M) return 0;
            RollingHash hx = new RollingHash(X, 37, mod);
            RollingHash hy = new RollingHash(Y, 37, mod);
            long[] hY = new long[M + 1];
            for (int i = 0; i <= M; i++) {
                hY[i] = hy.get(0, i);
            }
            long res = 0, cur = 0;
            for (int i = 0; i < N; i++) {
                int v = X.charAt(i) - '0';
                res = (res + cur * v * pw10[N - i - 1]) % MOD;
                for (int j = Math.max(0, i - M + 1); j <= i; j++) {
                    if (j + M > N) break;
                    int l = i - j;
                    if ((l > 0 && hx.get(j, j + l) != hY[l]) || v <= Y.charAt(i - j) - '0') {
                        continue;
                    }
                    res = (res + pw10[N - j - M]) % MOD;
                }
                if (M + i + 1 <= N) {
                    res = (res + v * pw10[N - M - i - 1] * (N - i - M)) % MOD;
                }
                if (i - M + 1 >= 0 && hx.get(i - M + 1, i + 1) == hY[M]) {
                    cur++;
                }
            }
            for (int j = 0; j <= N - M; j++) {
                if (hx.get(j, j + M) == hY[M]) res++;
            }
            if (Y.equals("0")) {
                for (int i = 1; i < N; i++) {
                    res -= 9 * pw10[N - i - 1] * i % MOD;
                }
                res -= N - 1;
            }
            return res % MOD;
        }

        long ans = calc(B, C);
        long a = Long.parseLong(A);
        if (a > 0) {
            A = String.valueOf(a - 1);
            ans = (ans - calc(A, C) + MOD) % MOD;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        String C = st.nextToken();
        long result = solve(A, B, C);
        writer.write(result + "\n");
        writer.flush();
    }
}