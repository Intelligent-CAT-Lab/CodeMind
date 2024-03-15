import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import org.apache.commons.math3.util.CombinatoricsUtils;

public class p03257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int U = (int) Math.pow(10, 5);
        boolean[] isPrime = new boolean[U + 1];
        isPrime[2] = true;
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

        long[] primes = new long[CombinatoricsUtils.factorial(U).intValue()]; // Adjust size as needed
        int index = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes[index] = i;
                index++;
            }
        }

        int MM = 510;
        int M = 255;
        long[][] A = new long[MM][MM];
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < MM; i += 2) {
                    for (int j = n / 2; j < n / 2 + M; j++) {
                        A[n][i] *= primes[j];
                    }
                    for (int j = MM + M - n / 2; j < 2 * MM - n / 2; j++) {
                        A[n][i] *= primes[j];
                    }
                    A[n][i + 1] *= A[n][i];
                    A[n][i + 1] *= A[n][i + 2];
                    A[n][i + 1] += 1;
                }
            } else if (n % 2 == 1) {
                for (int i = 1; i < MM; i += 2) {
                    for (int j = (n + 1) / 2; j < (n + 1) / 2 + M; j++) {
                        A[n][i] *= primes[j];
                    }
                    for (int j = MM + M - (n - 1) / 2; j < 2 * MM - (n - 1) / 2; j++) {
                        A[n][i] *= primes[j];
                    }
                    A[n][i - 1] *= A[n][i];
                    A[n][i + 1] *= A[n][i - 1];
                    A[n][i - 1] += 1;
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        long[][] result = new long[N][N];
        for (int i = 0; i < N; i++) {
            System.arraycopy(A[i + 1], 1, result[i], 0, N);
        }

        StringBuilder answer = new StringBuilder();
        for (long[] row : result) {
            for (long num : row) {
                answer.append(num).append(" ");
            }
            answer.append("\n");
        }
        System.out.println(answer.toString());
    }
}