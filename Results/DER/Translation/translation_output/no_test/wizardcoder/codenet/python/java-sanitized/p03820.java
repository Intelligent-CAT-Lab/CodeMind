import java.io.*;
import java.util.*;

public class p03820 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int MOD = 1_000_000_007;

        int[][] C = new int[2010][2010];
        C[0][0] = 1;
        for (int i = 1; i < 2010; i++) {
            for (int j = 0; j <= i; j++) {
                C[i][j] = (C[i - 1][j] + C[i - 1][j - 1]) % MOD;
            }
        }

        int[][] dp = new int[N + 10][N + 10];
        dp[0][0] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % MOD;
            }
        }

        for (int i = N; i >= 1; i--) {
            for (int j = i; j <= N; j++) {
                dp[i][j] -= dp[i - 1][j];
                dp[i][j] %= MOD;
            }
        }

        int ans = 0;
        if (K == N - 1) {
            ans = dp[N][N - 1];
        } else {
            for (int r = N - K; r <= N; r++) {
                int x = C[r - 2][N - K - 2];
                int a = N - r;
                int b = K - a;
                if (b == 0) {
                    x = x * dp[a][a] % MOD;
                } else {
                    int[] temp = new int[a + b];
                    for (int i = 0; i < a + b; i++) {
                        temp[i] = dp[i + 1][a + i];
                    }
                    for (int i = 0; i < a + b; i++) {
                        temp[i] = (temp[i] * C[b - 1 + i][b - 1]) % MOD;
                    }
                    Arrays.sort(temp);
                    for (int i = 0; i < a + b; i++) {
                        temp[i] = (temp[i] * C[b - 1][b - 1 - i]) % MOD;
                    }
                    Arrays.sort(temp);
                    for (int i = 0; i < a + b; i++) {
                        x = (x + temp[i]) % MOD;
                    }
                }
                ans = (ans + x) % MOD;
            }
        }

        ans = (ans * pow(2, N - K - 2, MOD)) % MOD;
        bw.write(ans + "\n");

        bw.close();
        br.close();
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}