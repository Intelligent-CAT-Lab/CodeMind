import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03257 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int U = 100000;
        boolean[] is_prime = new boolean[U+1];
        Arrays.fill(is_prime, true);
        is_prime[2] = true;
        is_prime[3::2] = true;
        for (int p = 3; p * p <= U; p += 2) {
            if (is_prime[p]) {
                for (int i = p * p; i <= U; i += 2 * p) {
                    is_prime[i] = false;
                }
            }
        }
        int[] primes = new int[U/2+1];
        int count = 0;
        for (int i = 0; i <= U; i += 2) {
            if (is_prime[i]) {
                primes[count++] = i;
            }
        }
        int MM = 510;
        int M = 255;
        long[][] A = new long[MM][MM];
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][2 * i] = primes[n / 2 + i];
                    A[n][2 * i + 1] = A[n][2 * i] * A[n][2 * i + 1];
                }
                for (int i = 0; i < M; i++) {
                    A[n][2 * i + 1] += A[n][2 * i];
                }
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][2 * i + 1] = primes[(n + 1) / 2 + i];
                    A[n][2 * i] = A[n][2 * i + 1] * A[n][2 * i];
                }
                for (int i = 0; i < M; i++) {
                    A[n][2 * i] += A[n][2 * i + 1];
                }
            }
        }
        int N = Integer.parseInt(br.readLine());
        long[][] result = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = A[i][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}