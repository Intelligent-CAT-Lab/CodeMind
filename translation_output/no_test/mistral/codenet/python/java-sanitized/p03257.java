import java.util.*;

public class p03257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int U = (int) 1e5;
        boolean[] isPrime = new boolean[U + 1];
        Arrays.fill(isPrime, false);
        isPrime[2] = true;
        isPrime[3] = true;
        for (int p = 3; p <= U; p += 2) {
            if (p * p > U) {
                break;
            }
            if (isPrime[p]) {
                for (int i = p * p; i <= U; i += 2 * p) {
                    isPrime[i] = false;
                }
            }
        }
        int[] primes = new int[isPrime.length];
        int count = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes[count++] = i;
            }
        }
        int MM = 510;
        int M = 255;
        int[][] A = new int[MM][MM];
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][i] = primes[n / 2 + i];
                }
                for (int i = M; i < 2 * MM - n; i++) {
                    A[n][i] = primes[MM + M - n / 2 + i];
                }
                for (int i = 1; i < 2 * MM - n; i += 2) {
                    A[n][i] *= A[n][i - 1];
                }
                for (int i = 1; i < 2 * MM - n - 1; i += 2) {
                    A[n][i] += A[n][i + 1];
                }
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][i] = primes[(n + 1) / 2 + i];
                }
                for (int i = M; i < 2 * MM - n; i++) {
                    A[n][i] = primes[MM + M - (n - 1) / 2 + i];
                }
                for (int i = 1; i < 2 * MM - n; i += 2) {
                    A[n][i] *= A[n][i - 1];
                }
                for (int i = 1; i < 2 * MM - n - 1; i += 2) {
                    A[n][i] += A[n][i + 1];
                }
            }
        }
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int[] row : A) {
            for (int i : row) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}