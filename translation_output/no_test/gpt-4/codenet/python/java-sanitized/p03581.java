import java.util.Scanner;

public class p03581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        final int MOD = 1000000007;
        final int U = 2001;

        long[][] comb = new long[U][U];
        comb[0][0] = 1;

        for (int n = 1; n < U; n++) {
            for (int k = 0; k < n; k++) {
                comb[n][k] += comb[n - 1][k];
                comb[n][k] %= MOD;
            }
            for (int k = 1; k <= n; k++) {
                comb[n][k] += comb[n - 1][k - 1];
                comb[n][k] %= MOD;
            }
        }

        long[][] comb_cum = new long[U][U];
        for (int n = 0; n < U; n++) {
            long cumulativeSum = 0;
            for (int k = 0; k < U; k++) {
                cumulativeSum += comb[n][k];
                cumulativeSum %= MOD;
                comb_cum[n][k] = cumulativeSum;
            }
        }

        long[][] S = new long[U][U];
        for (int k = 0; k < U; k++)
            S[0][k] = 1;

        for (int n = 1; n < U; n++) {
            for (int k = 0; k < U; k++) {
                S[n][k] = S[n - 1][k] + (k > 0 ? comb_cum[n - 1][k - 1] : 0);
                S[n][k] %= MOD;
            }
        }

        long x = 0;
        for (int k = 0; k <= A; k++) {
            long sum = 0;
            for (int i = 0; i <= A - k; i++) {
                sum += S[k][i];
                sum %= MOD;
            }
            x += comb[B - 1][k] * sum % MOD;
            x %= MOD;
        }

        System.out.println(x);
    }
}