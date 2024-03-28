import java.io.*;
import java.util.*;
import java.math.*;

public class p02932 {
    static int MOD = 1000000007;
    static int U = 600100;
    static long[] fact = new long[U + 1];
    static long[] fact_inv = new long[U + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        // Calculate factorial and its modular inverse
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = (fact[n-1] * n) % MOD;
        }
        fact_inv[U] = BigInteger.valueOf(fact[U]).modInverse(BigInteger.valueOf(MOD)).longValue();
        for (int n = U; n > 0; n--) {
            fact_inv[n-1] = (fact_inv[n] * n) % MOD;
        }

        long[] comb = new long[U + 1];
        for(int i = 0; i <= U; i++) {
            comb[i] = (((fact[U] * fact_inv[i]) % MOD) * fact_inv[U - i]) % MOD;            
        }

        for(int i = 1; i < comb.length; i += 2) {
            comb[i] = MOD - comb[i];
        }

        long[] P = new long[R + 1];
        for (int i = 0, x = M; x < comb.length; x++, i++) {
            for(int j = x; j < P.length; j += x)
                P[j] = (P[j] + comb[i]) % MOD;      
        }

        for (int i = M; i < P.length; ++i) {
            P[i] = (P[i] - P[i - M] + MOD) % MOD;
        }

        long[] Q = new long[R + 1];
        for (int i = 0; i <= R; ++i) {
            Q[i] = (((fact[N + i] * fact_inv[i]) % MOD) * fact_inv[N]) % MOD;
        }

        System.out.println((f(R, Q, P, N, M) - f(L - 1, Q, P, N, M) + MOD) % MOD);
    }

    public static long f(int R, long[] Q, long[] P, int N, int M) {
        long total = (fact[R+N] * ((fact_inv[R] * fact_inv[N]) % MOD)) % MOD;
        long x = 0;
        for(int i = 0; i <= R; i++) {
            x = (x + (Q[R - i] * P[i]) % MOD) % MOD;
        }
        long coef = (fact[N] * ((fact_inv[M] * fact_inv[N - M]) % MOD)) % MOD;
        return (total - (x * coef) % MOD + MOD) % MOD;
    }
}