import java.util.*;

public class p02980 {
    static long mod = 998244353;
    static long[] fact, powm, pown, inv_fact;
    static int N, M;

    static void preprocess() {
        fact = new long[M + 1];
        powm = new long[M + 1];
        pown = new long[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            powm[i] = (powm[i - 1] * (M + 1)) % mod;
            pown[i] = (pown[i - 1] * (N + 1)) % mod;
        }
        inv_fact = new long[M + 1];
        inv_fact[M] = pow(fact[M], mod - 2);
        for (int i = M - 1; i >= 0; i--) {
            inv_fact[i] = (inv_fact[i + 1] * (i + 1)) % mod;
        }
    }

    static long pow(long n, long m) {
        if (m == 0) return 1;
        if (m == 1) return n;
        if (m % 2 == 0) return pow((n * n) % mod, m / 2);
        return (pow((n * n) % mod, m / 2) * n) % mod;
    }

    static long C(int n, int r) {
        return (fact[n] * inv_fact[r] % mod * inv_fact[n - r]) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }
        preprocess();
        long ans = 0;
        for (int i = 0; i <= N; i++) {
            ans = (ans + ((((i % 2 == 0) ? 1 : -1) * C(N, i) % mod * C(M, i) % mod * fact[i] % mod * powm[N - i] % mod * pown[M - i] % mod)) % mod) % mod;
        }
        System.out.println(ans);
    }
}