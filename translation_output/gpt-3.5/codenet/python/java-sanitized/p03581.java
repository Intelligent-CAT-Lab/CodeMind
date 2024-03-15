import java.util.Scanner;

public class p03581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int MOD = (int) Math.pow(10, 9) + 7;
        int U = 2001;
        long[][] comb = new long[U][U];
        comb[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int i = 0; i < n; i++) {
                comb[n][i] = (comb[n-1][i] + comb[n-1][i-1]) % MOD;
            }
        }

        long[][] comb_cum = new long[U][U];
        for (int i = 0; i < U; i++) {
            comb_cum[i][0] = comb[i][0];
            for (int j = 1; j < U; j++) {
                comb_cum[i][j] = (comb_cum[i][j-1] + comb[i][j]) % MOD;
            }
        }

        long[][] S = new long[U][U];
        S[0][0] = 1;
        for (int i = 1; i < U; i++) {
            S[i][0] = comb_cum[i-1][0];
            for (int j = 1; j < U; j++) {
                S[i][j] = (S[i][j-1] + comb_cum[i-1][j]) % MOD;
            }
        }

        long x = 0;
        for (int k = 0; k <= A; k++) {
            long sum = 0;
            for (int i = 0; i <= A - k; i++) {
                sum = (sum + S[k][i]) % MOD;
            }
            x = (x + comb[B-1][k] * sum) % MOD;
        }

        System.out.println(x);
    }
}