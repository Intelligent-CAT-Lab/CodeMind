Here's the translated Java code from the given Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class ExpMatrix {

    public static long[][] expMatrix(long[][] a, long e, long m) {
        long[][] r = identityMatrix(a.length);
        long[][] t = matrixCopy(a);
        while (e > 0) {
            if (e % 2 != 0) {
                r = matrixMod(matrixMultiply(r, t), m);
            }
            t = matrixMod(matrixMultiply(t, t), m);
            e >>= 1;
        }
        return r;
    }

    public static long[][] identityMatrix(int size) {
        long[][] result = new long[size][size];
        for (int i = 0; i < size; i++) {
            result[i][i] = 1;
        }
        return result;
    }

    public static long[][] matrixCopy(long[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        long[][] copy = new long[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(matrix[i], 0, copy[i], 0, cols);
        }
        return copy;
    }

    public static long[][] matrixMultiply(long[][] a, long[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        long[][] result = new long[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static long[][] matrixMod(long[][] matrix, long modulus) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        long[][] result = new long[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] % modulus;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long m = scanner.nextLong();

        int firstD = String.valueOf(a).length();
        long tail = a + b * (l - 1);

        long lo = -1;
        long[][] state = {{0, a % m, 1}};

        for (int d = firstD; d < 19; d++) {
            long hi = Math.min(BigInteger.valueOf(10).pow(d).subtract(BigInteger.valueOf(a)).divide(BigInteger.valueOf(b)).longValue(), l - 1);
            long cnt = hi - lo;
            long[][] coe = {
                {BigInteger.valueOf(10).pow(d).mod(BigInteger.valueOf(m)).longValue(), 0, 0},
                {1, 1, 0},
                {0, b % m, 1}
            };

            coe = expMatrix(coe, cnt, m);
            state = matrixMod(matrixMultiply(state, coe), m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
        scanner.close();
    }
}
```

In this Java code, I've replaced the numpy operations with custom methods to perform matrix multiplication and modular operations, as Java does not have a built-in equivalent to numpy. I've utilized the `BigInteger` class for certain large number operations, such as `pow()` with mod. The main logic of the algorithm remains unchanged.
