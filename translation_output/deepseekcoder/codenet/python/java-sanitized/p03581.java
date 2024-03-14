import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p03581 {
    static final long MOD = (long) Math.pow(10, 9) + 7;
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
            for (int k = 0; k <= n; k++) {
                comb[n][k] = (comb[n - 1][k] + (k > 0 ? comb[n - 1][k - 1] : 0)) % MOD;
            }
        }

        for (int n = 0; n < U; n++) {
            for (int m = 1; m < U; m++) {
                S[n][m] = (S[n][m - 1] + comb[n][m]) % MOD;
            }
        }

        long x = 0;
        for (int k = 0; k <= A; k++) {
            x = (x + comb[B - 1][k] * sum(S[k], A - k + 1)) % MOD;
        }
        System.out.println(x);
    }

    static long sum(long[] arr, int len) {
        long s = 0;
        for (int i = 0; i < len; i++) {
            s = (s + arr[i]) % MOD;
        }
        return s;
    }
}