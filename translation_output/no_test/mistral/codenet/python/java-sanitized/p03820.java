import java.util.Scanner;
import org.jfree.math.BigInteger;

public class p03820 {
    private static final BigInteger MOD = BigInteger.valueOf(1_000_000_007);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        BigInteger[][] C = new BigInteger[2010][2010];
        C[0][0] = BigInteger.ONE;
        for (int n = 1; n < 2010; n++) {
            C[n] = C[n - 1].add(C[n - 1].shiftLeft(1));
            C[n] = C[n].mod(MOD);
        }

        BigInteger[][] dp = new BigInteger[N + 10][N + 10];
        dp[0][0] = BigInteger.ONE;
        for (int n = 1; n < N + 10; n++) {
            dp[n][n] = dp[n - 1][n - 1].add(dp[n - 1][n]);
            dp[n][n] = dp[n][n].mod(MOD);
            for (int m = n + 1; m < N + 10; m++) {
                dp[n][m] = dp[n][m].add(dp[n - 1][m - 1]);
                dp[n][m] = dp[n][m].mod(MOD);
            }
        }
        for (int n = N + 9; n >= 0; n--) {
            dp[n] = dp[n].subtract(dp[n + 1]);
            dp[n] = dp[n].mod(MOD);
        }

        BigInteger ans = BigInteger.ZERO;
        if (K == N - 1) {
            ans = dp[0, N - 1].sum();
        } else {
            for (int r = N - K; r < N + 1; r++) {
                BigInteger x = C[r - 2, N - K - 2];
                BigInteger a = BigInteger.valueOf(N - r);
                BigInteger b = BigInteger.valueOf(K - a);
                if (b.equals(BigInteger.ZERO)) {
                    x = x.multiply(dp[0, a].sum()).mod(MOD);
                } else {
                    BigInteger y = C[b - 1, a - 1].toBigInteger().multiply(dp[1, a + 1].add(dp[a + 1, 1]).shiftRight(1));
                    y = y.mod(MOD);
                    x = x.multiply(y).mod(MOD);
                }
                ans = ans.add(x);
            }
        }
        ans = ans.mod(MOD);
        for (int i = N - K - 2; i >= 0; i--) {
            ans = ans.shiftLeft(1).add(ans.mod(MOD));
        }
        System.out.println(ans);
    }
}