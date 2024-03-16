import java.util.*;
import java.util.stream.IntStream;

public class p03375 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int MOD = scanner.nextInt();

        int[][] B = new int[N + 1][N + 1];
        B[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            // 1çªãåç¬ã§ä½¿ã
            for (int l = 1; l <= n; l++) {
                B[n][l] = B[n - 1][l - 1];
            }
            // 1çªãã©ããã«æ··ãopã¦ã░llã°ã«ã¼ãã«ã
            for (int l = 1; l <= n; l++) {
                B[n][l] += B[n - 1][l - 1] * (l - 1) % MOD;
            }
            B[n] %= MOD;
        }

        int[][] pow_2 = new int[N + 1][N + 1];
        pow_2[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            pow_2[1][n] = 2 * pow_2[0][n - 1] % MOD;
        }
        for (int n = 2; n <= N; n++) {
            pow_2[n] = pow_2[n - 1] * pow_2[1] % MOD;
        }

        int[][] pow_pow = new int[N + 1];
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n - 1] * pow_pow[n - 1] % MOD;
        }

        int[] A = new int[N + 1];
        for (int n = 1; n <= N; n++) {
            A[n] = (B[n - 1][1:] * (pow_2[::-1, 1:] + pow_2[::-1, -1:] * IntStream.range(1, N + 1).mapToInt(i -> i % MOD).toArray()) % MOD).sum();
        }
        for (int n = 1; n <= N; n++) {
            A[n] %= MOD;
        }
        A[0] = 0;
        for (int n = 1; n <= N; n++) {
            A[0] += A[n] * pow_pow[n] % MOD;
        }
        A[0] %= MOD;

        int[] fact = new int[N + 1];
        int[] fact_inv = new int[N + 1];
        for (int n = 1; n <= N; n++) {
            fact[n] = fact[n - 1] * n % MOD;
            fact_inv[n] = fact_inv[n - 1] * n % MOD;
        }
        for (int n = N; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }
        Arrays.fill(fact, 1);
        Arrays.fill(fact_inv, 1);

        int[] comb = new int[N + 1];
        for (int n = 1; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[n] % MOD * fact[N] % MOD;
        }

        for (int i = 0; i < N; i++) {
            A[i] *= (-1);
        }
        A[0] *= comb;
        A[0] %= MOD;
        int answer = (int) Math.pow(2, Math.pow(2, N, MOD - 1), MOD) - A[0];
        answer %= MOD;
        System.out.println(answer);
    }
}