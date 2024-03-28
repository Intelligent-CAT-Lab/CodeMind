import java.math.BigInteger;
import java.util.Scanner;

public class p03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();

        int firstD = String.valueOf(a).length();
        int tail = a + b * (l - 1);

        int[][] state = {{0, a % m, 1}};
        int lo = -1;

        for (int d = firstD; d < 19; d++) {
            int hi = Math.min((int) ((Math.pow(10, d) - 1 - a) / b), l - 1);
            int cnt = hi - lo;
            int[][] coe = {{
                (int) Math.pow(10, d) % m, 0, 0},
                {1, 1, 0},
                {0, b % m, 1}};

            coe = exp(coe, cnt, m);
            state = multiply(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    private static int[][] exp(int[][] a, int e, int m) {
        int[][] r = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] t = a.clone();
        while (e > 0) {
            if ((e & 1) == 1) {
                r = multiply(r, t, m);
            }
            t = multiply(t, t, m);
            e >>= 1;
        }
        return r;
    }

    private static int[][] multiply(int[][] a, int[][] b, int m) {
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % m;
                }
            }
        }
        return c;
    }
}