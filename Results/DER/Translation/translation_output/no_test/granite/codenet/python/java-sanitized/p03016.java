import java.util.*;

public class p03016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();

        int firstD = (int)Math.floor(Math.log10(a)) + 1;
        int tail = a + b * (l - 1);

        int lo = -1;
        int[][] state = {{0, a % m, 1}};

        for (int d = firstD; d <= 18; d++) {
            int hi = Math.min((int)Math.floor((Math.pow(10, d) - 1 - a) / b), l - 1);
            int cnt = hi - lo;
            int[][] coe = {{(int)Math.pow(10, d) % m, 0, 0}, {1, 1, 0}, {0, b % m, 1}};

            coe = matrixPower(coe, cnt, m);
            state = matrixMultiply(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    public static int[][] matrixPower(int[][] matrix, int power, int mod) {
        int[][] result = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] temp = matrix;

        while (power > 0) {
            if (power % 2 == 1) {
                result = matrixMultiply(result, temp, mod);
            }
            temp = matrixMultiply(temp, temp, mod);
            power /= 2;
        }

        return result;
    }

    public static int[][] matrixMultiply(int[][] matrix1, int[][] matrix2, int mod) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                    result[i][j] %= mod;
                }
            }
        }

        return result;
    }
}