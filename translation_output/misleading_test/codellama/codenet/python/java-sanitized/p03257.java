import java.util.Scanner;
import java.util.Arrays;

public class p03257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] primes = getPrimes(N);
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0) {
                    A[i][j] = primes[i / 2] * primes[N + M - i / 2];
                } else {
                    A[i][j] = primes[(i + 1) / 2] * primes[N + M - (i - 1) / 2];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0) {
                    A[i][j] *= A[i][j];
                } else {
                    A[i][j] *= A[i][j];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0) {
                    A[i][j] += 1;
                } else {
                    A[i][j] += 1;
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

    public static int[] getPrimes(int N) {
        int[] primes = new int[N];
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                primes[i] = i;
            }
        }
        return primes;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}