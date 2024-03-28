import java.util.Scanner;

public class p03581 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        final long MOD = 1000000007L;

        int U = 2001;
        long[][] comb = new long[U][U];
        comb[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int k = 0; k < n; k++) {
                comb[n][k] += comb[n - 1][k];
                comb[n][k + 1] += comb[n - 1][k];
                comb[n][k] %= MOD;
            }
        }

        long[][] combCum = new long[U][U];
        for (int n = 0; n < U; n++) {
            combCum[n][0] = comb[n][0];
            for (int k = 1; k < U; k++) {
                combCum[n][k] = (combCum[n][k - 1] + comb[n][k]) % MOD;
            }
        }

        long[][] S = new long[U][U];
        for (int n = 0; n < U; n++) {
            S[0][n] = 1;
        }
        for (int n = 1; n < U; n++) {
            for (int k = 0; k < U; k++) {
                S[n][k] = S[n - 1][k];
                if (k > 0) {
                    S[n][k] += S[n - 1][k - 1];
                    S[n][k] %= MOD;
                }
            }
        }

        long x = 0;
        for (int k = 0; k <= A; k++) {
            long tempSum = 0;
            for (int i = 0; i <= A - k; i++) {
                tempSum = (tempSum + S[k][i]) % MOD;
            }
            x += comb[B - 1][k] * tempSum % MOD;
            x %= MOD;
        }

        System.out.println(x);
    }
}