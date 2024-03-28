import java.util.Scanner;
import java.math.BigInteger;

public class p04038 {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        if (K == 1) {
            System.out.println(1);
            return;
        }

        BigInteger[] fact = new BigInteger[(N + 10) * (K + 10)];
        BigInteger[] factInv = new BigInteger[fact.length];
        makeFact(fact, factInv, fact.length);

        BigInteger[] dp = new BigInteger[N + 1];
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;

        for (int n = 2; n <= N; n++) {
            BigInteger[] prev = dp;
            dp = new BigInteger[n + 1];
            BigInteger S = BigInteger.ZERO;
            for (BigInteger val : prev) {
                S = S.add(val).mod(BigInteger.valueOf(MOD));
            }
            BigInteger[] cumulativePrev = new BigInteger[prev.length];
            cumulativePrev[0] = prev[0];
            for (int i = 1; i < prev.length; i++) {
                cumulativePrev[i] = cumulativePrev[i - 1].add(prev[i]);
            }
            dp[1] = S;
            for (int i = 2; i <= n; i++) {
                dp[i] = S.subtract(cumulativePrev[i - 2]).mod(BigInteger.valueOf(MOD));
            }

            for (int i = 1; i < dp.length; i++) {
                if (dp[i] == null) continue;
                BigInteger coef = fact[n * (K - 1) - 1 + i - 1]
                        .multiply(factInv[K - 2])
                        .multiply(factInv[(n - 1) * (K - 1) + i - 1])
                        .mod(BigInteger.valueOf(MOD));
                dp[i] = dp[i].multiply(coef).mod(BigInteger.valueOf(MOD));
            }
        }

        BigInteger answer = BigInteger.ZERO;
        for (BigInteger val : dp) {
            if (val != null) {
                answer = answer.add(val).mod(BigInteger.valueOf(MOD));
            }
        }
        answer = answer.multiply(fact[N]).mod(BigInteger.valueOf(MOD));
        System.out.println(answer);
    }

    private static void makeFact(BigInteger[] fact, BigInteger[] factInv, int U) {
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < U; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }

        factInv[U - 1] = fact[U - 1].modInverse(BigInteger.valueOf(MOD));
        for (int i = U - 2; i >= 0; i--) {
            factInv[i] = factInv[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(MOD));
        }
    }
}