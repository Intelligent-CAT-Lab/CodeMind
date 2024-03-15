import java.util.Scanner;
import java.util.Arrays;

public class p03646 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        final int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(A[i], 0);
            if (i < N - 1) {
                A[i][i + 1] = 1;
            }
        }
        A[N - 1][0] = 1;

        int[][][] B = new int[N][][];
        B[0] = new int[N][N];
        for (int i = 0; i < N; i++) {
            B[0][i][i] = 1; // identity matrix
        }

        for (int i = 1; i < N; i++) {
            B[i] = matMul(B[i - 1], A);
        }

        int[][][] C = new int[N][][];
        C[0] = new int[N][N];
        for (int i = 0; i < N; i++) {
            C[0][i][i] = 1; // identity matrix
        }

        for (int i = 1; i < N; i++) {
            C[i] = matAdd(C[i - 1], B[i]);
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
            Arrays.fill(b, -1);
            b[0] = N;
            X = matMul(X, B[(r + 1) % N]);
            X = matVecAdd(X, scaleAdd(b, q, C[N - 1], C[r]));
            printArray(X);
        }
        scanner.close();
    }

    private static int[] scaleAdd(int[] vec, int scale, int[][] mat1, int[][] mat2) {
        int[] result = new int[vec.length];
        for (int i = 0; i < vec.length; i++) {
            result[i] = vec[i] * scale;
            for (int j = 0; j < vec.length; j++) {
                result[i] += mat1[i][j] * scale + mat2[i][j];
            }
        }
        return result;
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[][] matMul(int[][] mat1, int[][] mat2) {
        int[][] result = new int[mat