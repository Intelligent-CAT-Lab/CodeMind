import java.util.Scanner;
import java.util.Arrays;

public class p03581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int MOD = 1000000007;
        int[][] comb = new int[2001][2001];
        int[][] S = new int[2001][2001];
        int[][] comb_cum = new int[2001][2001];
        int x = 0;

        comb[0][0] = 1;
        for (int n = 1; n < 2001; n++) {
            comb[n][0] = comb[n - 1][0] + comb[n - 1][n - 1];
            comb[n][1] = comb[n - 1][0] + comb[n - 1][n - 1];
            comb[n][n] = comb[n - 1][n - 1];
            comb[n][n] %= MOD;
        }

        comb_cum = comb.cumsum(1);

        S[0][:] = 1;
        S[1][:] = comb_cum[:-1].cumsum(1) % MOD;

        for (int k = 0; k < A + 1; k++) {
            x += comb[B - 1][k] * (S[k][:A - k + 1].sum() % MOD) % MOD;
            x %= MOD;
        }

        System.out.println(x);
    }
}