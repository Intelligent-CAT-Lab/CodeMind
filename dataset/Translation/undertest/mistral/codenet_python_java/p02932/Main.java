import java.util.*;

public class p02932 {
    final static int mod = (int) 1e9 + 7;
    final static int U = 6 * 1000000 + 100;
    static long fact[] = new long[U + 1];
    static long fact_inv[] = new long[U + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();

        Arrays.fill(fact, 1);
        for (int i = 1; i <= U; i++)
            fact[i] = fact[i - 1] * i % mod;

        Arrays.fill(fact_inv, 1);
        fact_inv[U] = pow(fact[U], mod - 2, mod);
        for (int i = U; i >= 1; i--)
            fact_inv[i - 1] = fact_inv[i] * i % mod;

        Arrays.copy(fact, fact_inv, U);

        long comb = fact[N - M] * fact_inv[0, U] % mod * fact_inv[N - M, U] % mod;
        for (int i = 1; i < N - M; i++)
            comb = comb * fact[i] % mod;
        for (int i = N - M; i >= 1; i--)
            comb = comb * fact_inv[i] % mod;

        long P[] = new long[R + 1];
        Arrays.fill(P, 0);
        for (int i = 0, x = comb; i <= R; i++) {
            P[i] += x;
            x %= mod;
        }

        Arrays.copy(P, P, R);
        for (int i = R + 1; i <= R + N; i++)
            P[i] -= P[i - R];
        P %= mod;

        long Q[] = new long[N + R];
        Arrays.fill(Q, 0);
        for (int i = 0; i <= N; i++)
            Q[i] = fact[i + R] * fact_inv[i] % mod * fact_inv[N] % mod;

        long total = 0;
        long x = 0;
        long coef = fact[N] * fact_inv[M] % mod * fact_inv[N - M] % mod;
        for (int i = N - 1; i >= 0; i--) {
            x = (Q[i + 1, U] * P[i] % mod).sum() % mod;
            total = total + fact[i] * fact_inv[i] % mod * coef;
            total %= mod;
        }

        System.out.println(total - x);
    }
}