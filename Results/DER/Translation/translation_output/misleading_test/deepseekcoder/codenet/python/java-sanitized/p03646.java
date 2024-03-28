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
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = N - i - 1;
        }
        if (K == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            b[0] = N;
            X = matrixMultiply(X, B[(r + 1) % N])[0];
            X = matrixAdd(X, matrixMultiply(b, q * C[N - 1] + C[r])[0]);
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }

    public static int[][] matrixMultiply(int[][] A, int[][] B) {
        int N = A.length;
        int[][] C = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static int[][] matrixAdd(int[][] A, int[][] B) {
        int N = A.length;
        int[][] C = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
}