import java.io.*;
import java.util.*;
import java.math.*;

public class p03365 {
    static final BigInteger MOD = BigInteger.valueOf((long)1e9 + 7);
    static BigInteger[] fact, ifact;

    static BigInteger nCk(int n, int k) {
        if (k < 0 || k > n) return BigInteger.ZERO;
        return fact[n].multiply(ifact[n-k]).multiply(ifact[k]).mod(MOD);
    }

    static BigInteger solve(BufferedReader f) throws IOException {
        int n = Integer.parseInt(f.readLine());

        fact = new BigInteger[n+1];
        ifact = new BigInteger[n+1];
        fact[0] = BigInteger.ONE;
        ifact[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i)).mod(MOD);
            ifact[i] = fact[i].modInverse(MOD);
        }

        BigInteger ans = BigInteger.ZERO;
        BigInteger c0 = BigInteger.ZERO;
        for (int i = n/2; i < n; i++) {
            BigInteger c1 = nCk(i-1, n-1-i).multiply(fact[i]).multiply(fact[n-i-1]).subtract(c0).add(MOD).mod(MOD);
            ans = ans.add(c