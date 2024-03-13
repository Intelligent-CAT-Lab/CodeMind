import java.util.*;
import java.io.*;

public class p01668 {
    static class RollingHash {
        long mod;
        long[] pw;
        long[] h;

        RollingHash(String s, long base, long mod) {
            this.mod = mod;
            pw = new long[s.length() + 1];
            h = new long[s.length() + 1];

            long v = 0;
            for (int i = 0; i < s.length(); i++) {
                h[i + 1] = v = (v * base + s.charAt(i)) % mod;
            }
            v = 1;
            for (int i = 0; i < s.length(); i++) {
                pw[i + 1] = v = v * base % mod;
            }
        }

        long get(int l, int r) {
            return (h[r] - h[l] * pw[r - l]) % mod;
        }
    }

    static long solve() throws IOException {
        long MOD = (long) Math.pow(10, 9) + 7;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        String C = st.nextToken();
        int L = Math.max(A.length(), B.length());
        long[] pw10 = new long[L + 1];
        long r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = r = r * 10 % MOD;
        }
        long calc(String X, String Y) {
            long mod = (long) Math.pow(10, 9) + 9;
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
                long v = X.charAt(i) - '0';
                res = (res + cur * v * pw10[N - (i + 1)]) % MOD;
                for (int j = Math.max(0, i - M + 1); j <= i; j++) {
                    if (j + M > N) {
                        break;
                    }
                    int l = i - j;
                    if ((0 < l && hx.get(j, j + l) != hY[l]) || v <= Y.charAt(i - j) - '0') {
                        continue;
                    }
                    res = (res + pw10[N - (j + M)]) % MOD;
                }
                if (M + (i + 1) <= N) {
                    res = (res + v * pw10[N - (M + i + 1)] * (N - (i + 1) - M + 1)) % MOD;
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
                    res = (res - 9 * pw10[N - i - 1] * i) % MOD;
                }
                res = (res - (N - 1)) % MOD;
            }
            return res % MOD;
        }
        long ans = calc(B, C);
        long a = Long.parseLong(A);
        if (a > 0) {
            A = String.valueOf(a - 1);
            ans = (ans - calc(A, C) + MOD) % MOD;
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}