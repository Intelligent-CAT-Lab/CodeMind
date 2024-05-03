import java.util.Scanner;

public class p03935 {
    static int M = 998244353;
    static int[][] g(int[][] a, int[][] b) {
        int[][] result = new int[4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = (a[i][0] * b[i][0] + a[i][1] * b[i][1]) % M;
            }
        }
        return result;
    }

    static int f(int n) {
        int[][] e = {{1, 0}, {0, 0}, {1, 0}, {0, 1}};
        int[][] z = {{1, 1}, {1, 0}, {1, 0}, {0, 1}};
        while (n > 0) {
            e = (n % 2 == 0) ? e : g(e, z);
            z = g(z, z);
            n /= 2;
        }
        return e[1][1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] I = {1, 1};
        int r = f(m + 2 * n - 2);
        int c = 1;
        for (int i = 2; i < n; i++) {
            I = new int[]{(M - M / i) * I[M % i] % M, I[1]};
        }
        for (int i = 0; i < n - 1; i++) {
            r = (r + c * (M - f(2 * n - 2 - 2 * i))) % M;
            c = c * (m + i) * I[i + 1] % M