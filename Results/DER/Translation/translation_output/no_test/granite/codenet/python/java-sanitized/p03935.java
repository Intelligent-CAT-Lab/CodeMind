import java.util.*;

public class p03935 {
    static int M = 998244353;
    static long[][] g(long[][] a, long[][] b) {
        long[][] c = new long[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = (a[i][0] * b[0][j] + a[i][1] * b[1][j]) % M;
            }
        }
        return c;
    }
    static long f(long n) {
        long[][] i = {{1, 0, 0, 1}, {1, 1, 1, 0}, {1, 1, 1, 0}, {1, 1, 1, 0}};
        long[][] z = {{1, 1, 1, 0}, {1, 1, 1, 0}, {1, 1, 1, 0}, {1, 1, 1, 0}};
        while (n > 0) {
            if (n % 2 == 1) {
                i = g(i, z);
            }
            z = g(z, z);
            n /= 2;
        }
        return i[1][0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] I = new long[n];
        I[0] = 1;
        I[1] = 1;
        for (int i = 2; i < n; i++) {
            I[i] = (M - M / i) * I[M % i] % M;
        }
        long r = f(m + 2 * n - 2);
        long c = 1;
        for (int i = 0; i < n - 1; i++) {
            r = (r + c * (M - f(2 * n - 2 - 2 * i))) % M;
            c = c * (m + i) * I[i + 1] % M;
        }
        System.out.println(r);
    }
}