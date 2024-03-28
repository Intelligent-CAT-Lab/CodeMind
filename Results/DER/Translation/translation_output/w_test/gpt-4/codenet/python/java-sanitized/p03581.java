import java.util.Scanner;

public class p03581 {
    private static final int U = 2001;
    private static final int MOD = 1000000007;
    private static long[][] comb = new long[U][U];
    private static long[][] comb_cum = new long[U][U];
    private static long[][] S = new long[U][U];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        // Calculate combination
        comb[0][0] = 1;
        for(int n = 1; n < U; n++){
            comb[n][0] = comb[n - 1][0];
            for(int r = 1; r <= n; r++) {
                comb[n][r] = (comb[n - 1][r] + comb[n - 1][r - 1]) % MOD;
            }
        }

        // Calculate cumulative sum of combinations
        for(int n = 0; n < U; n++) {
            comb_cum[n][0] = comb[n][0];
            for(int r = 1; r < U; r++) {
                comb_cum[n][r] = (comb_cum[n][r - 1] + comb[n][r]) % MOD;
            }
        }

        // Calculate the S array
        for(int r = 0; r < U; r++) {
            S[0][r] = 1;
        }
        for(int n = 1; n < U; n++) {
            for(int r = 0; r < U; r++) {
                S[n][r] = ((r > 0 ? S[n - 1][r - 1] : 0) + comb_cum[n - 1][r]) % MOD;
            }
        }

        // Solve for the given A and B
        long x = 0;
        for(int k = 0; k <= A; k++) {
            long sum = 0;
            for(int i = 0; i <= A-k; i++) {
                sum = (sum + S[k][i]) % MOD;
            }
            x = (x + comb[B-1][k] * sum) % MOD;
        }

        // Print the result
        System.out.println(x);
    }
}