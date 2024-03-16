import java.util.Scanner;
import java.util.Arrays;

public class p03646 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
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
            B[i] = matrixMultiplication(B[i - 1], A);
        }
        int[][] C = new int[N][N];
        for (int i = 0; i < N; i++) {
            C[i] = Arrays.copyOf(A[i], N);
        }
        for (int i = 1; i < N; i++) {
            C[i] = matrixAddition(C[i - 1], B[i]);
        }
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        X = reverseArray(X);
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
            X = matrixAddition(X, matrixMultiplication(b, q * C[N - 1] + C[r]));
            printArray(X);
        }
    }

    public static int[] matrixMultiplication(int[][] A, int[][] B) {
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

    public static int[] matrixAddition(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static int[] reverseArray(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[A.length - i - 1];
        }
        return B;
    }

    public static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}