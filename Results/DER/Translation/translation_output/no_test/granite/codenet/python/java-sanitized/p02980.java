import java.util.*;

public class p02980 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int mod = 998244353;

        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
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

        long ans = 0;
        for (int i = 0; i <= N; i++) {
            ans += (-1) ^ i * comb(N, i, fact, powm, pown, mod) * comb(M, i, fact, powm, pown, mod) * fact[i] % mod;
            ans = ans % mod;
        }

        System.out.println(ans);
    }

    public static long pow(long n, long m, int mod) {
        if (m == 0) {
            return 1;
        } else if (m == 1) {
            return n;
        } else if (m % 2 == 0) {
            return pow(n, m / 2, mod) * pow(n, m / 2, mod) % mod;
        } else {
            return pow(n, m / 2, mod) * pow(n, m / 2, mod) % mod * n % mod;
        }
    }

    public static long inv(long n, int mod) {
        return pow(n, mod - 2, mod);
    }

    public static long comb(int n, int r, long[] fact, long[] powm, long[] pown, int mod) {
        return fact[n] * inv(fact[r], mod) % mod * inv(fact[n - r], mod) % mod;
    }
}