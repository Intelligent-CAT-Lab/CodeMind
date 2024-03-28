import java.util.Scanner;

public class p02980 {
    static final long mod = 998244353;
    static long[] fact, powm, pown, inv_fact;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }

        fact = new long[M + 1];
        powm = new long[M + 1];
        pown = new long[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = fact[i - 1] * i % mod;
            powm[i] = powm[i - 1] * (M + 1) % mod;
            pown[i] = pown[i - 1] * (N + 1) % mod;
        }

        inv_fact = new long[M + 1];
        inv_fact[M] = pow(fact[M], mod - 2);
        for (int i = M - 1; i >= 0; i--) {
            inv_fact[i] = inv_fact[i + 1] * (i + 1) % mod;
        }

        long ans = 0;
        for (int i = 0; i <= N; i++) {
            long temp = fact[i] * powm[N - i] % mod * pown[M - i];
            ans += (((i % 2 == 0) ? 1 : -1) * C(N, i) % mod * C(M, i) % mod * temp % mod) % mod;
            ans = (ans + mod) % mod;
        }

        System.out.println(ans);
    }

    static long pow(long n, long m) {
        if (m == 0) return 1;
        if (m == 1) return n;
        if (m % 2 == 0) return pow(n * n % mod, m / 2);
        return n * pow(n * n % mod, m / 2) % mod;
    }

    static long C(int n, int r) {
        return fact[n] * inv_fact[r] % mod * inv_fact[n - r] % mod;
    }
}