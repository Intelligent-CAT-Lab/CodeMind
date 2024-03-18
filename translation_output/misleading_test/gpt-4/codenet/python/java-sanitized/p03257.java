import java.io.*;
import java.util.*;

public class p03257 {

    static final int U = 100000;
    static boolean[] isPrime = new boolean[U + 1];
    static final int MM = 510;
    static final int M = 255;
    static long[][] A = new long[MM][MM];
    static List<Integer> primes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        sieveOfEratosthenes();
        createMatrix();

        int N = Integer.parseInt(br.readLine().trim());

        long[][] result = new long[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            System.arraycopy(A[i], 1, result[i], 1, N);
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                answer.append(result[i][j]);
                if (j != N) {
                    answer.append(" ");
                }
            }
            if (i != N) {
                answer.append("\n");
            }
        }
        System.out.println(answer);
    }

    private static void sieveOfEratosthenes() {
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p*p <= U; p++) {
            if (isPrime[p]) {
                for (int i = p*p; i <= U; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i <= U; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        Collections.fill(primes.subList(primes.size(), MM + MM), 1);
    }

    private static void createMatrix() {
        for (int[] row: A) {
            Arrays.fill(row, 1);
        }

        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < MM; i += 2) {
                    A[n][i] *= (long) primes.get(n/2 + i/2);
                    A[n][i] *= (long) primes.get(MM + M - n/2 + i/2);
                }
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] *= A[n][i - 1];
                    if (i + 1 < MM) {
                        A[n][i] *= A[n][i + 1];
                    }
                    A[n][i] += 1;
                }
            } else {
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] *= (long) primes.get((n + 1)/2 + i/2);
                    A[n][i] *= (long) primes.get(MM + M - (n - 1)/2 + i/2);
                }
                for (int i = 0; i < MM; i += 2) {
                    A[n][i] *= A[n][i + 1];
                    if (i + 2 < MM) {
                        A[n][i] *= A[n][i + 2];
                    }
                    A[n][i] += 1;
                }
            }
        }
    }
}