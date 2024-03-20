import java.util.*;
import java.math.*;

public class p02862 {
    static final int MOD = 1000000007;
    static BigInteger[] fact;
    static BigInteger[] inv;
    static BigInteger[] invFact;

    static BigInteger modinv(BigInteger a, BigInteger m) {
        BigInteger[] xgcd = xgcd(a, m);
        if (xgcd[0].compareTo(BigInteger.ONE) != 0) {
            throw new RuntimeException("modular inverse does not exist");
        } else {
            return xgcd[1].mod(m);
        }
    }

    static BigInteger[] xgcd(BigInteger a, BigInteger b) {
        BigInteger x0 = BigInteger.ONE;
        BigInteger y0 = BigInteger.ZERO;
        BigInteger x1 = BigInteger.ZERO;
        BigInteger y1 = BigInteger.ONE;
        while (b.compareTo(BigInteger.ZERO) != 0) {
            BigInteger q = a.divide(b);
            BigInteger[] tmp = {a, b};
            a = b;
            b = tmp[0].mod(tmp[1]);
            BigInteger[] tmp2 = {x0, x1};
            x0 = x1;
            x1 = tmp2[0].subtract(q.multiply(tmp2[1]));
            BigInteger[] tmp3 = {y0, y1};
            y0 = y1;
            y1 = tmp3[0].subtract(q.multiply(tmp3[1]));
        }
        return new BigInteger[]{a, x0, y0};
    }

    static void init(int n) {
        fact = new BigInteger[n + 1];
        inv = new BigInteger[n + 1];
        invFact = new BigInteger[n + 1];
        fact[0] = BigInteger.ONE;
        fact[1] = BigInteger.ONE;
        inv[1] = BigInteger.ONE;
        invFact[0] = BigInteger.ONE;
        invFact[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
            fact[i] = fact[i].mod(BigInteger.valueOf(MOD));
            inv[i] = BigInteger.valueOf(MOD).subtract(inv[MOD % i].multiply(BigInteger.valueOf(MOD / i)));
            invFact[i] = invFact[i - 1].multiply(inv[i]);
            invFact[i] = invFact[i].mod(BigInteger.valueOf(MOD));
        }
    }

    static BigInteger comb(int n, int r) {
        if (n < r) {
            return BigInteger.ZERO;
        }
        BigInteger ret = fact[n].multiply(invFact[r]);
        ret = ret.mod(BigInteger.valueOf(MOD));
        ret = ret.multiply(invFact[n - r]);
        ret = ret.mod(BigInteger.valueOf(MOD));
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }
        int n = (x + y) / 3;
        x -= n;
        y -= n;
        init(n);
        System.out.println(comb(n, x));
    }
}