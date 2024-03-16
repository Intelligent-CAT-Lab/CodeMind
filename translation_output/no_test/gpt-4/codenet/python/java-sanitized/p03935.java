import java.util.Scanner;

public class p03935 {

    private static final long M = 998244353L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        long[] I = new long[(int) n];
        I[0] = I[1] = 1;
        long r = f(m + 2 * n - 2);
        long c = 1;
        for (long i = 2; i < n; i++) {
            I[(int) i] = (M - M / i) * I[(int) (M % i)] % M;
        }
        for (long i = 0; i < n - 1; i++) {
            r = (r + c * (M - f(2 * n - 2 - 2 * i))) % M;
            c = c * (m + i) * I[(int) (i + 1)] % M;
        }
        System.out.println(r);
        scanner.close();
    }

    private static long f(long n) {
        long[] e = {1, 0, 0, 1};
        long[] z = {1, 1, 1, 0};
        while (n != 0) {
            if (n % 2 != 0) e = g(e, z);
            z = g(z, z);
            n /= 2;
        }
        return e[1];
    }

    private static long[] g(long[] a, long[] b) {
        return new long[]{
                (a[0] * b[0] + a[1] * b[2]) % M,
                (a[0] * b[1] + a[1] * b[3]) % M,
                (a[2] * b[0] + a[3] * b[2]) % M,
                (a[2] * b[1] + a[3] * b[3]) % M
        };
    }
}