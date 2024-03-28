import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.IntStream;

public class p03257 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int U = 100_000;
        boolean[] isPrime = new boolean[U + 1];
        isPrime[2] = true;
        for (int i = 3; i <= U; i += 2) {
            isPrime[i] = true;
        }

        for (int p = 3; p * p <= U; p += 2) {
            if (isPrime[p]) {
                for (int j = p * p; j <= U; j += p * 2) {
                    isPrime[j] = false;
                }
            }
        }

        int[] primes = IntStream.range(0, U+1).filter(i -> isPrime[i]).toArray();

        final int MM = 510;
        final int M = 255;

        long[][] A = new long[MM][MM];
        for (long[] row : A) {
            java.util.Arrays.fill(row, 1);
        }

        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < MM; i += 2) {
                    A[n][i] *= primes[n / 2 + i / 2];
                    A[n][i] *= primes[MM + M - n / 2 + i / 2];
                    if (i + 1 < MM) {
                        A[n][i + 1] = A[n][i] * A[n][i] + 1;
                    }
                }
                for (int i = 1; i < MM - 1; i += 2) {
                    A[n][i] *= A[n][i + 1];
                }
            } else {
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] *= primes[(n + 1) / 2 + i / 2];
                    A[n][i] *= primes[MM + M - (n - 1) / 2 + i / 2];
                    if (i - 1 >= 0) {
                        A[n][i - 1] = A[n][i] * A[n][i] + 1;
                    }
                }
                for (int i = 2; i < MM; i += 2) {
                    A[n][i] *= A[n][i - 1];
                }
            }
        }

        int N = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sb.append(A[i][j]);
                if (j < N) sb.append(" ");
            }
            if (i < N) sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}