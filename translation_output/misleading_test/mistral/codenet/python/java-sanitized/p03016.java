import java.math.BigInteger;
import java.util.Scanner;

public class p03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();

        int first_d = String.valueOf(a).length();
        int tail = a + b * (l - 1);

        int lo = -1;
        int[][] state = {{0, a % m, 1}};

        for (int d = first_d; d < 19; d++) {
            int hi = (int) Math.pow(10, d, m) - a / b - 1;
            int cnt = hi - lo;
            int[][] coe = {{Math.pow(10, d, m), 0, 0},
                            {1, 1, 0},
                            {0, b % m, 1}};

            coe = exp(coe, cnt, m);
            state = multiply(state, coe);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    public static BigInteger exp(int[][] coe, int cnt, int mod) {
        BigInteger[][] r = new BigInteger[coe.length][coe[0].length];
        for (int i = 0; i < coe.length; i++) {
            for (int j = 0; j < coe[0].length; j++) {
                r[i][j] = BigInteger.ZERO;
            }
        }
        BigInteger t = new BigInteger(coe[0][0], mod);
        BigInteger r0 = new BigInteger(coe[0][1], mod);
        BigInteger r1 = new BigInteger(coe[0][2], mod);

        for (int e = cnt; e > 0; e >>= 1) {
            if ((e & 1) == 1) {
                r = multiply(r, t, mod);
            }
            t = multiply(t, t, mod);
        }
        return r[0][0];
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}