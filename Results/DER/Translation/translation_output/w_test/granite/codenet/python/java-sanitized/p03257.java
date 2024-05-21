import java.util.*;

public class p03257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int U = 100000;
        boolean[] is_prime = new boolean[U+1];
        Arrays.fill(is_prime, true);
        is_prime[2] = true;
        is_prime[3::2] = true;
        for (int p = 3; p*p <= U; p += 2) {
            if (is_prime[p]) {
                for (int i = p*p; i <= U; i += 2*p) {
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
                    A[n][2*i] = primes.get(n/2+i);
                    A[n][2*i+1] = A[n][2*i] * A[n][2*i+2];
                    A[n][2*i+2] = A[n][2*i] * A[n][2*i-1];
                }
                for (int i = 0; i < M; i++) {
                    A[n][2*i] *= primes.get(MM+M-n/2-1-i);
                    A[n][2*i+1] *= A[n][2*i];
                    A[n][2*i+2] *= A[n][2*i-1];
                }
                for (int i = 0; i < M; i++) {
                    A[n][2*i] += 1;
                    A[n][2*i+1] += 1;
                }
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][2*i+1] = primes.get((n+1)/2+i);
                    A[n][2*i] = A[n][2*i+1] * A[n][2*i+2];
                    A[n][2*i+2] = A[n][2*i+1] * A[n][2*i-1];
                }
                for (int i = 0; i < M; i++) {
                    A[n][2*i+1] *= primes.get(MM+M-(n-1)/2-1-i);
                    A[n][2*i] *= A[n][2*i+1];
                    A[n][2*i+2] *= A[n][2*i-1];
                }
                for (int i = 0; i < M; i++) {
                    A[n][2*i+1] += 1;
                    A[n][2*i] += 1;
                }
            }
        }

        int N = sc.nextInt();
        long[][] ans = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ans[i][j] = A[i+1][j+1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(ans[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}