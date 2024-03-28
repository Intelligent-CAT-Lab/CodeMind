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
            Arrays.fill(b, -1);
            b[0] = N;
            X = matrixMultiply(X, B[(r + 1) % N]);
            X = matrixAdd(X, matrixMultiply(b, q * C[N - 1] + C[r]));
            System.out.println(Arrays.toString(X));
        }
    }

    private static int[] matrixMultiply(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * b[i];
        }
        return result;
    }

    private static int[] matrixAdd(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }
}