import java.util.*;

public class p02862 {
    static long MOD = 100000007;

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long xgcd(long a, long b, long[] x, long[] y) {
        if (a == 0) {
            x[0] = 0;
            y[0] = 1;
            return b;
        }
        long x1[] = new long[1];
        long y1[] = new long[1];
        long d = xgcd(b % a, a, x1, y1);
        x[0] = y1[0] - (b / a) * x1[0];
        y[0] = x1[0];
        return d;
    }

    static long modInverse(long a, long m) {
        long x[] = new long[1];
        long y[] = new long[1];
        long g = xgcd(a, m, x, y);
        long res = (x[0] % m + m) % m;
        return res;
    }

    static long nCrModPFermat(long n, long r, long p) {
        if (r == 0)
            return 1;
        long[] fac = new long[(int) n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++)
            fac[i] = fac[i - 1] * i % p;
        return (fac[(int) n] * modInverse(fac[(int) r], p) % p * modInverse(fac[(int) (n - r)], p) % p) % p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int testCases = 1;
        for (int t = 0; t < testCases; t++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            if ((x + y) % 3!= 0 || 3 * x < x + y || 3 * y < x + y) {
                sb.append(0).append("\n");
            } else {
                long n = (x + y) / 3;
                x -= n;
                y -= n;
                long ans = nCrModPFermat(n, x, MOD);
                ans = (ans * nCrModPFermat(n, y, MOD)) % MOD;
                sb.append(ans).append("\n");
            }
        }
        System.out.print(sb);
    }
}