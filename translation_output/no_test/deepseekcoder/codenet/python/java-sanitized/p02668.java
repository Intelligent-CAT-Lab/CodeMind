import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02668 {
    static final long MOD = (long) Math.pow(10, 9) + 7;
    static long[] pow2, ipow2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        pow2 = makePower(2, M + 10);
        ipow2 = makePower((MOD + 1) / 2, M + 10);

        long[] dp = Arrays.copyOfRange(pow2, 0, M + 1);
        for (int i = 0; i < N - 1; i++) {
            update(dp);
        }

        System.out.println(dp[M]);
    }

    static long[] makePower(long a, int L) {
        int B = Integer.toBinaryString(L).length();
        long[] x = new long[1 << B];
        x[0] = 1;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                x[i] = x[(int) (i & ((1 << n) - 1))] * a % MOD;
                a = a * a % MOD;
            }
        }
        return Arrays.copyOfRange(x, 0, L);
    }

    static void update(long[] dp) {
        long[] B = dp.clone();
        long[] C = new long[dp.length];
        for (int i = 0; i < dp.length; i++) {
            C[i] = dp[i] * i % MOD * ipow2[i] % MOD;
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i] = (dp[i - 1] + C[i]) % MOD;
            dp[i] = dp[i] * pow2[i - 1] % MOD;
            dp[i] = (dp[i] + i * B[i]) % MOD;
        }
    }
}