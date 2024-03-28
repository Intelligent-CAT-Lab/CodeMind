import java.util.*;
import java.math.*;

public class p02169 {
    static int mod = (int) 1e9 + 7;
    static BigInteger[] fact;
    static BigInteger[] inv;

    static BigInteger powmod(BigInteger a, BigInteger b) {
        BigInteger res = BigInteger.ONE;
        while (!b.equals(BigInteger.ZERO)) {
            if (b.testBit(0)) {
                res = res.multiply(a).mod(BigInteger.valueOf(mod));
            }
            a = a.multiply(a).mod(BigInteger.valueOf(mod));
            b = b.shiftRight(1);
        }
        return res;
    }

    static BigInteger comb(int n, int k) {
        if (k > n || k < 0) {
            return BigInteger.ZERO;
        }
        return fact[n].multiply(inv[k]).multiply(inv[n - k]).mod(BigInteger.valueOf(mod));
    }

    static void solve() {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        if (n < k || m < k) {
            System.out.println(0);
            return;
        }
        BigInteger ans = powmod(BigInteger.valueOf(m), BigInteger.valueOf(n));
        BigInteger c = BigInteger.valueOf(m);
        fact = new BigInteger[k + 1];
        inv = new BigInteger[k + 1];
        fact[0] = BigInteger.ONE;
        inv[0] = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
            inv[i] = powmod(fact[i], BigInteger.valueOf(mod - 2));
        }
        for (int i = 1; i < k; i++) {
            BigInteger kk = BigInteger.ZERO;
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 1) {
                    kk = kk.subtract(comb(i, j).multiply(powmod(BigInteger.valueOf(j), BigInteger.valueOf(n))));
                } else {
                    kk = kk.add(comb(i, j).multiply(powmod(BigInteger.valueOf(j), BigInteger.valueOf(n))));
                }
            }
            kk = kk.multiply(c);
            c = c.multiply(BigInteger.valueOf(m - i)).mod(BigInteger.valueOf(mod));
            c = c.multiply(powmod(BigInteger.valueOf(i + 1), BigInteger.valueOf(mod - 2))).mod(BigInteger.valueOf(mod));
            ans = ans.subtract(kk.mod(BigInteger.valueOf(mod)));
        }
        System.out.println(ans.mod(BigInteger.valueOf(mod)));
    }

    public static void main(String[] args) {
        solve();
    }
}