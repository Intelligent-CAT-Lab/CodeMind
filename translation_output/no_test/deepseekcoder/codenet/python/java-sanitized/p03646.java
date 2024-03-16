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
        B[0] = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = matrixMultiply(B[i - 1], A)[0];
        }
        int[][] C = new int[N][N];
        C[0] = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = matrixAdd(C[i - 1], B[i])[0];
        }
        System.out.println(N);
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        if (K == 0) {
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(X[i] + " ");
            }
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            b[0] = N;
            X = matrixMultiply(X, B[(r + 1) % N])[0];
            X = matrixAdd(X, matrixMultiply(b, q * C[N - 1] + C[r])[0]);
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(X[i] + " ");
            }
        }
    }

    private static int[][] matrixMultiply(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    private static int[][] matrixAdd(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}