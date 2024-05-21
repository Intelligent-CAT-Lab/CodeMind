import java.util.*;
import java.io.*;

public class p03832 {
    static long MOD = 100000007;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int C = Integer.parseInt(input[3]);
        int D = Integer.parseInt(input[4]);

        long[] fact = new long[N + 1];
        long[] frev = new long[N + 1];
        fact[0] = 1;
        frev[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = pow(fact[i], MOD - 2, MOD);
        }

        long[] dp = new long[N + 1];
        dp[0] = 1;

        long[] Y = new long[N + 1];
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            long y = frev[g];
            for (int i = p; i <= Math.min(q, N); i += g) {
                Y[i] = (pow(y, i / g, MOD) * frev[i / g]) % MOD;
            }
            for (int i = p; i <= N; i++) {
                dp[i] = (dp[i] + frev[N - i] * sum(dp[i - j] * fact[N - i + j] * Y[j]
                    for (int j = p; j <= Math.min(q, i); j += g)) % MOD;
            }
        }

        System.out.println(dp[N] % MOD);
    }

    static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b /= 2;
        }
        return result;
    }

    static long sum(long[] arr) {
        long result = 0;
        for (long a : arr) {
            result += a;
        }
        return result;
    }
}