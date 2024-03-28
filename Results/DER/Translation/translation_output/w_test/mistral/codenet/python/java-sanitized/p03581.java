import java.util.*;

public class p03581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        long MOD = 1000000007;
        long U = 2001;
        long[][] comb = new long[U][U];
        Arrays.fill(comb[0], 1);
        for (int n = 1; n < U; n++) {
            Arrays.fill(comb[n], 0);
            for (int i = 0; i < n; i++) {
                comb[n][i] += comb[n - 1][i];
            }
            for (int i = 1; i < n + 1; i++) {
                comb[n][i] += comb[n - 1][i];
            }
            Arrays.fill(comb[n], comb[n][i] % MOD);
        }
        long[] comb_cum = new long[U];
        for (int i = 0; i < U; i++) {
            comb_cum[i] = comb[i].sum();
        }
        long[] S = new long[U][U];
        Arrays.fill(S[0], 1);
        for (int i = 1; i < U; i++) {
            Arrays.fill(S[i], 0);
            for (int j = 0; j < i; j++) {
                S[i][j] = comb_cum[j].sum();
            }
            S[i][i] = S[i][i] % MOD;
        }
        long x = 0;
        for (int k = 0; k <= A; k++) {
            x += comb[B - 1][k] * (S[k][0] + S[k][1] + ... + S[k][A - k]);
        }
        x %= MOD;
        System.out.println(x);
    }
}