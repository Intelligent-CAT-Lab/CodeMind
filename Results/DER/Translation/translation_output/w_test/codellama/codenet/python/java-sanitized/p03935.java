import java.util.Scanner;

public class p03935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] I = new int[n + 1];
        I[0] = 1;
        I[1] = 1;
        for (int i = 2; i <= n; i++) {
            I[i] = (M - M / i) * I[M % i] % M;
        }
        int r = f(m + 2 * n - 2);
        int c = 1;
        for (int i = 0; i < n - 1; i++) {
            r = (r + c * (M - f(2 * n - 2 - 2 * i))) % M;
            c = c * (m + i) * I[i + 1] % M;
        }
        System.out.println(r);
    }

    public static int f(int n) {
        int[] e = new int[4];
        e[0] = 1;
        e[1] = 0;
        e[2] = 0;
        e[3] = 1;
        int[] z = new int[4];
        z[0] = 1;
        z[1] = 1;
        z[2] = 1;
        z[3] = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                e = g(e, z);
            } else {
                e = g(e, z);
                z = g(z, z);
            }
            n /= 2;
        }
        return e[1];
    }

    public static int[] g(int[] a, int[] b) {
        int[] c = new int[4];
        c[0] = (a[0] * b[0] + a[1] * b[2]) % M;
        c[1] = (a[0] * b[1] + a[1] * b[3]) % M;
        c[2] = (a[2] * b[0] + a[3] * b[2]) % M;
        c[3] = (a[2] * b[1] + a[3] * b[3]) % M;
        return c;
    }
}