import java.util.*;
import java.math.*;

public class p02990 {
    static final BigInteger MOD = BigInteger.valueOf((long)1e9 + 7);
    static BigInteger[] fact, inv;

    static BigInteger comb(int n, int r) {
        if (r < 0 || r > n) return BigInteger.ZERO;
        return fact[n].multiply(inv[r]).multiply(inv[n - r]).mod(MOD);
    }

    static BigInteger between(int n, int k, int i) {
        if (i == 1) return BigInteger.ONE;
        return comb(k - 1, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        fact = new BigInteger[N + 1];
        inv = new BigInteger[N + 1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
        }
        inv[N] = fact[N].modInverse(MOD);
        for (int i = N; i > 0; i--) {
            inv[i - 1] = inv[i].multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                BigInteger ans = comb(N - K + 1, i).multiply(between(N, K, i));
                ans = ans.mod(MOD);
                System.out.println(ans);
            }
        }
    }
}