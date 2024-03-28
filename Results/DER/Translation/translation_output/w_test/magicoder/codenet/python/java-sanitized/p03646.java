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
            B[i] = multiplyMatrices(B[i - 1], A);
        }
        int[][] C = new int[N][N];
        C[0] = identityMatrix(N);
        for (int i = 1; i < N; i++) {
            C[i] = addMatrices(C[i - 1], B[i]);
        }
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
            X = multiplyMatrixAndArray(X, B[(r + 1) % N]);
            X = addArrayAndMatrix(X, multiplyArrayAndMatrix(b, q * C[N - 1] + C[r]));
            printArray(X);
        }
    }

    private static int[][] identityMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int size = matrix