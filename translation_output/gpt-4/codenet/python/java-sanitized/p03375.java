import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p03375 {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        String[] parts = reader.readLine().trim().split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int MOD = Integer.parseInt(parts[1]);
        
        long[][] B = new long[N+1][N+1];
        B[0][0] = 1;
        
        for (int n = 1; n <= N; n++) {
            // Use number 1 separately
            B[n][1] = B[n-1][0];
            for (int l = 2; l <= N; l++) {
                B[n][l] = B[n-1][l-1];
                // Mix number 1 into a group
                B[n][l] += B[n-1][l] * l % MOD;
                B[n][l] %= MOD;
            }
        }
        
        long[][] pow_2 = new long[N+1][N+1];
        Arrays.fill(pow_2[1], 1);
        for (int n = 1; n <= N; n++) {
            pow_2[1][n] = 2 * pow_2[1][n-1] % MOD;
        }
        
        for (int n = 2; n <= N; n++) {
            for (int l = 1; l <= N; l++) {
                pow_2[n][l] = pow_2[n-1][l] * pow_2[1][l] % MOD;
            }
        }
        
        long[] pow_pow = new long[N+1];
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = BigInteger.valueOf(pow_pow[n-1]).modPow(BigInteger.valueOf(2), BigInteger.valueOf(MOD)).longValue();
        }
        
        long[] A = new long[N+1];
        for (int n = 0; n <= N; n++) {
            for (int l = 1; l <= N-n; l++) {
                long contribution = (pow_2[N-n][l] + pow_2[N-n][l-1] * l) % MOD;
                A[n] += B[n][l] * contribution % MOD;
                A[n] %= MOD;
            }
        }
        
        for (int n = 0; n <= N; n++) {
            A[n] *= pow_pow[N - n];
            A[n] %= MOD;
        }
        
        long[] fact = new long[N+1];
        long[] fact_inv = new long[N+1];
        fact[0] = fact_inv[0] = 1;
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n-1] * n % MOD;
        }
        fact_inv[N] = BigInteger.valueOf(fact[N]).modInverse(BigInteger.valueOf(MOD)).longValue();
        for (int n = N; n > 0; n--) {
            fact_inv[n-1] = fact_inv[n] * n % MOD;
        }
        
        long[] comb = new long[N+1];
        for (int n = 0; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[N-n] % MOD * fact[N] % MOD;
        }
        
        for (int n = 0; n <= N; n += 2) {
            A[n] *= -1;
            A[n] += MOD;
        }
        
        for (int n = 0; n <= N; n++) {
            A[n] *= comb[n];
            A[n] %= MOD;
        }
        
        long answer = BigInteger.valueOf(2).modPow(BigInteger.valueOf(2).modPow(BigInteger.valueOf(N), BigInteger.valueOf(MOD-1)), BigInteger.valueOf(MOD)).longValue() - Arrays.stream(A).sum() % MOD;
        answer += MOD;
        answer %= MOD;
        
        System.out.println(answer);
    }
}