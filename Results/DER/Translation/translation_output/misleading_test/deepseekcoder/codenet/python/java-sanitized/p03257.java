import java.math.BigInteger;
import java.util.Scanner;

public class p03257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        BigInteger[][] A = new BigInteger[N+1][N+1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                A[i][j] = BigInteger.ONE;
            }
        }
        BigInteger[] primes = generatePrimes(510 * 510 * 2);
        for (int n = 1; n <= N; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    A[n][i] = A[n][i].multiply(primes[n*n/2+i]);
                    A[n][i] = A[n][i].multiply(primes[(n*n+n)/2-i]);
                    A[n][i+1] = A[n][i].multiply(A[n][i]);
                    A[n][i+1] = A[n][i+1].add(BigInteger.ONE);
                }
            } else {
                for (int i = 1; i < n; i++) {
                    A[n][i] = A[n][i].multiply(primes[(n*n+n)/2+i]);
                    A[n][i] = A[n][i].multiply(primes[(n*n+n)/2-i]);
                    A[n][i-1] = A[n][i].multiply(A[n][i]);
                    A[n][i-1] = A[n][i-1].add(BigInteger.ONE);
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static BigInteger[] generatePrimes(int n) {
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p*p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p*p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        BigInteger[] primes = new BigInteger[n+1];
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes[i] = BigInteger.valueOf(i);
            }
        }
        return primes;
    }
}