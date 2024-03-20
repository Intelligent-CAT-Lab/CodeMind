import java.util.*;
import java.io.*;

public class p02668 {
    static final int MOD = (int)1e9 + 7;
    static final int MAX = 1000000;
    static int N, M;
    static long[] pow2, ipow2;
    static long[] dp;

    static void update(long[] dp) {
        long[] B = dp.clone();
        long[] C = new long[M + 1];
        for (int i = 0; i < M; i++) {
            C[i] = (B[i] * i % MOD * ipow2[i] % MOD) % MOD;
        }
        for (int i = 1; i < M + 1; i++) {
            dp[i] = (dp[i - 1] + C[i - 1]) % MOD;
        }
        for (int i = 0; i < M; i++) {
            dp[i + 1] = (dp[i + 1] * pow2[i] % MOD) % MOD;
        }
        for (int i = 1; i < M + 2; i++) {
            dp[i] = (dp[i] + i * B[i - 1]) % MOD;
        }
    }

    static long[] make_power(long a, int L) {
        int B = Integer.highestOneBit(L);
        long[] x = new long[1 << B];
        x[0] = 1;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                x[i] = x[i - (1 << n)] * a % MOD;
            }
            a = a * a % MOD;
        }
        return Arrays.copyOf(x, L);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);
        pow2 = make_power(2, M + 10);
        ipow2 = make_power((1 + MOD) / 2, M + 10);
        dp = pow2.clone();
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }
        System.out.println(dp[M]);
    }
}