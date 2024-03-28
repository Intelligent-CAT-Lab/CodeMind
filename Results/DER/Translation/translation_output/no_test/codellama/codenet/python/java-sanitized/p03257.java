import java.util.Scanner;
import java.util.Arrays;

public class p03257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = 1;
            }
        }
        for (int n = 0; n < N; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < N; i++) {
                    A[n][i] *= primes[n / 2 + i];
                    A[n][i] *= primes[N + M - n / 2 - i];
                    A[n][i + 1] *= A[n][i];
                    A[n][i + 1] += 1;
                }
            } else {
                for (int i = 0; i < N; i++) {
                    A[n][i + 1] *= primes[(n + 1) / 2 + i];
                    A[n][i + 1] *= primes[N + M - (n - 1) / 2 - i];
                    A[n][i] *= A[n][i + 1];
                    A[n][i + 2] *= A[n][i + 1];
                    A[n][i] += 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}