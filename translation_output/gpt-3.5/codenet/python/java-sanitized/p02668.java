import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02668 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int MOD = 1000000007;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] pow2 = makePower(2, M + 10, MOD);
        long[] ipow2 = makePower((1 + MOD) / 2, M + 10, MOD);

        long[] dp = new long[M + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = pow2[i];
        }

        for (int j = 0; j < N - 1; j++) {
            update(dp, M, ipow2, pow2, MOD);
        }

        System.out.println(dp[M]);
    }

    public static long[] makePower(long a, int L, int MOD) {
        int B = Integer.toBinaryString(L).length();
        long[] x = new long[1 << B];
        x[0] = 1;
        for (int n = 0; n < B; n++) {
            for (int i = 1 << n; i < 1 << (n + 1); i++) {
                x[i] = (x[i - (1 << n)] * a) % MOD;
            }
            a = (a * a) % MOD;
        }
        long[] result = new long[L];
        System.arraycopy(x, 0, result, 0, L);
        return result;
    }

    public static void update(long[] dp, int M, long[] ipow2, long[] pow2, int MOD) {
        long[] B = dp.clone();
        for (int i = 1; i <= M; i++) {
            dp[i] = (dp[i] + (B[i] * i) % MOD * ipow2[i] % MOD) % MOD;
        }
        long[] C = new long[M + 1];
        for (int i = 1; i <= M; i++) {
            C[i] = (dp[i - 1] + C[i - 1]) % MOD;
        }
        for (int i = 1; i <= M; i++) {
            dp[i] = (dp[i] * pow2[i]) % MOD;
        }
        for (int i = 0; i <= M; i++) {
            dp[i] = (dp[i] + (i + 1) * B[i]) % MOD;
        }
    }
}