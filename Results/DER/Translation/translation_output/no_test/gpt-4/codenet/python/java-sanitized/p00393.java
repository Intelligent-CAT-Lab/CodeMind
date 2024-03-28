import java.util.Scanner;

public class p00393 {
    public static void main(String[] args) {
        final int MOD = 1000000007;
        
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        
        long[] pow = new long[N + 1];
        long[] dp = new long[N + 1];
        pow[0] = 1;
        
        for (int i = 1; i <= N; i++) {
            pow[i] = pow[i - 1] * 2;
            pow[i] %= MOD;
        }
        
        dp[0] = 1;
        
        for (int i = 1; i <= M; i++) {
            dp[i] = pow[i];
        }
        
        dp[M] -= 1;
        
        for (int i = M + 1; i <= N; i++) {
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - M - 1]);
            dp[i] %= MOD;
        }
        
        System.out.println((pow[N] - dp[N] + MOD) % MOD);
        
        scanner.close();
    }
}