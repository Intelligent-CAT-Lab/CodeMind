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
                A[i][j] = 1;
                if (j == i + 1) {
                    A[i][j] = 0;
                }
            }
        }
        A[N - 1][0] = 1;
        int[] B = new int[N];
        Arrays.fill(B, 0);
        B[0] = 1;
        for (int i = 1; i < N; i++) {
            B[i] = Arrays.stream(B).mapToInt(x -> x * A[i - 1]).toArray();
        }
        int[] C = new int[N];
        Arrays.fill(C, 0);
        C[0] = 1;
        for (int i = 1; i < N; i++) {
            C[i] = C[i - 1] + B[i];
        }
        int[] X = new int[N];
        Arrays.fill(X, 0);
        for (int i = 0; i < N; i++) {
            X[i] = i;
        }
        Arrays.reverse(X);
        if (K == 0) {
            for (int x : X) {
                System.out.print(x + " ");
            }
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            Arrays.fill(b, 0);
            b[0] = N;
            b = Arrays.copyOf(b, b.length);
            X = Arrays.stream(X).mapToInt(x -> x * B[(r + 1) % N]).toArray();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += b[i] * C[N - 1 + i] + C[i];
            }
            for (int x : X) {
                System.out.print(x + " ");
            }
            System.out.println(sum);
        }
    }
}