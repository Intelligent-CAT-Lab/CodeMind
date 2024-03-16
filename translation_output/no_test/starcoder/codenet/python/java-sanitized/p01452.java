import java.util.*;
import java.io.*;

public class p01452 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, m, k;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            m = Integer.parseInt(br.readLine());
            k = Integer.parseInt(br.readLine());

            int[] dp = new int[k + 1];
            dp[0] = 1;
            for (int i = 0; i < k; i++) {
                for (int j = 0; j <= i; j++) {
                    dp[i + 1] += dp[j] * dp[i - j];
                    dp[i + 1] %= 1000000007;
                }
            }

            bw.write(dp[k] + "\n");
        }

        bw.flush();
        bw.close();
    }
}