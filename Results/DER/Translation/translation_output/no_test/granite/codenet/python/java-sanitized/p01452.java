import java.io.*;
import java.util.*;

class Main {
    static final int MOD = 1_000_000_007;
    static final int MAX = 1_000_000;
    static final long[] FACTORIAL = new long[MAX + 1];
    static final long[] INV_FACTORIAL = new long[MAX + 1];

    static {
        FACTORIAL[0] = 1;
        INV_FACTORIAL[0] = 1;
        for (int i = 1; i <= MAX; i++) {
            FACTORIAL[i] = FACTORIAL[i - 1] * i % MOD;
            INV_FACTORIAL[i] = INV_FACTORIAL[i - 1] * inv(i) % MOD;
        }
    }

    static long comb(int n, int r) {
        if (n < r || n < 0 || r < 0) {
            return 0;
        }
        return FACTORIAL[n] * (INV_FACTORIAL[r] * INV_FACTORIAL[n - r] % MOD) % MOD;
    }

    static long inv(long a) {
        return pow(a, MOD - 2);
    }

    static long pow(long a, long x) {
        long res = 1;
        while (x > 0) {
            if (x % 2!= 0) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            x /= 2;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens;

        while (true) {
            tokens = in.readLine().split(" ");
            int n = Integer.parseInt(tokens[0]);
            int m = Integer.parseInt(tokens[1]);
            int k = Integer.parseInt(tokens[2]);
            if (n == 0) break;

            long ans = 0;
            for (int i = 0; i <= k; i++) {
                int j = k - i;
                long tmp = comb(n + m + i * 2, n + i * 2);
                long lk = 1, rk = 1;
                if (i > 0) {
                    lk = (comb(n + i * 2, i) - comb(n + i * 2, i - 1) + MOD) % MOD;
                }
                if (j > 0) {
                    rk = (comb(m + j * 2, j) - comb(m + j * 2, j - 1) + MOD) % MOD;
                }
                ans = (ans + tmp * lk % MOD * rk) % MOD;
            }
            System.out.println(ans);
        }
    }
}