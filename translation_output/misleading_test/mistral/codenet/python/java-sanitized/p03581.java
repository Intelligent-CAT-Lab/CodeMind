import java.util.*;
import java.io.*;

public class p03581 {
    static int mod = (int) 1e9 + 7;
    static int U = 2001;
    static long[][] comb = new long[U][U];
    static long[] comb_cum = new long[U];
    static long[] S = new long[U][U];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for (int i = 0; i < U; i++) {
            Arrays.fill(comb[i], 0);
            comb[i][0] = 1;
            for (int j = 1; j < i; j++) {
                comb[i][j] = comb[i - 1][j] + comb[i - 1][j - 1];
                comb[i][j] %= mod;
            }
            comb[i][i + 1] = comb[i - 1][i] + comb[i - 1][i - 1];
            comb[i][i + 1] %= mod;
        }

        Arrays.fill(comb_cum, 0);
        for (int i = 0; i < U; i++) {
            comb_cum[i] = comb[i].cumsum(Arrays.asList(0, 1));
        }

        for (int i = 0; i < A; i++) {
            S[i][0] = 1;
            for (int j = 1; j < B - i + 1; j++) {
                S[i][j] = comb_cum[j] - comb_cum[j - 1];
            }
        }

        long x = 0;
        for (int i = 0; i <= B; i++) {
            x += comb[B - 1][i] * (Arrays.stream(S[i]).sum() % mod);
        }
        x %= mod;

        System.out.println(x);
    }
}