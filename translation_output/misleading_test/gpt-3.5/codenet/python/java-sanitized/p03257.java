import java.util.*;

public class p03257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int U = 100000;
        boolean[] isPrime = new boolean[U + 1];
        isPrime[2] = true;
        for (int p = 3; p <= U; p += 2) {
            isPrime[p] = true;
        }
        for (int p = 3; p*p <= U; p += 2) {
            if (isPrime[p]) {
                for (int i = p*p; i <= U; i += 2*p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= U; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        int MM = 510;
        int M = 255;

        long[][] A = new long[MM][MM];
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int j = 0; j < MM; j += 2) {
                    A[n][j] *= primes.get(n/2);
                    A[n][j] *= primes.get(MM + M - n/2);
                }
                for (int j = 1; j < MM - 1; j += 2) {
                    A[n][j] *= A[n][j - 1];
                    A[n][j] += 1;
                }
            } else {
                for (int j = 1; j < MM; j += 2) {
                    A[n][j] *= primes.get((n+1)/2);
                    A[n][j] *= primes.get(MM + M - (n-1)/2);
                }
                for (int j = 0; j < MM - 1; j += 2) {
                    A[n][j] *= A[n][j + 1];
                    A[n][j] += 1;
                }
            }
        }

        int N = scanner.nextInt();
        long[][] result = new long[N][N];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N; j++) {
                result[i-1][j] = A[i][j+1];
            }
        }

        for (long[] row : result) {
            for (long num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}