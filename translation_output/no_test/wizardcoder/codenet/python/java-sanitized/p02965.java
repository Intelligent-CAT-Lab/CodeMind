import java.io.*;
import java.util.*;

public class p02965 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, M;
        String[] line = br.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        M = Integer.parseInt(line[1]);

        int MOD = 998244353;
        int MAX = M * 3 // 2 + N;
        int[] factorials = new int[MAX + 1];
        int[] finvs = new int[MAX + 1];
        int p = 1;
        for (int i = 0; i <= MAX; i++) {
            factorials[i] = (int) (Math.pow(i, i) % MOD);
            finvs[i] = (int) (Math.pow(p, MOD - 2) % MOD);
            p = (int) ((p * finvs[i]) % MOD);
        }

        int[][] dp = new int[N + 1][M * 3 + 1];
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M * 3; j++) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j - 1]) % MOD;
            }
        }

        int ans = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M * 3; j++) {
                int cnt = dp[i][j];
                if (cnt == 0) {
                    continue;
                }
                int odds = j / 2;
                int halves = (j - odds) / 2;
                int oc1 = (int) (Math.pow(2,