import java.util.*;
import java.io.*;

public class p03375 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int MOD = Integer.parseInt(str[1]);

        long[][] B = new long[N+1][N+1];
        B[0][0] = 1;
        for(int n = 1; n <= N; n++) {
            // 1çªãåç¬ã§ä½¿ã
            for(int l = 1; l <= N; l++) {
                B[n][l] = B[n-1][l-1] + B[n-1][l] * (l-1);
                B[n][l] %= MOD;
            }
        }

        // 2^{kl}
        long[][] pow_2 = new long[N+1][N+1];
        pow_2[0][0] = 1;
        for(int n = 1; n <= N; n++) {
            pow_2[n][0] = 2 * pow_2[n-1][0];
            pow_2[n][0] %= MOD;
        }
        for(int n = 1; n <= N; n++) {
            for(int l = 1; l <= N; l++) {
                pow_2[n][l] = pow_2[n-1][l] * pow_2[1][l];
                pow_2[n][l] %= MOD;
            }
        }

        long[] pow_pow = new long[N+1];
        pow_pow[0] = 2;
        for(int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n-1] * pow_pow[n-1];
            pow_pow[n] %= MOD;
        }

        long[] A = new long[N+1];
        for(int n = 1; n <= N; n++) {
            for(int l = 1; l <= N; l++) {
                A[n] += B[n][l] * (pow_2[n][l] + pow_2[n][l-1] * (l-1)) % MOD;
                A[n] %= MOD;
            }
        }

        for(int n = 0; n <= N; n++) {
            A[n] *= pow_pow[n];
            A[n] %= MOD;
        }

        long[] fact = new long[N+1];
        fact[0] = 1;
        for(int n = 1; n <= N; n++) {
            fact[n] = fact[n-1] * n % MOD;
        }

        long[] fact_inv = new long[N+1];
        fact_inv[N] = pow(fact[N],MOD-2,MOD);
        for(int n = N; n >= 1; n--) {
            fact_inv[n-1] = fact_inv[n] * n % MOD;
        }

        long[] comb = new long[N+1];
        for(int n = 0; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[n] % MOD * fact[N] % MOD;
        }

        for(int n = 0; n <= N; n++) {
            A[n] *= (-1);
            A[n] %= MOD;
        }

        for(int n = 0; n <= N; n++) {
            A[n] *= comb[n];
            A[n] %= MOD;
        }

        long answer = pow(2,pow(2,N,MOD-1),MOD) - A[0];
        answer %= MOD;
        System.out.println(answer);
    }
}