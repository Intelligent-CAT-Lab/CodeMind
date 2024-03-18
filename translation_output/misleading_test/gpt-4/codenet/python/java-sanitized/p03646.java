import java.util.Scanner;

public class p03646 {

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
        int[][] result = new int[matrix