```java
import java.util.Scanner;

public class ExponentialModulo {
    public static long[][] matrixMultiplication(long[][] a, long[][] b, int mod) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        long[][] result = new long[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] = (result[i][j] + a[i][k] * b[k][j] % mod) % mod;
                }
            }
        }

        return result;
    }

    public static long[][] matrixExponentiation(long[][] base, long exp, int mod) {
        int size = base.length;
        long[][] result = new long[size][size];
        for (int i = 0; i < size; i++) {
            result[i][i] = 1;
        }

        long[][] temp = base;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = matrixMultiplication(result, temp, mod);
            }
            temp = matrixMultiplication(temp, temp, mod);
            exp = exp / 2;
        }

        return result;
    }

    public static long calculateResult(int l, int a, int b, int m) {
        long[][] state = new long[][]{{0, a % m, 1}};

        int first_d = String.valueOf(a).length();
        long tail = a + b * (l - 1);

        int lo = -1;
        for (int d = first_d; d < 19; d++) {
            int hi = Math.min((int) ((Math.pow(10, d) - 1 - a) / b), l - 1);
            int cnt = hi - lo;

            long[][] coe = new long[][]{
                    {modPow(10, d, m), 0, 0},
                    {1, 1, 0},
                    {0, b % m, 1}
            };

            coe = matrixExponentiation(coe, cnt, m);
            state = matrixMultiplication(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        return state[0][0];
    }

    public static long modPow(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp = exp / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();

        long result = calculateResult(l, a, b, m);
        System.out.println(result);
    }
}
```
```
