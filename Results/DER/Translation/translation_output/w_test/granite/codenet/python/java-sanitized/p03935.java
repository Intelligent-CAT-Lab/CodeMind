import java.util.*;

public class p03935 {
    static int M = 998244353;
    static long[][] mul(long[][] a, long[][] b) {
        long[][] c = new long[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % M;
                }
            }
        }
        return c;
    }
    static long[][] pow(long[][] a, long n) {
        long[][] res = new long[4][4];
        for (int i = 0; i < 4; i++) {
            res[i][i] = 1;
        }
        while (n > 0) {
            if (n % 2 == 1) {
                res = mul(res, a);
            }
            a = mul(a, a);
            n /= 2;
        }
        return res;
    }
    static long fib(long n) {
        if (n == 0) {
            return 0;
        }
        long[][] a = new long[4][4];
        a[0][0] = a[0][1] = a[1][0] = a[2][1] = a[3][2] = a[3][3] = 1;
        a = pow(a, n);
        return a[1][0];
    }
    static long modInv(long a) {
        return pow(a, M - 2);
    }
    static long comb(long n, long k) {
        if (k > n) {
            return 0;
        }
        long[] fact = new long[(int) n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % M;
        }
        return fact[(int) n] * modInv(fact[(int) k]) % M * modInv(fact[(int) (n - k)]) % M;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = fib(m + 2 * n - 2);
        long[] inv = new long[n];
        inv[0] = 1;
        for (int i = 1; i < n; i++) {
            inv[i] = (M - M / i) * inv[M % i] % M;
        }
        long c = 1;
        for (int i = 1; i < n; i++) {
            ans = (ans + c * (M - fib(2 * n - 2 - 2 * i))) % M;
            c = c * (m + i - 1) % M * inv[i] % M;
        }
        System.out.println(ans);
    }
}