import java.util.Scanner;
import java.util.Arrays;

public class p03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int firstD = (int) Math.log10(a);
        int tail = a + b * (l - 1);

        int lo = -1;
        int[][] state = new int[][] {{0, a % m, 1}};

        for (int d = firstD; d <= 19; d++) {
            int hi = Math.min((int) Math.pow(10, d) - 1 - a, l - 1);
            int cnt = hi - lo;
            int[][] coe = new int[][] {{pow(10, d, m), 0, 0}, {1, 1, 0}, {0, b % m, 1}};

            coe = expMod(coe, cnt, m);
            state = matrixMultiply(state, coe);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    public static int[][] expMod(int[][] coe, int cnt, int m) {
        int[][] result = new int[coe.length][coe[0].length];
        for (int i = 0; i < coe.length; i++) {
            for (int j = 0; j < coe[0].length; j++) {
                result[i][j] = (int) Math.pow(coe[i][j], cnt) % m;
            }
        }
        return result;
    }

    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}