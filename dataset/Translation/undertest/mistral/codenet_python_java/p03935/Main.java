import java.util.*;

public class p03935 {
    static int M = 998244353;
    static int[][] I = {{1, 1}};

    static int g(int[] a, int[] b) {
        int[] res = new int[4];
        res[0] = (a[0] * b[0] + a[1] * b[2]) % M;
        res[1] = (a[0] * b[1] + a[1] * b[3]) % M;
        res[2] = (a[2] * b[0] + a[3] * b[2]) % M;
        res[3] = (a[2] * b[1] + a[3] * b[3]) % M;
        return res;
    }

    static int f(int n) {
        int[] e = {1, 0, 0, 1};
        int[] z = {1, 1, 1, 0};
        while (n != 0) {
            e = g(e, z)[n % 2];
            z = g(z, z);
            n /= 2;
        }
        return e[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        I = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            I[i][0] = 1;
            for (int j = 1; j <= m; j++) {
                I[i][j] = (M - M / i) * I[i][M % i] % M;
            }
        }
        int r = f(m + 2 * n - 2);
        int c = 1;
        for (int i = 2; i <= n; i++) {
            c = (c * (m + i) * I[i][1]) % M;
            r = (r + c * (M - f(2 * n - 2 - 2 * i))) % M;
        }
        System.out.println(r);
    }
}