import java.util.*;
import java.io.*;

public class p01452 {
    static final long mod = 1000000007;
    static final int cms = 1000000;
    static long[] cm = new long[cms];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> rr = new ArrayList<>();

        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            if (n == 0) {
                break;
            }
            rr.add(f(n, m, k));
        }

        for (long result : rr) {
            System.out.println(result);
        }
    }

    static long f(int n, int m, int k) {
        combInit();
        long r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            long mt = comb(n + m + k * 2, n + i * 2);
            long lk = 1;
            long rk = 1;
            if (i > 0) {
                lk = (comb(n + i * 2, i) - comb(n + i * 2, i - 1) + mod) % mod;
            }
            if (j > 0) {
                rk = (comb(m + j * 2, j) - comb(m + j * 2, j - 1) + mod) % mod;
            }
            r += mt * lk % mod * rk % mod;
            r %= mod;
        }

        return r;
    }

    static void combInit() {
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = cm[i - 1] * i % mod;
        }
    }

    static long comb(int a, int b) {
        return (cm[a] * inv(cm[a - b]) % mod) * inv(cm[b]) % mod;
    }

    static long inv(long x, long mod) {
        return power(x, mod - 2, mod);
    }

    static long power(long x, long y, long mod) {
        long res = 1;
        x = x % mod;

        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % mod;
            }
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res;
    }
}