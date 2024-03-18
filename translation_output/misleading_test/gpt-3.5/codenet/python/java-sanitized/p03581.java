import java.util.Scanner;

public class p03581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MOD = (int) Math.pow(10, 9) + 7;
        int U = 2001;
        long[][] comb = new long[U][U];
        comb[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int i = 0; i < n; i++) {
                comb[n][i] += comb[n-1][i];
                comb[n][i+1] += comb[n-1][i];
                comb[n][i] %= MOD;
                comb[n][i+1] %= MOD;
            }
        }

        long[][] combCum = new long[U][U];
        for (int i = 0; i < U; i++) {
            long sum = 0;
            for (int j = 0; j < U; j++) {
                sum += comb[i][j];
                sum %= MOD;
                combCum[i][j] = sum;
            }
        }

        long[][] S = new long[U][U];
        S[0][0] = 1;
        for (int i = 1; i < U; i++) {
            for (int j = 0; j < U; j++) {
                S[i][j] = combCum[i-1][U-1] % MOD;
            }
        }

        int A = sc.nextInt();
        int B = sc.nextInt();

        long x = 0;
        for (int k = 0; k <= A; k++) {
            x += comb[B-1][k] * S[k][A-k] % MOD;
            x %= MOD;
        }

        System.out.println(x);
    }
}