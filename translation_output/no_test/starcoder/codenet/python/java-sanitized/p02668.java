import java.util.*;
import java.io.*;

public class p02668 {
    static int MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] pow2 = new int[M + 10];
        pow2[0] = 1;
        for (int i = 1; i <= M; i++) {
            pow2[i] = pow2[i - 1] * 2 % MOD;
        }

        int[] ipow2 = new int[M + 10];
        ipow2[0] = 1;
        for (int i = 1; i <= M; i++) {
            ipow2[i] = ipow2[i - 1] * (1 + MOD) % MOD;
            ipow2[i] = ipow2[i] * ipow2[i - 1] % MOD;
            ipow2[i] = ipow2[i] * ipow2[i - 1] % MOD;
        }

        int[] dp = new int[M + 10];
        dp[0] = 1;
        for (int i = 0; i < N - 1; i++) {
            int[] dp2 = new int[M + 10];
            for (int j = 0; j < M; j++) {
                dp2[j + 1] = (dp2[j + 1] + dp[j] * pow2[j] % MOD) % MOD;
                dp2[j + 1] = (dp2[j + 1] + dp[j] * j * ipow2[j] % MOD) % MOD;
            }
            dp = dp2;
        }

        System.out.println(dp[M]);
    }
}