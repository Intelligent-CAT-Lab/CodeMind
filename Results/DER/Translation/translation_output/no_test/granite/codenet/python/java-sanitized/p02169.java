import java.io.*;
import java.util.*;

class Main {
    static long mod = 998244353;

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long M, N, K;
        M = sc.nextLong();
        N = sc.nextLong();
        K = sc.nextLong();
        if (N < K || M < K) {
            System.out.println(0);
            return;
        }
        long ans = modpow(M, N);
        long[] p = new long[(int)K+1];
        for (int i = 0; i <= K; i++) {
            p[i] = modpow(i, N);
        }
        long[][] comb = new long[(int)K+1][(int)K+1];
        comb[0][0] = 1;
        for (int i = 0; i < K; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i+1][j] += comb[i][j];
                comb[i+1][j+1] += comb[i][j];
            }
        }
        for (int i = 1; i < K; i++) {
            long k = 0;
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 1) {
                    k -= comb[i][j] * p[j] % mod;
                } else {
                    k += comb[i][j] * p[j] % mod;
                }
            }
            k = k * M % mod;
            M = M * (M-i) % mod;
            M = M * modinv(i+1) % mod;
            ans -= k;
            ans %= mod;
        }
        System.out.println(ans);
    }

    static long modpow(long a, long n) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n /= 2;
        }
        return res;
    }

    static long modinv(long a) {
        return modpow(a, mod-2);
    }
}