import java.util.*;
import java.math.*;

public class p03375 {
    static final int MOD = (int)1e9+7;
    static BigInteger[] fact, factInv, pow2, powPow;
    static BigInteger[][] B, pow2Mat;
    static int N;

    static BigInteger pow(BigInteger a, BigInteger b) {
        BigInteger res = BigInteger.ONE;
        while (b.compareTo(BigInteger.ZERO) > 0) {
            if (b.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                res = res.multiply(a).mod(BigInteger.valueOf(MOD));
            }
            a = a.multiply(a).mod(BigInteger.valueOf(MOD));
            b = b.divide(BigInteger.TWO);
        }
        return res;
    }

    static BigInteger comb(int n, int k) {
        if (k < 0 || k > n) return BigInteger.ZERO;
        return fact[n].multiply(factInv[k]).multiply(factInv[n-k]).mod(BigInteger.valueOf(MOD));
    }

    static void init() {
        fact = new BigInteger[N+1];
        factInv = new BigInteger[N+1];
        pow2 = new BigInteger[N+1];
        powPow = new BigInteger[N+1];
        B = new BigInteger[N+1][N+1];
        pow2Mat = new BigInteger[N+1][N+1];

        fact[0] = BigInteger.ONE;
        factInv[0] = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
            factInv[i] = pow(fact[i], BigInteger.valueOf(MOD-2));
        }

        pow2[0] = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            pow2[i] = pow2[i-1].multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(MOD));
        }

        powPow[0] = BigInteger.valueOf(2);
        for (int i = 1; i <= N; i++) {
            powPow[i] = powPow[i-1].multiply(powPow[i-1]).mod(BigInteger.valueOf(MOD));
        }

        B[0][0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            for (int l = 1; l <= n; l++) {
                B[n][l] = B[n-1][l-1];
                for (int k = 1; k <= n; k++) {
                    B[n][l] = B[n][l].add(B[n-1][k].multiply(BigInteger.valueOf(k))).mod(BigInteger.valueOf(MOD));
                }
            }
        }

        pow2Mat[0][0] = BigInteger.ONE;
        for (int n = 1; n <= N; n++) {
            pow2Mat[n][0] = pow2Mat[n-1][0].multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(MOD));
            for (int l = 1; l <= n; l++) {
                pow2Mat[n][l] = pow2Mat[n][l-1].multiply(BigInteger.valueOf(2)).mod(BigInteger.valueOf(MOD));
            }
        }
    }

    static BigInteger solve() {
        BigInteger[] A