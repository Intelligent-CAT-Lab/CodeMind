import java.io.*;
import java.util.*;

public class p02668 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());
        int M = Integer.parseInt(br.readLine().trim());

        int MOD = (int) Math.pow(10, 9) + 7;

        int[] pow2 = new int[M + 10];
        pow2[0] = 1;
        for (int i = 1; i <= M; i++) {
            pow2[i] = (int) ((pow2[i - 1] * 2) % MOD);
        }

        int[] ipow2 = new int[M + 10];
        ipow2[0] = 1;
        for (int i = 1; i <= M; i++) {
            ipow2[i] = (int) ((ipow2[i - 1] * (1 + MOD) / 2) % MOD);
        }

        int[] dp = new int[M + 10];
        for (int i = 0; i <= M; i++) {
            dp[i] = pow2[i];
        }

        for (int i = 0; i < N - 1; i++) {
            update(dp, M, pow2, ipow2, MOD);
        }

        bw.write(dp[M] + "\n");

        bw.close();
        br.close();
    }

    public static void update(int[] dp, int M, int[] pow2, int[] ipow2, int MOD) {
        int[] B = Arrays.copyOf(dp, M + 10);
        int[] C = new int[M + 10];
        for (int i = 0; i <= M; i++) {
            C[i] = (int) ((dp[i] * i * ipow2[i]) % MOD);
        }
        for (int i = 1; i <= M; i++) {
            C[i] = (int) ((C[i] + C[i - 1]) % MOD);
        }
        for (int i = 1; i <= M; i++) {
            dp[i] = (int) ((C[i] * pow2[i - 1]) % MOD);
        }
        for (int i = 1; i <= M; i++) {
            dp[i] = (int) ((dp[i] + i * B[i]) % MOD);
        }
    }
}