import java.util.*;
import java.math.*;

public class p03257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int U = 100000;
        boolean[] isPrime = new boolean[U + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p * p <= U; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= U; i += p) {
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
        BigInteger[][] A = new BigInteger[MM][MM];
        for (int i = 0; i < MM; i++) {
            Arrays.fill(A[i], BigInteger.ONE);
        }
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][2 * i] = A[n][2 * i].multiply(BigInteger.valueOf(primes.get(n / 2 + i)));
                    A[n][2 * i] = A[n][2 * i].multiply(BigInteger.valueOf(primes.get(MM + M - n / 2 - i)));
                    A[n][2 * i + 1] = A[n][2 * i].multiply(A[n][2 * i]);
                    A[n][2 * i + 1] = A[n][2 * i + 1].add(BigInteger.ONE);
                }
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][2 * i + 1] = A[n][2 * i + 1].multiply(BigInteger.valueOf(primes.get((n + 1) / 2 + i)));
                    A[n][2 * i + 1] = A[n][2 * i + 1].multiply(BigInteger.valueOf(primes.get(MM + M - (n - 1) / 2 - i)));
                    A[n][2 * i] = A[n][2 * i + 1].multiply(A[n][2 * i + 1]);
                    A[n][2 * i] = A[n][2 * i].add(BigInteger.ONE);
                }
            }
        }
        int N = scanner.nextInt();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                answer.append(A[i][j]).append(" ");
            }
            answer.append("\n");
        }
        System.out.println(answer.toString());
    }
}