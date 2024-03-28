Here is the Java equivalent of the Python code provided:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    private static final int MAX_N = (int)1e6;
    private static final int MOD = 998244353;
    private static BigInteger[] fact = new BigInteger[MAX_N + 4];
    private static BigInteger[] factInv = new BigInteger[MAX_N + 4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        // Precompute factorials and modular inverses
        precompute();

        BigInteger ans = BigInteger.ZERO;
        BigInteger mBI = BigInteger.valueOf(m);
        BigInteger mMinusOneBI = BigInteger.valueOf(m - 1);

        for (int x = 0; x <= k; x++) {
            BigInteger term = mBI.multiply(mMinusOneBI.modPow(BigInteger.valueOf(n - 1 - x), BigInteger.valueOf(MOD)))
                                 .multiply(modCombK(n - 1, x))
                                 .mod(BigInteger.valueOf(MOD));
            ans = ans.add(term).mod(BigInteger.valueOf(MOD));
        }

        if (ans.compareTo(BigInteger.ZERO) < 0) {
            ans = ans.add(BigInteger.valueOf(MOD));
        }
        System.out.println(ans);
    }

    private static void precompute() {
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
        factInv[factInv.length - 1] = fact[fact.length - 1].modInverse(BigInteger.valueOf(MOD));
        for (int i = factInv.length - 2; i >= 0; i--) {
            factInv[i] = factInv[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(MOD));
        }
    }

    private static BigInteger modCombK(int n, int k) {
        return fact[n].multiply(factInv[k])
            .multiply(factInv[n - k])
            .mod(BigInteger.valueOf(MOD));
    }
}
```

This Java program reads three integers `n`, `m`, and `k` from the standard input, performs calculations similar to the Python code, and outputs the result. The modular exponentiation and inverse operations are performed using `BigInteger`'s `modPow` and `modInverse` methods respectively, which handle the modular arithmetic.

Please note that you'll need Java 8 or higher to run this code since it makes use of the `BigInteger` functionality that was expanded in Java 8. Also, BigInteger is used here because it natively supports operations such as modular inverse and modular exponentiation which are non-trivial with primitive types.
