import java.util.Scanner;

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
        int[][][] B = new int[N][N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j][j] = 1;
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        B[i][j][k] += B[i - 1][j][l] * A[l][k];
                    }
                }
            }
        }
        int[][][] C = new int[N][N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j][j] = 1;
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        C[i][j][k] += C[i - 1][j][l] * B[i][l][k];
                    }
                }
            }
        }
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = N - i - 1;
        }
        if (K == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
            System.out.println();
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            b[0] = N;
            for (int i = 0; i < N; i++) {
                X[i] = 0;
                for (int j = 0; j < N; j++) {
                    X[i] += X[j] * B[r + 1][i][j];
                }
            }
            for (int i = 0; i < N; i++) {
                X[i] += b[0] * (q * C[N - 1][0][i] + C[r][0][i]);
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
            System.out.println();
        }
    }
}