import java.util.*;
import java.io.*;

public class p03257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int MM = 510;
        int M = 255;
        int U = 100000;
        boolean[] is_prime = new boolean[U+1];
        Arrays.fill(is_prime, true);
        is_prime[0] = false;
        is_prime[1] = false;
        for (int p = 2; p*p <= U; p++) {
            if (is_prime[p]) {
                for (int i = p*p; i <= U; i += p) {
                    is_prime[i] = false;
                }
            }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 0; i < is_prime.length; i++) {
            if (is_prime[i]) {
                primes.add(i);
            }
        }
        long[][] A = new long[MM][MM];
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][i*2] = primes.get(n/2+i) * primes.get(MM+M-n/2+i);
                }
                for (int i = 1; i < M; i++) {
                    A[n][i*2-1] = A[n][i*2] * A[n][i*2-2];
                }
                for (int i = 1; i < M-1; i++) {
                    A[n][i*2] = A[n][i*2+1] * A[n][i*2-1];
                }
                A[n][0] += 1;
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][i*2+1] = primes.get((n+1)/2+i) * primes.get(MM+M-(n-1)/2+i);
                }
                for (int i = 1; i < M; i++) {
                    A[n][i*2] = A[n][i*2+1] * A[n][i*2-2];
                }
                for (int i = 1; i < M-1; i++) {
                    A[n][i*2+1] = A[n][i*2+2] * A[n][i*2];
                }
                A[n][0] += 1;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i+1][j+1] + " ");
            }
            System.out.println();
        }
    }
}