import java.util.Scanner;
import java.math.BigInteger;

public class p04038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        BigInteger MOD = BigInteger.valueOf(1000000007);

        BigInteger[] fact = new BigInteger[N + 1];
        BigInteger[] fact_inv = new BigInteger[N + 1];

        fact[0] = BigInteger.ONE;
        fact_inv[0] = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
            fact_inv[i] = fact_inv[i - 1].multiply(BigInteger.valueOf(MOD.subtract(BigInteger.valueOf(i))));
        }

        BigInteger[] dp = new BigInteger[N + 1];
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;

        for (int i = 2; i <= N; i++) {
            BigInteger prev = dp[i - 1];
            dp[i] = prev.multiply(BigInteger.valueOf(i)).mod(MOD);
            for (int j = 1; j < i; j++) {
                dp[i] = dp[i].subtract(prev.multiply(BigInteger.valueOf(j)).mod(MOD));
            }
        }

        BigInteger answer = BigInteger.ZERO;
        for (int i = 0; i <= N; i++) {
            answer = answer.add(dp[i].multiply(fact[i * (K - 1) - 1]).mod(MOD));
        }

        System.out.println(answer.mod(MOD));
    }
}