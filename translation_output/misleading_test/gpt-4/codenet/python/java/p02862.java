Here's the translated code in Java, which computes the given functionality:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            System.exit(0);
        }

        int n = (x + y) / 3;
        x -= n;
        y -= n;

        BigInteger c = BigInteger.valueOf(fact(n))
            .multiply(modinv(BigInteger.valueOf(fact(x)), MOD))
            .multiply(modinv(BigInteger.valueOf(fact(y)), MOD))
            .mod(BigInteger.valueOf(MOD));

        System.out.println(c);
    }

    public static long fact(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    public static BigInteger modinv(BigInteger a, int m) {
        return a.modInverse(BigInteger.valueOf(m));
    }
}
```

This version of the program uses `BigInteger` for computations that may exceed the range of Java's primitive integer types. The `xgcd` and `modinv` functions are condensed into a single `modinv` method, which calculates the modular inverse using `BigInteger`'s `modInverse` method. The `fact` method computes the factorial of a number modulo `MOD`.

Please note that Java's standard library does not contain an implementation of the extended Euclidean algorithm as Python does, but in this case, it's not necessary since `BigInteger` has a built-in method for finding modular inverses. If you absolutely need the extended Euclidean algorithm for some other reason, you would have to implement it yourself.

Also, keep in mind that Java requires all code to be inside a class, and programs generally start execution from the `main` method. Inputs are read using a `Scanner` object and long integers are handled using the `long` primitive type or the `BigInteger` class when needed to handle very large numbers. The example here uses `BigInteger` to avoid integer overflow when computing factorials and performing modular multiplication.
