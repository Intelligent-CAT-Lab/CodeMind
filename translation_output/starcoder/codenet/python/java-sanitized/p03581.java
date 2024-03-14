import java.util.*;
import java.io.*;

public class p03581 {
    static int MOD = 1_000_000_007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int[][] comb = new int[2001][2001];
        comb[0][0] = 1;
        for (int i = 1; i < 2001; i++) {
            for (int j = 0; j < i; j++) {
                comb[i][j] += comb[i - 1][j];
                comb[i][j + 1] += comb[i - 1][j];
                comb[i][j] %= MOD;
                comb[i][j + 1] %= MOD;
            }
        }
        int[][] comb_cum = new int[2001][2001];
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < i; j++) {
                comb_cum[i][j] += comb_cum[i - 1][j];
                comb_cum[i][j + 1] += comb_cum[i - 1][j];
                comb_cum[i][j] %= MOD;
                comb_cum[i][j + 1] %= MOD;
            }
            comb_cum[i][i] = 1;
        }
        int[][] S = new int[2001][2001];
        S[0][0] = 1;
        for (int i = 1; i < 2001; i++) {
            for (int j = 0; j < i; j++) {
                S[i][j] += S[i - 1][j];
                S[i][j + 1] += S[i - 1][j];
                S[i][j] %= MOD;
                S[i][j + 1] %= MOD;
            }
        }
        int x = 0;
        for (int k = 0; k <= A; k++) {
            x += comb[B - 1][k] * (S[k][A - k] % MOD) % MOD;
            x %= MOD;
        }
        System.out.println(x);
    }
}