import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p02668 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        final int MOD = 100000007;
        int[] pow2 = new int[M + 10];
        int[] ipow2 = new int[M + 10];
        pow2[0] = 1;
        ipow2[0] = 1;
        int a = 2;
        for (int i = 1; i < M + 10; i++) {
            pow2[i] = (int) ((long) pow2[i - 1] * a % MOD);
            ipow2[i] = (int) ((long) ipow2[i - 1] * (a + 1) / 2 % MOD);
            a = (int) ((long) a * a % MOD);
        }

        int[] dp = new int[M + 1];
        for (int i = 0; i < M + 1; i++) {
            dp[i] = pow2[i];
        }
        for (int i = 0; i < N - 1; i++) {
            int[] next = new int[M + 1];
            for (int j = 1; j < M + 1; j++) {
                next[j] = (int) ((long) dp[j] * j % MOD);
            }
            for (int j = 1; j < M + 1; j++) {
                next[j] = (next[j] + next[j - 1]) % MOD;
            }
            for (int j = 1; j < M + 1; j++) {
                next[j] = (int) ((long) next[j] * pow2[M - j] % MOD);
            }
            for (int j = 1; j < M + 1; j++) {
                next[j] = (next[j] + dp[j - 1] * (j + 1)) % MOD;
            }
            dp = next;
        }

        System.out.println(dp[M]);
    }
}