import java.util.Arrays;
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
        for (int i = 0; i < N; i++) {
            B[i] = Arrays.copyOf(A[i], N);
        }
        for (int i = 1; i < N; i++) {
            B[i] = matrixMultiply(B[i - 1], A);
        }
        int[][] C = new int[N][N];
        for (int i = 0; i < N; i++) {
            C[i] = Arrays.copyOf(A[i], N);
        }
        for (int i = 1; i < N; i++) {
            C[i] = matrixAdd(C[i - 1], B[i]);
        }
        System.out.println(N);
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        X = Arrays.copyOf(X, N);
        if (K == 0) {
            System.out.println(Arrays.toString(X));
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            b[0] = N;
            for (int i = 1; i < N; i++) {
                b[i] = -1;
            }
            X = matrixMultiply(X, B[(r + 1) % N]);
            X = matrixAdd(X, matrixMultiply(b, q * C[N - 1] + C[r]));
            System.out.println(Arrays.toString(X));
        }
    }

    private static int[] matrixMultiply(int[][] A, int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    private static int[] matrixAdd(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
}