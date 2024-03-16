Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static final int N = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
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
            B[i] = multiplyMatrices(B[i - 1], A);
        }

        int[][] C = new int[N][N];
        C[0] = identityMatrix(N);
        for (int i = 1; i < N; i++) {
            C[i] = addMatrices(C[i - 1], B[i]);
        }

        System.out.println(N);
        int[] X = createReversedArray(N);
        if (K == 0) {
            printArray(X);
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;

            int[] b = new int[N];
            Arrays.fill(b, -1);
            b[0] = N;

            X = multiplyMatrixByVector(B[(r + 1) % N], X);
            incrementVectorByMatrix(X, multiplyVectorByMatrix(b, q, C[N - 1], C[r]));
            printArray(X);
        }

        scanner.close();
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static int[] createReversedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i - 1;
        }
        return array;
    }

    private static int[] multiplyMatrixByVector(int[][] matrix, int[] vector) {
        int[] result = new int[vector.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }
        return result;
    }

    private static void incrementVectorByMatrix(int[] vector, int[] increment) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] += increment[i];
        }
    }

    private static int[] multiplyVectorByMatrix(int[] vector, int scaleFactor, int[]... matrices) {
        int[] result = new int[vector.length];
        Arrays.fill(result, 0);
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                for (int k = 0; k < vector.length; k++) {
                    result[k] += vector[j] * matrices[i][j][k];
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            result[i] *= scaleFactor;
        }
        return result;
    }

    private static int[] identityMatrix(int size) {
        int[] identity = new int[size * size];
        for (int i = 0; i < size; i++) {
            identity[i * size + i] = 1;
        }
        return identity;
    }

    private static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
}
```

This Java program performs similar calculations as the Python code but with several adjustments necessary due to differences between the Python and Java programming languages, such as numpy array handling versus Java array handling and explicit typing and array initialization.
