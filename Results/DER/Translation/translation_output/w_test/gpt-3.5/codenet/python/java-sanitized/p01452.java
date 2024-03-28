import java.util.*;

public class p01452 {
    static long mod = (long) Math.pow(10, 9) + 7;

    static long inv(long x) {
        return pow(x, mod - 2, mod);
    }

    static long pow(long x, long y, long modulo) {
        if (y == 0) {
            return 1;
        } else {
            long temp = pow(x, y/2, modulo);
            if (y % 2 == 0) {
                return (temp * temp) % modulo;
            } else {
                return ((temp * temp) % modulo * x) % modulo;
            }
        }
    }

    static long comb_init(int cms, long[] cm) {
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = (cm[i-1] * i) % mod;
        }
    }

    static long comb(int a, int b, long[] cm) {
        return (((cm[a] * inv(cm[a-b])) % mod) * inv(cm[b])) % mod;
    }

    static long f(int n, int m, int k) {
        int cms = (int) Math.pow(10, 6);
        long[] cm = new long[cms];

        comb_init(cms, cm);
        long r = 0;

        for (int i = 0; i < k+1; i++) {
            int j = k - i;
            long mt = comb(n + m + k*2, n + i*2, cm);
            long lk = 1;
            long rk = 1;

            if (i > 0) {
                lk = (comb(n + i*2, i, cm) - comb(n + i*2, i-1, cm)) % mod;
            }

            if (j > 0) {
                rk = (comb(m + j*2, j, cm) - comb(m + j*2, j-1, cm)) % mod;
            }

            r = (r + (((mt * lk) % mod) * rk) % mod) % mod;
        }

        return r;
    }

    public static void main(String[] args) {
        List<Long> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            if (n == 0) {
                break;
            }

            result.add(f(n, m, k));
        }

        for (long res : result) {
            System.out.println(res);
        }
    }
}