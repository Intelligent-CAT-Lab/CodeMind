import java.util.Arrays;

public class p03646 {
    public static void main(String[] args) {
        int K = Integer.parseInt(System.console().readLine());
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
        Arrays.fill(B[0], 1);
        for (int i = 1; i < N; i++) {
            B[i] = multiply(B[i - 1], A);
        }
        int[][] C = new int[N][N];
        C[0] = new int[N];
        Arrays.fill(C[0], 1);
        for (int i = 1; i < N; i++) {
            C[i] = add(C[i - 1], B[i]);
        }
        System.out.println(N);
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = N - 1 - i;
        }
        if (K == 0) {
            for (int x : X) {
                System.out.print(x + " ");
            }
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            b[0] = N;
            X = multiply(X, B[(r + 1) % N]);
            for (int i = 0; i < N; i++) {
                X[i] += b