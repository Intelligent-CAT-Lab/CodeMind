import java.util.*;

public class p03935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int M = 998244353;
        int[] e = {1, 0, 0, 1};
        int[] z = {1, 1, 1, 0};
        while (n > 0) {
            e = multiply(e, z);
            z = multiply(z, z);
            n /= 2;
        }
        int r = e[1];
        int[] I = {1, 1};
        for (int i = 2; i < n; i++) {
            I[i] = (M - M / i) * I[M % i] % M;
        }
        int c = 1;
        for (int i = 0; i < n - 1; i++) {
            r = (r + c * (M - f(2 * n - 2 - 2 * i))) % M;
            c = c * (m + i) * I[i + 1] % M;
        }
        System.out.println(r);
    }

    public static int[] multiply(int[] a, int[] b) {
        int[] c = new int[4];
        c[0] = (a[0] * b[0] + a[1] * b[2]) % M;
        c[1] = (a[0] * b[1] + a[1] * b[3]) % M;
        c[2] = (a[2] * b[0] + a[3] * b[2]) % M;
        c[3] = (a[2] * b[1] + a[3] * b[3]) % M;
        return c;
    }

    public static int f(int n) {
        int[] e = {1, 0, 0, 1};
        int[] z = {1, 1, 1, 0};
        while (n > 0) {
            e = multiply(e, z);
            z = multiply(z, z);
            n /= 2;
        }
        return e[1];
    }
}