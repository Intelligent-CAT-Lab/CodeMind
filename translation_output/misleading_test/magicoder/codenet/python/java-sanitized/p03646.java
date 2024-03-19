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
        B[0][0] = 1;
        for (int i = 1; i < N; i++) {
            B[i] = multiply(B[i - 1], A);
        }
        int[][] C = new int[N][N];
        C[0] = new int[N];
        C[0][0] = 1;
        for (int i = 1; i < N; i++) {
            C[i] = add(C[i - 1], B[i]);
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
            X = multiply(X, B[(r + 1) % N]);
            X = add(X, multiply(b, q * C[N - 1] + C[r]));
            printArray(X);
        }
    }

    private static int[] multiply(int[] a, int[][] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                result[i] += a[j] * b[j][i];
            }
        }
        return result;
    }

    private static int[] add(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
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