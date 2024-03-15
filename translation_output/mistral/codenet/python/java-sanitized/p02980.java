import java.util.*;

public class p02980 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long mod = 998244353;

        if (N > M) {
            N = M;
            M = N;
        }

        long[] fact = new long[M + 1];
        long[] powm = new long[M + 1];
        long[] pown = new long[M + 1];
        fact[0] = 1;
        powm[0] = 1;
        pown[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = fact[i - 1] * i % mod;
            powm[i] = powm[i - 1] * (M + 1) % mod;
            pown[i] = pown[i - 1] * (N + 1) % mod;
        }

        long[] inv_fact = new long[M + 1];
        inv_fact[M] = pow(fact[M], mod - 2);
        for (int i = M - 1; i >= 0; i--) {
            inv_fact[i] = inv_fact[i + 1] * (i + 1) % mod;
        }

        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += (-1) * Math.pow(2, i - 1) * C(N, i) * C(M, i) * fact[i] * powm[N - i] * pown[M - i];
            ans = ans % mod;
        }

        System.out.println(ans);
    }

    public static long pow(long n, long m) {
        if (m == 0) {
            return 1;
        } else if (m == 1) {
            return n;
        } else if (m % 2 == 0) {
            return pow(n, m / 2) * pow(n, m / 2);
        } else {
            return pow(n, m / 2) * pow(n, m / 2) * n;
        }
    }

    public static long C(long n, long r) {
        long ans = fact[n] * inv_fact[r] % mod * inv_fact[n - r] % mod;
        return ans;
    }
}