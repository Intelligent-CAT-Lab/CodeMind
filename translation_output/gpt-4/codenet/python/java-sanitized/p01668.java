import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.math.BigInteger;

public class p01668 {
    static class RollingHash {
        private int mod;
        private int[] pw;
        private int[] h;

        public RollingHash(String s, int base, int mod) {
            this.mod = mod;
            this.pw = new int[s.length() + 1];
            this.h = new int[s.length() + 1];

            int v = 0;
            for (int i = 0; i < s.length(); i++) {
                h[i + 1] = v = (int)(((long)v * base + s.charAt(i)) % mod);
            }
            v = 1;
            for (int i = 0; i < s.length(); i++) {
                pw[i + 1] = v = (int)((long)v * base % mod);
            }
        }

        public int get(int l, int r) {
            return (int)((h[r] - (long)h[l] * pw[r - l] % mod + mod) % mod);
        }
    }

    public static void main(String[] args) throws IOException {
        final int MOD = 1000000007;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().trim().split(" ");
        String A = input[0];
        String B = input[1];
        String C = input[2];
        int L = Math.max(A.length(), B.length());

        int[] pw10 = new int[L + 1];
        long r = 1;
        for (int i = 1; i <= L; i++) {
            pw10[i] = (int)(r = r * 10 % MOD);
        }

        int ans = calc(B, C, pw10, MOD);
        BigInteger a = new BigInteger(A);
        if (a.compareTo(BigInteger.ZERO) > 0) {
            A = a.subtract(BigInteger.ONE).toString();
            ans = (ans - calc(A, C, pw10, MOD) + MOD) % MOD;
        }

        writer.write(ans + "\n");

        writer.flush();
        writer.close();
        reader.close();
    }

    private static int calc(String X, String Y, int[] pw10, final int MOD) {
        int mod = 1000000009;
        int N = X.length();
        int M = Y.length();
        if (N < M) {
            return 0;
        }
        RollingHash hx = new RollingHash(X, 37, mod);
        RollingHash hy = new RollingHash(Y, 37, mod);

        int[] hY = new int[M + 1];
        for (int i = 0; i <= M; i++) {
            hY[i] = hy.get(0, i);
        }

        int res = 0;
        int cur = 0;
        for (int i = 0; i < N; i++) {
            int v = X.charAt(i) - '0';
            res = (int)(((long)res + (long)cur * v * pw10[N - (i + 1)]) % MOD);

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
                res = (int)(((long)res + (long)v * pw10[N - (M + i + 1)] * (N - (i + 1) - M + 1)) % MOD);
            }
            if (i - M + 1 >= 0 && hx.get(i - M + 1, i + 1) == hY[M]) {
                cur++;
            }
        }

        for (int j = 0; j <= N - M; j++) {
            if (hx.get(j, j + M) == hY[M]) {
                res = (res + 1) % MOD;
            }
        }

        if (Y.equals("0")) {
            for (int i = 1; i < N; i++) {
                res = (int)((res - 9L * pw10[N - i - 1] * i % MOD + MOD) % MOD);
            }
            res = (res - (N - 1) + MOD) % MOD;
        }

        return res;
    }
}