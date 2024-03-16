import java.util.Scanner;

public class p01489 {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        scanner.close();

        long l = 0, r = k;
        while ((r - l) > 1) {
            long m = (l + r) / 2;
            if (m * (m + 1) < k) {
                l = m;
            } else {
                r = m;
            }
        }

        long b = l;
        long ad = k - (b * (b + 1));
        long d = ((ad - 1) % (b + 1)) + 1;
        long x = 2 * b + 1;
        long y = 1;
        if ((ad - d) > 0) {
            x += 1;
        }
        
        if (d <= (b + 2) / 2) {
            long dd = d * 2 - 1;
            x -= (dd - 1);
            y += (dd - 1);
        } else {
            long dz = (b + 1 - d);
            long dd = dz * 2 + 2;
            x -= (dd - 1);
            y += (dd - 1);
        }

        long ans = (fib(x - 1) * fib(y - 1)) % MOD;
        System.out.println(ans);
    }

    static long[][] mul(long[][] a, long[][] b) {
        long[][] res = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    long y = a[i][k] * b[k][j] % MOD;
                    res[i][j] = (res[i][j] + y) % MOD;
                }
            }
        }
        return res;
    }

    static long fib(long n) {
        long[][] r = {{1, 1}, {1, 0}};
        long[][] base = {{1, 1}, {1, 0}};
        while (n > 0) {
            if (n % 2 != 0) {
                r = mul(r, base);
            }
            base = mul(base, base);
            n /= 2;
        }
        return r[0][0];
    }
}