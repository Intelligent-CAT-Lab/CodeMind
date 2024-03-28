import java.util.Scanner;
import java.math.BigInteger;

public class p03832 {
    private static final int MOD = 1_000_000_007;
    private static BigInteger[] fact;
    private static BigInteger[] frev;
    private static BigInteger[] dp;
    private static BigInteger[] Y;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        fact = new BigInteger[N + 1];
        frev = new BigInteger[N + 1];
        dp = new BigInteger[N + 1];
        Y = new BigInteger[N + 1];

        fact[0] = BigInteger.ONE;
        frev[0] = BigInteger.ONE;
        dp[0] = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
            frev[i] = fact[i].modInverse(BigInteger.valueOf(MOD));
        }

        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;

            BigInteger y = frev[g];
            for (int j = C; j <= Math.min(D, N / g); j++) {
                if (p <= N) {
                    Y[p] = y.pow(j).multiply(frev[j]).mod(BigInteger.valueOf(MOD));
                }
                p += g;
            }

            for (int i = C * g; i <= N; i++) {
                BigInteger sum = BigInteger.ZERO;
                for (int j = C * g; j <= Math.min(D * g, i); j += g) {
                    if (j <= N && dp[i - j] != null) {
                        sum = sum.add(dp[i - j].multiply(fact[N - i + j])
                            .multiply(Y[j]).mod(BigInteger.valueOf(MOD)));
                    }
                }
                if (dp[i] == null) dp[i] = BigInteger.ZERO;
                dp[i] = dp[i].add(frev[N - i].multiply(sum)).mod(BigInteger.valueOf(MOD));
            }
        }

        System.out.println(dp[N].mod(BigInteger.valueOf(MOD)));
    }
}