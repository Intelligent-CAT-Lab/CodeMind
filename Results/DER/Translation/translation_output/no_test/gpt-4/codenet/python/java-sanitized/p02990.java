import java.util.Scanner;
import java.math.BigInteger;

public class p02990 {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        input.close();

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                long ans = comb(N - K + 1, i, MOD) * between(N, K, i);
                ans %= MOD;
                System.out.println(ans);
            }
        }
    }

    private static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }

    private static long comb(int n, int r, int mod) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) % mod;
            res = res * BigInteger.valueOf(i + 1).modInverse(BigInteger.valueOf(mod)).longValue() % mod;
        }
        return res;
    }
}