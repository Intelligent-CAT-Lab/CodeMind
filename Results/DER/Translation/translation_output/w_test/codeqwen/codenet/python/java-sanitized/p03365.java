import java.util.*;
import java.lang.*;
import java.math.*;

public class p03365 {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        BigInteger[] fact = new BigInteger[n+1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger[] ifact = new BigInteger[n+1];
        ifact[n] = BigInteger.ONE;
        for (int i = n-1; i >= 0; i--) {
            ifact[i] = ifact[i+1].multiply(BigInteger.valueOf(i+1)).mod(BigInteger.valueOf(MOD));
        }

        BigInteger ans = BigInteger.ZERO;
        BigInteger c0 = BigInteger.ZERO;
        for (int i = n/2; i < n; i++) {
            BigInteger c1 = fact[i-1].multiply(fact[n-i-1]).subtract(c0).mod(BigInteger.valueOf(MOD)).multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
            ans = ans.add(c1);
            c0 = c0.add(c1);
        }

        System.out.println(ans);
    }
}