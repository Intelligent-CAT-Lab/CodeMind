import java.util.Scanner;

public class p03646 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = j == i+1 ? 1 : 0;
            }
        }
        A[N-1][0] = 1;

        int[][][] B = new int[N][N][N];
        B[0] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[0][i][j] = i == j ? 1 : 0;
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        B[i][j][k] += B[i-1][j][l] * A[l][k];
                    }
                }
            }
        }

        int[][][] C = new int[N][N][N];
        C[0] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[0][i][j] = i == j ? 1 : 0;
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    C[i][j][k] = C[i-1][j][k];
                    for (int l = 0; l < N; l++) {
                        C[i][j][k] += B[i][j][l];
                    }
                }
            }
        }

        System.out.println(N);
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        
        if (K == 0) {
            for (int i = N-1; i >= 0; i--) {
                System.out.print(X[i] + " ");
            }
        } else {
            int r = (K-1) % N;
            int q = (K-1) / N;
            int[] b = new int[N];
            for (int i = 0; i < N; i++) {
                b[i] = i == 0 ? N : -1;
            }
            for (int i = 0; i < N; i++) {
                int sum = 0;
                for (int j = 0; j < N; j++) {
                    sum += X[j] * B[(r+1)%N][i][j];
                }
                X[i] += sum;
            }
            for (int i = 0; i < N; i++) {
                int sum = 0;
                for (int j = 0; j < N; j++) {
                    sum += b[j] * (q * C[N-1][i][j] + C[r][i][j]);
                }
                X[i] += sum;
            }

            for (int i = N-1; i >= 0; i--) {
                System.out.print(X[i] + " ");
            }
        }
    }
}