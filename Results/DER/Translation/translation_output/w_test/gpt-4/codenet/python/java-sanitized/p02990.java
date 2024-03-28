import java.util.Scanner;
import java.math.BigInteger;

public class p02990 {

    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                BigInteger ans = comb(N - K + 1, i, MOD)
                                .multiply(between(N, K, i, MOD))
                                .mod(BigInteger.valueOf(MOD));
                System.out.println(ans);
            }
        }
        scanner.close();
    }

    private static BigInteger between(int n, int k, int i, int mod) {
        if (i == 1) {
            return BigInteger.ONE;
        }
        return comb(k - 1, i - 1, mod);
    }

    private static BigInteger comb(int n, int r, int mod) {
        r = Math.min(r, n - r);
        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            res = res.multiply(BigInteger.valueOf(n - i))
                     .multiply(BigInteger.valueOf(i + 1).modInverse(BigInteger.valueOf(mod)))
                     .mod(BigInteger.valueOf(mod));
        }
        return res;
    }
}