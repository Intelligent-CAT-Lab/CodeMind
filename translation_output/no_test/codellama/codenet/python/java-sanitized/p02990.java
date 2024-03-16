import java.util.Scanner;
import java.math.BigInteger;

public class p02990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        BigInteger MOD = BigInteger.valueOf(1000000007);

        BigInteger[][] dp = new BigInteger[N + 1][K + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = BigInteger.ONE;
                } else {
                    dp[i][j] = dp[i - 1][j - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
                }
            }
        }

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                BigInteger ans = dp[N - K + 1][i].multiply(between(N, K, i)).mod(MOD);
                System.out.println(ans);
            }
        }
    }

    public static BigInteger between(int n, int k, int i) {
        if (i == 1) {
            return BigInteger.ONE;
        } else {
            return comb(k - 1, i - 1, MOD);
        }
    }

    public static BigInteger comb(int n, int r, BigInteger mod) {
        r = Math.min(r, n - r);
        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            res = res.multiply(BigInteger.valueOf(n - i)).multiply(pow(i + 1, mod.subtract(BigInteger.ONE), mod)).mod(mod);
        }
        return res;
    }

    public static BigInteger pow(int a, BigInteger b, BigInteger mod) {
        BigInteger res = BigInteger.ONE;
        while (b.compareTo(BigInteger.ZERO) > 0) {
            if (b.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                res = res.multiply(BigInteger.valueOf(a)).mod(mod);
            }
            a = a * a % mod.intValue();
            b = b.divide(BigInteger.TWO);
        }
        return res;
    }
}</s>