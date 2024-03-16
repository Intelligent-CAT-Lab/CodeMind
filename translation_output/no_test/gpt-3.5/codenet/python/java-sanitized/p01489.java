import java.util.Scanner;

public class p01489 {

    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = 0;
        int r = k;

        while ((r - l) > 1) {
            int m = (l + r) / 2;
            if ((m * (m + 1)) < k) {
                l = m;
            } else {
                r = m;
            }
        }

        int b = l;
        int ad = k - (b * (b + 1));
        int d = ((ad - 1) % (b + 1)) + 1;
        int x = 2 * b + 1;
        int y = 1;

        if ((ad - d) > 0) {
            x += 1;
        }

        int dd;
        if (d <= (b + 1 + 1) / 2) {
            dd = d * 2 - 1;
        } else {
            int dz = (b + 1 - d);
            dd = dz * 2 + 2;
        }

        x -= (dd - 1);
        y += (dd - 1);

        long[][] bt = {{1, 1}, {1, 0}};
        long[][] res = {{1, 1}, {1, 0}};

        long ans = multiply(fib(x - 1, bt), fib(y - 1, bt));
        ans %= mod;
        System.out.println(ans);
    }

    static long[][] multiply(long[][] a, long[][] b) {
        int p = 2;
        int q = 2;
        int r = 2;
        long[][] res = new long[p][q];

        for (int s = 0; s < p; s++) {
            for (int t = 0; t < q; t++) {
                res[s][t] = 0;
                for (int u = 0; u < r; u++) {
                    long y = a[s][u] * b[u][t];
                    res[s][t] += y;
                }
                res[s][t] %= mod;
            }
        }
        return res;
    }

    static long[][] fib(int x, long[][] bt) {
        long[][] r = {{1, 1}, {1, 0}};

        while (x > 0) {
            if (x % 2 != 0) {
                r = multiply(r, bt);
            }
            bt = multiply(bt, bt);
            x /= 2;
        }
        return r;
    }
}