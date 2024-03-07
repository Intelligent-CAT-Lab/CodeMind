import java.util.Scanner;
import java.util.Arrays;

public class p03581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int MOD = 1000000007;
        int U = 2001;
        int[][] comb = new int[U][U];
        comb[0][0] = 1;
        for (int n = 1; n < U; n++) {
            comb[n][0] += comb[n - 1][0];
            comb[n][1] += comb[n - 1][0];
            comb[n][n] %= MOD;
        }
        int[][] combCum = new int[U][U];
        for (int n = 0; n < U; n++) {
            combCum[n][0] = comb[n][0];
            for (int k = 1; k < U; k++) {
                combCum[n][k] = (combCum[n][k - 1] + comb[n][k]) % MOD;
            }
        }
        int[][] S = new int[U][U];
        S[0][0] = 1;
        for (int n = 1; n < U; n++) {
            S[n][0] = combCum[n - 1][0];
            for (int k = 1; k < U; k++) {
                S[n][k] = (S[n - 1][k - 1] + combCum[n - 1][k]) % MOD;
            }
        }
        int x = 0;
        for (int k = 0; k < A + 1; k++) {
            x += comb[B - 1][k] * (S[k][:A - k + 1].sum() % MOD) % MOD;
            x %= MOD;
        }
        System.out.println(x);
    }
}