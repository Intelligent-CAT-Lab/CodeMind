import java.util.*;
import java.math.*;

public class p02169 {
    static int mod = 998244353;
    static BigInteger[][] comb;

    static BigInteger pow(BigInteger a, BigInteger b) {
        return a.modPow(b, BigInteger.valueOf(mod));
    }

    static BigInteger solve(int m, int n, int k) {
        if (n < k || m < k) {
            return BigInteger.ZERO;
        }
        BigInteger ans = pow(BigInteger.valueOf(m), BigInteger.valueOf(n));
        BigInteger[] p = new BigInteger[k+1];
        for (int i = 0; i <= k; i++) {
            p[i] = pow(BigInteger.valueOf(i), BigInteger.valueOf(n));
        }
        BigInteger c = BigInteger.valueOf(m);
        comb = new BigInteger[k+1][k+1];
        comb[0][0] = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <= i; j++) {
                comb[i+1][j] = comb[i+1][j].add(comb[i][j]);
                comb[i+1][j+1] = comb[i+1][j+1].add(comb[i][j]);
            }
        }
        for (int i = 1; i < k; i++) {
            BigInteger k_ = BigInteger.ZERO;
            for (int j = 1; j <= i; j++) {
                if (((i+j)&1) == 1) {
                    k_ = k_.subtract(comb[i][j].multiply(p[j]));
                } else {
                    k_ = k_.add(comb[i][j].multiply(p[j]));
                }
            }
            k_ = k_.multiply(c);
            c = c.multiply(BigInteger.valueOf(m-i)).mod(BigInteger.valueOf(mod));
            c = c.multiply(pow(BigInteger.valueOf(i+1), BigInteger.valueOf(mod-2))).mod(BigInteger.valueOf(mod));
            ans = ans.subtract(k_);
            ans = ans.mod(BigInteger.valueOf(mod));
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solve(m, n, k));
    }
}