import java.util.Scanner;

public class p03935 {
    static int M = 998244353;

    static int[] g(int[] a, int[] b) {
        return new int[]{
                (int)(((long)a[0]*b[0] + (long)a[1]*b[2]) % M),
                (int)(((long)a[0]*b[1] + (long)a[1]*b[3]) % M),
                (int)(((long)a[2]*b[0] + (long)a[3]*b[2]) % M),
                (int)(((long)a[2]*b[1] + (long)a[3]*b[3]) % M)
        };
    }

    static int f(int n) {
        int[] e = {1, 0, 0, 1};
        int[] z = {1, 1, 1, 0};
        while (n > 0) {
            e = n % 2 == 1 ? g(e, z) : e;
            z = g(z, z);
            n /= 2;
        }
        return e[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] I = {1, 1};
        int r = f(m + 2 * n - 2);
        int c = 1;

        for (int i = 2; i < n; i++) {
            I = java.util.Arrays.copyOf(I, I.length + 1);
            I[i] = (int)(((long)(M - M/i) * I[M % i]) % M);
        }

        for (int i = 0; i < n - 1; i++) {
            r = (int)(((long)(r + c * (M - f(2 * n - 2 - 2 * i))) % M));
            c = (int)(((long)(c * (m + i) * I[i+1]) % M);
        }

        System.out.println(r);
    }
}