import java.util.*;
import java.io.*;

class Main {
    static long MOD = 100000007;

    static long modpow(long a, long n) {
        long res = 1;
        while (n > 0) {
            long tmp = n & 1;
            if (tmp == 1) res = res * a % MOD;
            a = a * a % MOD;
            n = n >> 1;
        }
        return res;
    }

    static long modcomb(long n, long k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        long res = 1;
        long tmp = 1;
        for (int i = (int) n; i >= (int) (n - k + 1); i--) {
            res = res * i % MOD;
        }
        for (int i = (int) k; i >= 1; i--) {
            tmp = tmp * i % MOD;
        }
        res = res * modpow(tmp, MOD - 2) % MOD;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long X = modpow(2, N);
        long A_ = modcomb(N, A);
        long B_ = modcomb(N, B);
        long ans = (X - 1 - A_ - B_ + 2 * MOD) % MOD;
        System.out.println(ans);
    }
}