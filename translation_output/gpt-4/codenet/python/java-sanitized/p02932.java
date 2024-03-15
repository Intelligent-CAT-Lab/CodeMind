import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class p02932 {
    static final int MOD = (int)1e9 + 7;
    static final int U = 600100;
    static int[] fact = new int[U + 1];
    static int[] factInv = new int[U + 1];
    static int[] inv = new int[U + 1];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = (int)(((long)fact[n - 1] * n) % MOD);
        }
        factInv[U] = BigInteger.valueOf(fact[U]).modInverse(BigInteger.valueOf(MOD)).intValue();
        for (int n = U; n > 0; n--) {
            factInv[n - 1] = (int)(((long)factInv[n] * n) % MOD);
        }
        
        int[] comb = new int[U + 1];
        for (int n = 0; n <= U; n++) {
            comb[n] = (int)((long)fact[U] * factInv[n] % MOD * factInv[U - n] % MOD);
            if (n % 2 == 1) comb[n] = (-comb[n] + MOD) % MOD;
        }
        
        int[] P = new int[R + 1];
        for (int i = M, x; i <= U; i++) {
            x = comb[i - M];
            for (int j = i; j < P.length; j += i) {
                P[j] = (P[j] + x) % MOD;
            }
        }

        for (int i = M; i < P.length; i++) {
            P[i] -= i - M >= 0 ? P[i - M] : 0;
            if (P[i] < 0) P[i] += MOD;
        }

        int[] Q = new int[R + 1];
        for (int i = 0; i <= R; i++) {
            Q[i] = (int)((long)fact[N + i] * factInv[i] % MOD * factInv[N] % MOD);
        }
        
        System.out.println(((f(N, M, R, Q, P) - f(N, M, L - 1, Q, P)) + MOD) % MOD);
    }
    
    private static int f(int N, int M, int R, int[] Q, int[] P) {
        int total = (int)((long)fact[R + N] * factInv[R] % MOD * factInv[N] % MOD);
        int x = 0;
        for (int n = 0; n <= R; n++) {
            x = (int)((x + (long)Q[R - n] * P[n]) % MOD);
        }
        int coef = (int)((long)fact[N] * factInv[M] % MOD * factInv[N - M] % MOD);
        return (total - (int)((long)x * coef % MOD) + MOD) % MOD;
    }
}