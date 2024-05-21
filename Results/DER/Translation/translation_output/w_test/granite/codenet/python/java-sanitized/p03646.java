import java.util.*;

public class p03646 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = (j == i + 1)? 1 : 0;
            }
        }
        A[N - 1][0] = 1;
        int[][] B = new int[N][N];
        for (int i = 0; i < N; i++) {
            B[i][i] = 1;
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    B[i][j] += A[i - 1][k] * B[i - 1][j];
                }
            }
        }
        int[][] C = new int[N][N];
        for (int i = 0; i < N; i++) {
            C[i][i] = 1;
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = C[i - 1][j] + B[i][j];
            }
        }
        System.out.println(N);
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
            for (int i = 0; i < N; i++) {
                X[i] = (int) (((long) X[i] * B[(r + 1) % N][i]) % N);
            }
            for (int i = 0; i < N; i++) {
                X[i] = (X[i] + b[i] * q % N * C[N - 1][i] + C[r][i]) % N;
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}