import java.util.*;

public class p02980 {
    static long N, M, mod = 998244353;
    static long[] fact, powm, pown, inv_fact;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        M = sc.nextLong();

        if (N > M) {
            long temp = N;
            N = M;
            M = temp;
        }

        fact = new long[(int) (M + 1)];
        powm = new long[(int) (M + 1)];
        pown = new long[(int) (M + 1)];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            powm[i] = (powm[i - 1] * (M + 1)) % mod;
            pown[i] = (pown[i - 1] * (N + 1)) % mod;
        }

        inv_fact = new long[(int) (M + 1)];
        inv_fact[(int) M] = pow(fact[(int) M], mod - 2);
        for (int i = (int) M - 1; i >= 0; i--) {
            inv_fact[i] = (inv_fact[i + 1] * (i + 1)) % mod;
        }

        long ans = 0;
        for (int i = 0; i <= N; i++) {
            ans = (ans + (((i % 2 == 0) ? 1 : -1) * C(N, i) * C(M, i) * fact[i] % mod * powm[(int) (N - i)] % mod * pown[(int) (M - i)] % mod)) % mod;
        }

        System.out.println(ans);
    }

    static long pow(long n, long m) {
        if (m == 0) {
            return 1;
        } else if (m == 1) {
            return n;
        } else if (m % 2 == 0) {
            long temp = pow(n, m / 2);
            return (temp * temp) % mod;
        } else {
            long temp = pow(n, m / 2);
            return (((temp * temp) % mod) * n) % mod;
        }
    }

    static long C(long n, long r) {
        return (fact[(int) n] * inv_fact[(int) r] % mod * inv_fact[(int) (n - r)] % mod);
    }
}