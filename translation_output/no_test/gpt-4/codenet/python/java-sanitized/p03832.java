import java.util.*;
import java.math.BigInteger;

public class p03832 {
    static final BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);
    static BigInteger[] fact, frev, dp, Y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        fact = new BigInteger[N + 1];
        frev = new BigInteger[N + 1];
        dp = new BigInteger[N + 1];
        Y = new BigInteger[N + 1];

        Arrays.fill(dp, BigInteger.ZERO);
        dp[0] = BigInteger.ONE;

        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
        }

        frev[N] = fact[N].modInverse(MOD);
        for (int i = N - 1; i >= 0; i--) {
            frev[i] = frev[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }

        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = Math.min(D * g, N);
            BigInteger y = frev[g];
            for (int i = C; i <= Math.min(D, N / g); i++) {
                BigInteger powYJ = y.modPow(BigInteger.valueOf(i), MOD);
                BigInteger frevJ = frev[i];
                Y[i * g] = powYJ.multiply(frevJ).mod(MOD);
            }
            for (int i = p; i <= N; i++) {
                BigInteger sum = BigInteger.ZERO;
                for (int j = p; j <= Math.min(q, i); j += g) {
                    sum = sum.add(dp[i - j].multiply(fact[i].divide(fact[i - j])).multiply(Y[j])).mod(MOD);
                }
                dp[i] = dp[i].add(frev[N - i].multiply(sum)).mod(MOD);
            }
        }

        System.out.println(dp[N].mod(MOD));
        scanner.close();
    }
}