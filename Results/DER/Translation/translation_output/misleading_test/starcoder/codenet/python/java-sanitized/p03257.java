import java.util.*;
import java.io.*;

public class p03257 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 255;
        int MM = 510;
        int[] primes = new int[MM];
        boolean[] isPrime = new boolean[MM];
        Arrays.fill(isPrime, true);
        for (int i = 2; i < MM; i++) {
            if (isPrime[i]) {
                for (int j = i; j < MM; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 0; i < MM; i++) {
            if (isPrime[i]) {
                primes[i] = i;
            }
        }
        int[][] A = new int[MM][MM];
        for (int i = 0; i < MM; i++) {
            for (int j = 0; j < MM; j++) {
                A[i][j] = 1;
            }
        }
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = n / 2; i < n / 2 + M; i++) {
                    if (i < MM) {
                        A[n][i] *= primes[i];
                    }
                }
                for (int i = MM + M - n / 2; i < 2 * MM - n / 2; i++) {
                    if (i < MM) {
                        A[n][i] *= primes[i];
                    }
                }
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] *= A[n][i - 1];
                }
                for (int i = 2; i < MM; i += 2) {
                    A[n][i] *= A[n][i + 1];
                }
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] += 1;
                }
            } else if (n % 2 == 1) {
                for (int i = (n + 1) / 2; i < (n + 1) / 2 + M; i++) {
                    if (i < MM) {
                        A[n][i] *= primes[i];
                    }
                }
                for (int i = MM + M - (n - 1) / 2; i < 2 * MM - (n - 1) / 2; i++) {
                    if (i < MM) {
                        A[n][i] *= primes[i];
                    }
                }
                for (int i = 0; i < MM; i += 2) {
                    A[n][i] *= A[n][i + 1];
                }
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] *= A[n][i - 1];
                }
                for (int i = 0; i < MM; i += 2) {
                    A[n][i] += 1;
                }
            }
        }
        A = Arrays.copyOfRange(A, 1, N + 1);
        for (int i = 0; i < A.length; i++) {
            A[i] = Arrays.copyOfRange(A[i], 1, N + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int[] row : A) {
            for (int i : row) {
                sb.append(i);
                sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}