import java.io.*;
import java.util.*;

public class p02932 {
    static int mod = (int) 1e9 + 7;
    static long fact[] = new long[mod];
    static long fact_inv[] = new long[mod];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        Arrays.fill(fact, 1);
        fact[0] = 0;
        for (int i = 1; i < mod; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }

        Arrays.fill(fact_inv, 1);
        fact_inv[mod - 1] = pow(fact[mod - 1], mod - 2, mod);
        for (int i = mod - 2; i >= 0; i--) {
            fact_inv[i] = fact_inv[i + 1] * i % mod;
        }

        long U = N - M;
        long comb = fact[U] * fact_inv[0, U + 1] % mod * fact_inv[U, U + 1] % mod;
        for (int i = 1; i < U; i++) {
            comb *= fact[i] % mod;
        }
        comb *= fact_inv[U, U + 1] % mod;
        for (int i = U - 1; i >= 0; i--) {
            comb *= fact[i] % mod;
        }
        comb *= fact_inv[U, U + 1] % mod;

        long P = new long[mod];
        Arrays.fill(P, 0);
        for (int i = 0; i < R + 1; i++) {
            P[i] = comb % mod;
            comb %= mod;
        }

        Arrays.fill(P, mod - M);
        for (int i = 0; i < R + 1; i++) {
            P[i] -= P[i + M];
        }

        long Q = fact[N, N + R + 1] * fact_inv[0, R + 1] % mod * fact_inv[N] % mod;

        long f(int R) {
            long total = fact[R + N] * fact_inv[R] % mod * fact_inv[N] % mod;
            long x = (Q[R, R - 1] * P[0, R + 1] % mod).sum() % mod;
            long coef = fact[N] * fact_inv[M] % mod * fact_inv[N - M] % mod;
            return (total - x * coef) % mod;
        }

        long answer = (f(R) - f(L - 1)) % mod;
        System.out.println(answer);
    }
}