import java.util.*;
import java.io.*;

public class p03257 {
    static int U = 100000;
    static int MM = 510;
    static int M = 255;
    static boolean[] is_prime = new boolean[U+1];
    static int[] primes = new int[U+1];
    static long[][] A = new long[MM][MM];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        is_prime[2] = true;
        for (int p = 3; p <= U; p += 2) {
            if (p * p > U) {
                break;
            }
            if (is_prime[p]) {
                for (int i = p * p; i <= U; i += 2 * p) {
                    is_prime[i] = false;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i <= U; i++) {
            if (is_prime[i]) {
                primes[cnt++] = i;
            }
        }

        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][i*2] = (long)primes[n/2+i] * primes[MM+M-n/2+i];
                }
                for (int i = 1; i < M; i++) {
                    A[n][i*2-1] = A[n][i*2] * A[n][i*2-2];
                }
                for (int i = 1; i < M-1; i++) {
                    A[n][i*2] = A[n][i*2-1] * A[n][i*2+1];
                }
                A[n][0] += 1;
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][i*2+1] = (long)primes[(n+1)/2+i] * primes[MM+M-(n-1)/2+i];
                }
                for (int i = 1; i < M; i++) {
                    A[n][i*2] = A[n][i*2-1] * A[n][i*2+1];
                }
                for (int i = 1; i < M-1; i++) {
                    A[n][i*2-1] = A[n][i*2] * A[n][i*2-2];
                }
                A[n][0] += 1;
            }
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                bw.write(String.valueOf(A[i][j]));
                if (j != N) {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}