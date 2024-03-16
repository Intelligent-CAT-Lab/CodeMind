import java.util.Arrays;
import java.util.Scanner;

public class p03646 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(A[i], 0);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = (j == i + 1) ? 1 : 0;
            }
        }
        A[N - 1][0] = 1;
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = 0;
        }
        B[0] = getIdentity(N);
        for (int i = 1; i < N; i++) {
            B[i] = multiply(B[i - 1], A);
        }
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = 0;
        }
        C[0] = getIdentity(N);
        for (int i = 1; i < N; i++) {
            C[i] = add(C[i - 1], B[i]);
        }
        System.out.println(N);
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        Arrays.reverse(X);
        if (K == 0) {
            printArray(X);
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            Arrays.fill(b, -1);
            b[0] = N;
            b = multiply(b, q);
            X = multiply(X, B[(r + 1) % N]);
            X = add(X, multiply(b, q * C[N - 1] + C[r]));
            printArray(X);
        }
    }

    public static int[] multiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static int[] add(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

    public static int[] getIdentity(int n) {
        int[] result = new int[n];
        Arrays.fill(result, 1);
        return result;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}