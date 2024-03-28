import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p02339 {
    static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[][] dp = new long[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = (dp[i][j] + (j + 1) * dp[i][j + 1]) % MOD;
            }
        }

        System.out.println(dp[n][k]);
    }
}