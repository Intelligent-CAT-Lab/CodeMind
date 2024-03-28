import java.util.*;

public class p03646 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
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
        Arrays.fill(B, 0);
        B[0] = (int[]) Arrays.copyOf(new int[N], N);
        for (int i = 1; i < N; i++) {
            B[i] = Arrays.stream(B[i - 1]).mapToInt(a -> Arrays.stream(A).sum()).toArray();
        }
        int[] C = new int[N];
        Arrays.fill(C, 0);
        C[0] = (int[]) Arrays.copyOf(new int[N], N);
        for (int i = 1; i < N; i++) {
            C[i] = (C[i - 1] + B[i]).toArray();
        }
        int[] X = new int[N];
        Arrays.fill(X, 0);
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        Arrays.reverse(X);
        if (K == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            Arrays.fill(b, 0);
            b[0] = N;
            b = (int[]) Arrays.copyOf(b, N);
            X = Arrays.stream(X).map(a -> a * B[(r + 1) % N]).toArray();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += b[i] * (q * C[N - 1] + C[r]);
            }
            for (int i = 0; i < N; i++) {
                X[i] += sum;
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}