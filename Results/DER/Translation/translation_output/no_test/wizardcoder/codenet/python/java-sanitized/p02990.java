import java.util.*;
import java.math.*;

public class p02990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        BigInteger[][] dp = new BigInteger[N+1][K+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], BigInteger.ZERO);
        }

        for (int i = 1; i <= N; i++) {
            dp[i][1] = BigInteger.valueOf(1);
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= K; j++) {
                dp[i][j] = dp[i-1][j].multiply(BigInteger.valueOf(i-1)).mod(BigInteger.valueOf(MOD));
            }
        }

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N-K+1) {
                System.out.println(0);
            } else {
                BigInteger ans = dp[N-K+1][i].multiply(dp[N][K-i+1]).mod(BigInteger.valueOf(MOD));
                System.out.println(ans);
            }
        }
    }
}