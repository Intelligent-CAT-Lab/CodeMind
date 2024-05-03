Here is the Java version of your Python code:

```java
import java.math.BigInteger;

public class Main {
    static BigInteger mod = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        int limit = 1341;
        BigInteger[] frac = new BigInteger[limit];
        BigInteger[] fraci = new BigInteger[limit];
        frac[0] = BigInteger.ONE;
        for (int i = 1; i < limit; i++) {
            frac[i] = BigInteger.valueOf(i).multiply(frac[i - 1]).mod(mod);
        }
        fraci[limit - 1] = frac[limit - 1].modInverse(mod);
        for (int i = limit - 2; i >= 0; i--) {
            fraci[i] = fraci[i + 1].multiply(BigInteger.valueOf(limit + i + 1)).mod(mod);
        }
        System.out.println(comb(frac, fraci, 300, 0));
    }

    static BigInteger comb(BigInteger[] frac, BigInteger[] fraci, int a, int b) {
        if (a < b || a < 0 || b < 0) {
            return BigInteger.ZERO;
        }
        return frac[a].multiply(fraci[b]).multiply(fraci[a - b]).mod(mod);
    }
}
```

Please note that the `comb` function is a recursive function that calculates the combination of `a` and `b` using the `frac` and `fraci` arrays. The `main` function initializes the `frac` and `fraci` arrays and then calls the `comb` function to calculate the combination of `300` and `0`. The result is then printed to the console.
