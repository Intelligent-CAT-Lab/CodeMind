import java.util.Arrays;

public class p03646 {
    public static void main(String[] args) {
        int K = 0;
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = j == i + 1 ? 1 : 0;
            }
        }
        A[N - 1][0] = 1;

        int[][][] B = new int[N][N][N];
        B[0] = new int[N][N];
        for (int i = 0; i < N; i++) {
            B[0][i][i] = 1;
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
                    C[i][j][k] = C[i-1][j][k] + B[i][j][k];
                }
            }
        }

        System.out.println(N);
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = N - i - 1;
        }

        if (K == 0) {
            System.out.println(Arrays.toString(X));
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            Arrays.fill(b, -1);
            b[0] = N;

            int[] temp1 = new int[N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    temp1[i] += X[j] * B[(r + 1) % N][j][i];
                }
            }

            int[] temp2 = new int[N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    temp2[i] += b[j] * q * C[N - 1][j][i];
                }
            }

            for (int i = 0; i < N; i++) {
                temp2[i] += C[r][i];
            }

            for (int i = 0; i < N; i++) {
                X[i] = temp1[i] + temp2[i];
            }

            System.out.println(Arrays.toString(X));
        }
    }
}