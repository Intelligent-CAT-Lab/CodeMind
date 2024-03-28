To translate the given Python code to Java, we need to handle the matrix and vector operations manually, since Java doesn't have a built-in library as comprehensive as NumPy in Python for such operations. The following is the Java translation of the Python code:

```java
import java.util.Scanner;

public class MatrixTransformation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = (j == i + 1) ? 1 : 0;
            }
        }
        A[N - 1][0] = 1;

        int[][] B = new int[N][N];
        B[0] = identityMatrix(N);
        for (int i = 1; i < N; i++) {
            B[i] = matrixMultiplication(B[i - 1], A);
        }

        int[][] C = new int[N][N];
        C[0] = identityMatrix(N);
        for (int i = 1; i < N; i++) {
            C[i] = matrixAddition(C[i - 1], B[i]);
        }

        System.out.println(N);
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = N - 1 - i;
        }

        if (K == 0) {
            printArray(X);
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            b[0] = N;
            for (int i = 1; i < N; i++) {
                b[i] = -1;
            }
            X = matrixMultiplication(X, B[(r + 1) % N]);
            int[] temp = matrixMultiplication(b, scalarMultiplication(q, C[N - 1]));
            X = vectorAddition(X, vectorAddition(temp, C[r]));
            printArray(X);
        }
        scanner.close();
    }

    private static int[] identityMatrix(int N) {
        int[] I = new int[N];
        for (int i = 0; i < N; i++) {
            I[i] = 1;
        }
        return I;
    }

    private static int[] matrixMultiplication(int[] vector, int[][] matrix) {
        int[] result = new int[vector.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i] += vector[j] * matrix[j][i];
            }
        }
        return result;
    }

    private static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    private static int[][] matrixAddition(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    
    private static int[][] scalarMultiplication(int scalar, int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = scalar * matrix[i][j];
            }
        }
        return result;
    }

    private static int[] vectorAddition(int[] vector1, int[] vector2) {
        int[] result = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            result[i] = vector1[i] + vector2[i];
        }
        return result;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```

Note: We need additional helper functions to perform operations like identity matrix creation, matrix multiplication, matrix addition, scalar multiplication, and vector addition since Java does not have built-in support for these operations. Also, I simplified the matrix creation to work with just 1D arrays for the identity matrix and the final vector `X` since only diagonal and certain other columns of the matrices were being used. These changes reflect Java's standard conventions for dealing with multi-dimensional arrays and arithmetic operations.
