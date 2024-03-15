import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p04038 {
    static final long MOD = 1000000007L;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        
        if (K == 1) {
            System.out.println(1);
            return;
        }
        
        int U = (N + 10) * (K + 10);
        long[] fact = new long[U];
        long[] factInv = new long[U];
        
        makeFact(U, fact, factInv);
        
        long[] dp = new long[]{0, 1};
        for (int n = 2; n <= N; n++) {
            long[] prev = dp;
            dp = new long[n+1];
            long S = 0;
            for (long val : prev) S = (S + val) % MOD;

            long cumulativeSum = 0;
            for (int i = 0; i < prev.length; i++) {
                cumulativeSum = (cumulativeSum + prev[i]) % MOD;
                prev[i] = cumulativeSum;
            }

            dp[1] = S;
            for (int i = 2; i < dp.length; i++) {
                dp[i] = (S - prev[i - 2] + MOD) % MOD;
            }

            long[] coef = new long[n];
            for (int i = 0; i < coef.length; i++) {
                coef[i] = fact[n * (K - 1) - 1 + i] * factInv[K - 2] % MOD;
                coef[i] = coef[i] * factInv[(n - 1) * (K - 1) + i] % MOD;
            }
            
            for (int i = 0; i < dp.length; i++) {
                dp[i] = dp[i] * coef[i] % MOD;
            }
        }
        
        long answer = 0;
        for (long val : dp) answer = (answer + val) % MOD;
        
        answer = answer * fact[N] % MOD;
        System.out.println(answer);
    }

    // Fill fact and fact_inv arrays with factorial and modular multiplicative inverse of factorials
    private static void makeFact(int U, long[] fact, long[] factInv) {
        fact[0] = 1;
        for (int i = 1; i < U; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        
        factInv[U - 1] = BigInteger.valueOf(fact[U - 1]).modInverse(BigInteger.valueOf(MOD)).longValue();
        for (int i = U - 2; i >= 0; i--) {
            factInv[i] = factInv[i + 1] * (i + 1) % MOD;
        }
    }
}