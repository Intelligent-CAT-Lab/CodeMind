import java.util.Scanner;

public class p03375 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int MOD = scanner.nextInt();

        long[][] B = new long[N + 1][N + 1];
        B[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            // 1çªãåç¬ã§ä½¿ã
            for (int l = 1; l <= N; l++) {
                B[n][l] = B[n - 1][l - 1];
            }
            // 1çªãã©ããã«æ··ãã¦ããã
            for (int l = 1; l <= N; l++) {
                B[n][l] += B[n - 1][l] * l % MOD;
                B[n][l] %= MOD;
            }
        }

        // 2^{kl}
        long[][] pow_2 = new long[N + 1][N + 1];
        pow_2[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            pow_2[n][0] = pow_2[n - 1][0] * 2 % MOD;
            for (int l = 1; l <= N; l++) {
                pow_2[n][l] = pow_2[n - 1][l] * pow_2[n][0] % MOD;
            }
        }

        long[] pow_pow = new long[N + 1];
        pow_pow[0] = 2;
        for (int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n - 1] * pow_pow