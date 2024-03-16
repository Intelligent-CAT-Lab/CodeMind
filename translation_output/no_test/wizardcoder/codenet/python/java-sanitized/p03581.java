import java.io.*;
import java.util.*;

public class p03581 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int MOD = (int) Math.pow(10, 9) + 7;

        int U = 2001;
        long[][] comb = new long[U][U];
        comb[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int k = 0; k <= n; k++) {
                comb[n][k] = (comb[n-1][k] + comb[n-1][k-1]) % MOD;
            }
        }

        long[][] comb_cum = new long[U][U];
        for (int i = 0; i < U; i++) {
            for (int j = 0; j <= i; j++) {
                comb_cum[i][j] = comb[i][j];
                if (j > 0) {
                    comb_cum[i][j] += comb_cum[i-1][j-1];
                }
            }
        }

        long[][] S = new long[U][U];
        S[0][0] = 1;
        for (int i = 1; i < U; i++) {
            for (int j = 0; j <= i; j++) {
                S[i][j] = (S[i-1][j] + S[i-1][j-1]) % MOD;
            }
        }

        long x = 0;
        for (int k = 0; k <= B; k++) {
            for (int s = 0; s <= A-k; s++) {
                x += comb[B-1][k] * S[k][s] % MOD;
                x %= MOD;
            }
        }

        bw.write(Long.toString(x) + "\n");
        bw.close();
    }
}