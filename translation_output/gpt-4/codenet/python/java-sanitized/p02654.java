import java.util.Scanner;
import java.math.BigInteger;

public class p02654 {
    static final int MOD = 1000000007;

    public static BigInteger[] prepare(int n, int MOD) {
        BigInteger[] factorials = new BigInteger[n + 1];
        factorials[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorials[i] = factorials[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
        BigInteger[] finvs = new BigInteger[n + 1];
        finvs[n] = factorials[n].modInverse(BigInteger.valueOf(MOD));
        for (int i = n; i > 1; i--) {
            finvs[i - 1] = finvs[i].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
        return new BigInteger[]{factorials, finvs};
    }

    public static BigInteger solve(int n, int a) {
        BigInteger[] prepared = prepare(n, MOD);
        BigInteger[] facts = prepared[0];
        BigInteger[] finvs = prepared[1];
        
        BigInteger[] invs = new BigInteger[n + 1];
        for (int i = 0; i <= n; i++) {
            invs[i] = facts[i].multiply(finvs[i]).mod(BigInteger.valueOf(MOD));
        }
        
        int r = n - a;
        BigInteger ans = BigInteger.ZERO;
        
        for (int l = 0; l < a; l++) {
            BigInteger tmp1 = facts[a].multiply(finvs[l]).mod(BigInteger.valueOf(MOD))
                    .multiply(finvs[a - l]).mod(BigInteger.valueOf(MOD));
            BigInteger tmp2 = facts[n - l - 1].multiply(BigInteger.valueOf(a - l)).mod(BigInteger.valueOf(MOD));
            if (l % 2 == 1) // (-1) ** (l & 1)
                ans = ans.subtract(tmp