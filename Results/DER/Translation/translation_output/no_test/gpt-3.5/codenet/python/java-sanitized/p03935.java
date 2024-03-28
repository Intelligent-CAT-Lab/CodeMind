import java.util.Scanner;

public class p03935 {
    public static long mod = 998244353;

    public static long[] matrixMultiplication(long[] a, long[] b) {
        long[] result = new long[4];
        result[0] = (a[0] * b[0] + a[1] * b[2]) % mod;
        result[1] = (a[0] * b[1] + a[1] * b[3]) % mod;
        result[2] = (a[2] * b[0] + a[3] * b[2]) % mod;
        result[3] = (a[2] * b[1] + a[3] * b[3]) % mod;
        return result;
    }

    public static long functionF(int n) {
        long[] e = {1, 0, 0, 1};
        long[] z = {1, 1, 1, 0};
        while (n > 0) {
            e = (n % 2 == 1) ? matrixMultiplication(e, z) : e;
            z = matrixMultiplication(z, z);
            n /= 2;
        }
        return e[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] I = {1, 1};
        long r = functionF(m + 2 * n - 2);
        long c = 1;

        for (int i = 2; i < n; i++) {
            I = new long[]{I[0] * (mod - mod / i) % mod, I[1]};
        }

        for (int i = 0; i < n - 1; i++) {
            r = (r + c * (mod - functionF(2 * n - 2 - 2 * i))) % mod;
            c = c * (m + i) * I[i + 1] % mod;
        }

        System.out.println(r);
    }
}