import java.util.*;
import java.math.BigInteger;

public class p03431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = 998244353;

        long[] f = new long[k + 1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (i * f[i - 1]) % p;
        }

        long res = 0;
        for (int i = n - 1; i <= k; i++) {
            long term = f[k] * modInverse(f[i], p) % p;
            term = term * modInverse(f[k - i], p) % p;
            res = (res + term) % p;
        }

        System.out.println(res);
    }

    private static long modInverse(long a, int m) {
        return BigInteger.valueOf(a)
                         .modInverse(BigInteger.valueOf(m))
                         .longValue();
    }
}