import java.util.*;

public class p03935 {
    static int M = 998244353;
    static int[][] I = {{1, 1}};
    static int[][] z = {{1, 1, 1, 0}};
    static int[] e = {1, 0, 0, 1};
    static int n, m;
    static int[] g(int[] a, int[] b) {
        int[] res = new int[4];
        res[0] = (a[0] * b[0] + a[1] * b[2]) % M;
        res[1] = (a[0] * b[1] + a[1] * b[3]) % M;
        res[2] = (a[2] * b[0] + a[3] * b[2]) % M;
        res[3] = (a[2] * b[1] + a[3] * b[3]) % M;
        return res;
    }

    static int f(int n) {
        while (n != 0) {
            e = g(e, z)[n % 2];
            z = g(z, z);
            n /= 2;
        }
        return e[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            I = Arrays.copyOfRange(I, 0, i);
            I[i % I[0]] = (M - M / i) * I[M % i] % M;
        }
        int r = f(m + 2 * n - 2);
        int c = 1;
        for (int i = 1; i < n; i++) {
            r = (r + c * (M - f(2 * n - 2 - 2 * i))) % M;
            c = c * (m + i) * I[i] % M;
        }
        System.out.println(r);
    }
}