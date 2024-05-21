import java.io.*;
import java.util.*;

public class p02990 {
    static long MOD = 100000007;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = in.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);
        long[][] comb = new long[N-K+2][N-K+2];
        for (int i = 0; i <= N-K+1; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                comb[i][j] = (comb[i-1][j-1] + comb[i-1][j]) % MOD;
            }
        }
        long[] between = new long[K+1];
        for (int i = 1; i <= K; i++) {
            between[i] = comb[K-1][i-1];
        }
        for (int i = 1; i <= K; i++) {
            if (i > K || i > N-K+1) {
                out.println(0);
            } else {
                long ans = comb[N-K+1][i] * between[i] % MOD;
                out.println(ans);
            }
        }
        in.close();
        out.close();
    }
}