import java.util.*;
import java.math.*;

public class p03365 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Reader f = new Reader(args.length > 0 ? args[0] : null);
        if (f.file != null) {
            while (true) {
                System.out.println("Case #" + f.case + "\n" + solve(f));
                try {
                    f.nextCase();
                } catch (NoSuchElementException e) {
                    break;
                }
            }
        } else {
            System.out.println(solve(f));
        }
    }

    static BigInteger solve(Reader f) {
        int n = f.readInt();

        BigInteger[] fact = new BigInteger[n + 1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] ifact = new BigInteger[n + 1];
        ifact[n] = BigInteger.ONE;
        for (int i = n - 1; i >= 0; i--) {
            ifact[i] = fact[i + 1].modPow(BigInteger.valueOf(MOD - 2), BigInteger.valueOf(MOD));
        }

        BigInteger ans = BigInteger.ZERO;
        BigInteger c0 = BigInteger.ZERO;
        for (int i = n / 2; i < n; i++) {
            BigInteger c1 = fact[i].multiply(fact[n - i - 1]).subtract(c0).mod(BigInteger.valueOf(MOD));
            ans = ans.add(c1.multiply(BigInteger.valueOf(i))).mod(BigInteger.valueOf(MOD));
            c0 = c0.add(c