import java.util.*;
import java.math.*;

public class p01452 {
    static final int mod = (int)Math.pow(10, 9) + 7;
    static BigInteger[] cm;

    static void comb_init(int n) {
        cm = new BigInteger[n+1];
        cm[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            cm[i] = cm[i-1].multiply(BigInteger.valueOf(i));
        }
    }

    static BigInteger comb(int a, int b) {
        return cm[a].divide(cm[a-b].multiply(cm[b]));
    }

    static BigInteger inv(BigInteger x) {
        return x.modInverse(BigInteger.valueOf(mod));
    }

    static BigInteger f(int n, int m, int k) {
        BigInteger r = BigInteger.ZERO;
        comb_init(n+m+k*2);
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            BigInteger mt = comb(n+m+k*2, n+i*2);
            BigInteger lk = BigInteger.ONE;
            BigInteger rk = BigInteger.ONE;
            if (i > 0) {
                lk = comb(n+i*2, i).subtract(comb(n+i*2, i-1));
            }
            if (j > 0) {
                rk = comb(m+j*2, j).subtract(comb(m+j*2, j-1));
            }
            r = r.add(mt.multiply(lk).multiply(rk));
            r = r.mod(BigInteger.valueOf(mod));
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BigInteger> rr = new ArrayList<>();
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if (n == 0) {
                break;
            }
            rr.add(f(n, m, k));
        }
        for (BigInteger r : rr) {
            System.out.println(r);
        }
    }
}