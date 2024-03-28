import java.util.*;
import java.io.*;

public class p03257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int U = 100000;
        boolean[] isPrime = new boolean[U + 1];
        Arrays.fill(isPrime, true);
        
        isPrime[2] = true;
        for (int p = 3; p <= U; p += 2) {
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
                for (int i = 0; i < MM; i += 2) {
                    long primes1 = primes.get(n/2 + i/2);
                    long primes2 = primes.get(MM + M - n/2 + i/2);
                    A[n][i] *= primes1 * primes2;
                    A[n][i+1] *= A[n][i];
                }
            } else {
                for (int i = 1; i < MM; i += 2) {
                    long primes1 = primes.get((n+1)/2 + i/2);
                    long primes2 = primes.get(MM + M - (n-1)/2 + i/2);
                    A[n][i] *= primes1 * primes2;
                    A[n][i-1] *= A[n][i];
                }
            }
        }
        
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sb.append(A[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}