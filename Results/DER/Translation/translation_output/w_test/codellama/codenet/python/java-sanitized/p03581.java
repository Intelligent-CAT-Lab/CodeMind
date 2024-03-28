import java.util.Scanner;
import java.util.Arrays;

public class p03581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int MOD = 1000000007;
        int[][] comb = new int[2001][2001];
        comb[0][0] = 1;
        for (int n = 1; n < 2001; n++) {
            comb[n][0] = comb[n - 1][0] + comb[n - 1][n];
            comb[n][1] = comb[n - 1][0] + comb[n - 1][n];
            comb[n][n] = comb[n - 1][n] + comb[n - 1][n - 1];
            for (int i = 2; i < n; i++) {
                comb[n][i] = (comb[n - 1][i - 1] + comb[n - 1][i]) % MOD;
            }
        }
        int[][] combCum = new int[2001][2001];
        for (int n = 0; n < 2001; n++) {
            combCum[n][0] = comb[n][0];
            for (int i = 1; i < 2001; i++) {
                combCum[n][i] = (combCum[n][i - 1] + comb[n][i]) % MOD;
            }
        }
        int[][] S = new int[2001][2001];
        S[0][0] = 1;
        for (int n = 1; n < 2001; n++) {
            S[n][0] = combCum[n - 1][0];
            for (int i = 1; i < 2001; i++) {
                S[n][i] = (S[n - 1][i - 1] + combCum[n - 1][i]) % MOD;
            }
        }
        int x = 0;
        for (int k = 0; k <= A; k++) {
            x += comb[B - 1][k] * (S[k][A - k] % MOD) % MOD;
        }
        System.out.println(x % MOD);
    }
}