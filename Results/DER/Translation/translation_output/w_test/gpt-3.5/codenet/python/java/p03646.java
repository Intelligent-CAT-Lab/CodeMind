```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int K = 0;
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = (j == i+1) ? 1 : 0;
            }
        }
        A[N-1][0] = 1;

        int[][][] B = new int[N][N][N];
        B[0] = new int[N][N];
        for (int j = 0; j < N; j++) {
            B[0][j][j] = 1;
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        B[i][j][k] += B[i-1][j][l] * A[l][k];
                    }
                }
            }
        }

        int[][][] C = new int[N][N][N];
        C[0] = new int[N][N];
        for (int j = 0; j < N; j++) {
            C[0][j][j] = 1;
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    C[i][j][k] = C[i-1][j][k] + B[i][j][k];
                }
            }
        }

        System.out.println(N);
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = N-1 - i;
        }
        if (K == 0) {
            System.out.println(Arrays.toString(X));
        } else {
            int r = (K-1) % N;
            int q = (K-1) / N;
            int[] b = new int[N];
            Arrays.fill(b, -1);
            b[0] = N;
            X = multiplyMatrixAndVector(X, B[(r+1) % N]);
            for (int i = 0; i < N; i++) {
                X[i] += b[i] * q * C[N-1][N-1][i] + C[r][N-1][i];
            }
            System.out.println(Arrays.toString(X));
        }
    }

    public static int[] multiplyMatrixAndVector(int[] vector, int[][] matrix) {
        int[] result = new int[vector.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }
        return result;
    }
}
```
```
