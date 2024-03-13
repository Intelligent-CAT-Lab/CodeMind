import java.util.*;
import java.io.*;

public class p03581 {
    static final int MOD = (int)1e9 + 7;
    static final int U = 2001;
    static long[][] comb = new long[U][U];
    static long[][] S = new long[U][U];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        comb[0][0] = 1;
        for (int n = 1; n < U; n++) {
            System.arraycopy(comb[n - 1], 0, comb[n], 0, n);
            for (int i = 1; i <= n; i++) {
                comb[n][i] = (comb[n][i] + comb[n - 1][i - 1]) % MOD;
            }
        }

        for (int n = 0; n < U; n++) {
            for (int i = 1; i <= n; i++) {
                comb[n][i] = (comb[n][i] + comb[n][i - 1]) % MOD;
            }
        }

        for (int n = 0; n < U; n++) {
            for (int i = 0; i <= n; i++) {
                S[n][i] = comb[n][i];
            }
            for (int i = 1; i <= n; i++) {
                S[n][i] = (S[n][i] + S[n][i - 1]) % MOD;
            }
        }

        long x = 0;
        for (int k = 0; k <= A; k++) {
            x = (x + comb[B - 1][k] * S[k][Math.min(A - k, k)]) % MOD;
        }
        System.out.println(x);
    }
}