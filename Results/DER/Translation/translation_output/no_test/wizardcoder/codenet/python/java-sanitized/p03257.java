import java.io.*;
import java.util.*;

public class p03257 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int U = 100000;
        boolean[] isPrime = new boolean[U+1];
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

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= U; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        int MM = 510;
        int M = 255;

        int[][] A = new int[MM+1][MM+1];
        for (int n = 0; n <= MM; n++) {
            if (n % 2 == 0) {
                for (int i = n/2; i < n/2+M && i < MM; i++) {
                    A[n][i] = primes.get(i);
                }
                for (int i = MM+M-n/2; i < 2*MM-n/2 && i < MM; i++) {
                    A[n][i] = primes.get(i);
                }
                for (int i = n/2+1; i < n/2+M && i < MM; i += 2) {
                    A[n][i] *= A[n][i-1];
                }
                for (int i = n/2+2; i < n/2+M && i < MM; i += 2) {
                    A[n][i] *= A[n][i-2];
                }
                for (int i = n/2+1; i < n/2+M && i < MM; i += 2) {
                    A[n][i] += 1;
                }
            } else {
                for (int i = (n+1)/2; i < (n+1)/2+M && i < MM; i++) {
                    A[n][i] = primes.get(i);
                }
                for (int i = MM+M-(n-1)/2; i < 2*MM-(n-1)/2 && i < MM; i++) {
                    A[n][i] = primes.get(i);
                }
                for (int i = (n+1)/2+1; i < (n+1)/2+M && i < MM; i += 2) {
                    A[n][i] *= A[n][i-1];
                }
                for (int i = (n+1)/2+2; i < (n+1)/2+M && i < MM; i += 2) {
                    A[n][i] *= A[n][i-2];
                }
                for (int i = (n+1)/2+1; i < (n+1)/2+M && i < MM; i += 2) {
                    A[n][i] += 1;
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        A = Arrays.copyOfRange(A, 1, N+1);
        A = Arrays.copyOfRange(A, 1, N+1);

        StringBuilder sb = new StringBuilder();
        for (int[] row : A) {
            for (int num : row) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}