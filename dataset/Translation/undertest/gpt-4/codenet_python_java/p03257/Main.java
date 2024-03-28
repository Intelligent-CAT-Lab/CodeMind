import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03257 {
    
    private static final int U = 100000;
    private static boolean[] isPrime;
    private static long[] primes;
    
    private static final int MM = 510;
    private static final int M = 255;
    
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        sieve();
        
        long[][] A = new long[MM][MM];
        
        for (long[] row : A) {
            Arrays.fill(row, 1);
        }
        
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < MM; i += 2) {
                    A[n][i] *= primes[n/2 + i/2];
                    A[n][i] *= primes[MM + M - n/2 + i/2];
                    if (i + 1 < MM) {
                        A[n][i + 1] *= A[n][i];
                        if (i + 2 < MM) {
                            A[n][i + 1] *= A[n][i + 2];
                        }
                        A[n][i + 1]++;
                    }
                }
            } else {
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] *= primes[(n + 1)/2 + i/2];
                    A[n][i] *= primes[MM + M - (n - 1)/2 + i/2];
                    if (i > 0) {
                        A[n][i - 1] *= A[n][i];
                        if (i + 1 < MM) {
                            A[n][i - 1] *= A[n][i + 1];
                        }
                        A[n][i - 1]++;
                    }
                }
            }
        }
        
        int N = Integer.parseInt(reader.readLine().trim());
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j > 1) {
                    answer.append(" ");
                }
                answer.append(A[i][j]);
            }
            if (i < N) {
                answer.append("\n");
            }
        }
        
        System.out.println(answer.toString());
    }
    
    private static void sieve() {
        isPrime = new boolean[U + 1];
        Arrays.fill(isPrime, 2, U + 1, true);
        isPrime[2] = true;
        for (int p = 3; p * p <= U; p += 2) {
            if (isPrime[p]) {
                for (int i = p * p; i <= U; i += 2 * p) {
                    isPrime[i] = false;
                }
            }
        }
        
        primes = Arrays.stream(isPrime)
            .parallel()
            .map(b -> b ? 1 : 0)
            .toArray();
        
        int count = 0;
        for (boolean b : isPrime) {
            count += b ? 1 : 0;
        }
        
        primes = new long[count];
        int index = 0;
        for (int i = 2; i <= U; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }
    }
}