import java.util.*;
import java.io.*;

public class p03257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int U = (int) Math.pow(10, 5);
        boolean[] is_prime = new boolean[U + 1];
        is_prime[2] = true;
        Arrays.fill(is_prime, 3, U + 1, true);
        for (int p = 3; p * p <= U; p += 2) {
            if (is_prime[p]) {
                for (int i = p * p; i <= U; i += 2 * p) {
                    is_prime[i] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i <= U; i++) {
            if (is_prime[i]) {
                primes.add(i);
            }
        }
        int MM = 510;
        int M = 255;
        long[][] A = new long[MM][MM];
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][i * 2] *= primes.get(n / 2 + i);
                    A[n][i * 2] *= primes.get(MM + M - n / 2 - i);
                    A[n][i * 2 + 1] *= A[n][i * 2];
                    A[n][i * 2 + 1] *= A[n][i * 2 + 2];
                    A[n][i * 2 + 1] += 1;
                }
            } else if (n % 2 == 1) {
                for (int i = 0; i < M