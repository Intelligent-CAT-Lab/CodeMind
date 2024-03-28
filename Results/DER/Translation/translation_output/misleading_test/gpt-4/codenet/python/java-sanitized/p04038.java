import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p04038 {
    static long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (K == 1) {
            System.out.println(1);
            return;
        }

        int U = (N + 10) * (K + 10);
        long[] fact = makeFact(U);
        long[] fact_inv = makeFactInv(U, fact);        

        long[] dp = new long[2];
        dp[1] = 1;
        for (int n = 2; n <= N; ++n) {
            long[] prev = dp.clone();
            dp = new long[n + 1];

            long S = 0;
            for (long value : prev) {
                S = (S + value) % MOD;
            }

            long cumulative = 0;
            for (int i = 1; i < prev.length; ++i) {
                cumulative = (cumulative + prev[i]) % MOD;
            }

            dp[1] = S;
            for (int i = 2; i <= n; ++i) {
                dp[i] = (S - prev[i - 1] + MOD) % MOD;
            }

            long[] coef = new long[n + 1];
            for (int i = 0; i <= n; ++i) {
                coef[i] = fact[n * (K - 1) - 1 + i];
                coef[i] = (coef[i] * fact_inv[K - 2]) % MOD;
                coef[i] = (coef[i] * fact_inv[(n - 1) * (K - 1) + i]) % MOD;
            }

            for (int i = 1; i <= n; ++i) {
                dp[i] = (dp[i] * coef[n - i]) % MOD;
            }
        }

        long answer = 0;
        for (long value : dp) {
            answer = (answer + value) % MOD;
        }
        answer = (answer * fact[N]) % MOD;
        System.out.println(answer);
    }

    static long[] makeFact(int U) {
        long[] fact = new long[U];
        fact[0] = 1;
        for (int i = 1; i < U; ++i) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        return fact;
    }

    static long[] makeFactInv(int U, long[] fact) {
        long[] fact_inv = new long[U];
        fact_inv[U - 1] = modInverse(fact[U - 1]);
        for (int i = U - 2; i >= 0; --i) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % MOD;
        }
        return fact_inv;
    }

    static long modInverse(long a) {
        return BigInteger.valueOf(a).modInverse(BigInteger.valueOf(MOD)).longValue();
    }
}