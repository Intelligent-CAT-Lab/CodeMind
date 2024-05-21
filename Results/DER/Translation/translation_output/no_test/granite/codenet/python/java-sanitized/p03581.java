import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p03581 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        final int MOD = 100000007;
        final int U = 2001;
        long[][] comb = new long[U][U];
        long[][] comb_cum = new long[U][U];
        long[][] S = new long[U][U];

        comb[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int k = 0; k < n; k++) {
                comb[n][k] = (comb[n - 1][k] + comb[n - 1][k - 1]) % MOD;
            }
            comb[n][n] = 1;
        }

        for (int n = 0; n < U; n++) {
            comb_cum[n][0] = comb[n][0];
            for (int k = 1; k < U; k++) {
                comb_cum[n][k] = (comb_cum[n][k - 1] + comb[n][k]) % MOD;
            }
        }

        S[0][0] = 1;
        for (int n = 1; n < U; n++) {
            for (int k = 0; k <= n; k++) {
                S[n][k] = (S[n - 1][k] + comb_cum[n - 1][k]) % MOD;
            }
        }

        long x = 0;
        for (int k = 0; k <= A; k++) {
            x = (x + comb[B - 1][k] * S[k][A - k]) % MOD;
        }
        System.out.println(x);
    }
}