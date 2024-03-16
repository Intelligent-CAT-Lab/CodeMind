import java.util.*;
import java.lang.*;

class Main {
    static int mod = (int)Math.pow(10, 9) + 7;
    static long[] cm = new long[(int)Math.pow(10, 6)];

    static void comb_init() {
        cm[0] = 1;
        for (int i = 1; i < cm.length; i++) {
            cm[i] = (cm[i-1] * i) % mod;
        }
    }

    static long comb(int a, int b) {
        return (cm[a] * inv(cm[a-b]) % mod) * inv(cm[b]) % mod;
    }

    static long inv(int x) {
        return pow(x, mod - 2, mod);
    }

    static long pow(long a, long b, long m) {
        long c = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                c = (c * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return c;
    }

    static long f(int n, int m, int k) {
        comb_init();
        long r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            long mt = comb(n+m+k*2, n+i*2);
            long lk = rk = 1;
            if (i > 0) {
                lk = (comb(n+i*2, i) - comb(n+i*2, i-1)) % mod;
            }
            if (j > 0) {
                rk = (comb(m+j*2, j) - comb(m+j*2, j-1)) % mod;
            }
            r += (mt * lk * rk) % mod;
            r %= mod;
        }
        return r;
    }

    public static void main (String[] args) {
        ArrayList<Long> rr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            if (n == 0) {
                break;
            }
            rr.add(f(n, m, k));
        }
        for (long r : rr) {
            System.out.println(r);
        }
    }
}