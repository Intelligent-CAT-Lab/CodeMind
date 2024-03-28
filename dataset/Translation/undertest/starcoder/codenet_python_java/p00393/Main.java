import java.util.*;
import java.lang.*;
import java.io.*;

public class p00393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long MOD = 1000000007;
        long[] pow = new long[N + 1];
        pow[0] = 1;
        for (int i = 1; i <= N; i++) {
            pow[i] = pow[i - 1] * 2;
            pow[i] %= MOD;
        }
        long[] dp = new long[N + 1];
        dp[0] = 1;
        for (int i = 1; i <= M; i++) {
            dp[i] = pow[i];
        }
        dp[M] -= 1;
        for (int i = M + 1; i <= N; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 1] - dp[i - 1 - M])) % MOD;
        }
        System.out.println((pow[N] - dp[N] + MOD) % MOD);
    }
}