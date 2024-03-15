Here's the translated code from Python to Java:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    static final int MOD = 10_0000_0007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        BigInteger[] factorial = new BigInteger[H + W + 1];
        BigInteger[] inv_factorial = new BigInteger[H + W + 1];
        factorial[0] = BigInteger.ONE;
        inv_factorial[0] = BigInteger.ONE;
        
        for (int i = 1; i < H + W + 1; i++) {
            factorial[i] = factorial[i-1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
            inv_factorial[i] = factorial[i].modInverse(BigInteger.valueOf(MOD));
        }

        BigInteger answer = BigInteger.ZERO;
        for (int i = B + 1; i <= W; i++) {
            answer = answer.add(f(H - A, i, factorial, inv_factorial).multiply(f(A, W - i + 1, factorial, inv_factorial)));
            answer = answer.mod(BigInteger.valueOf(MOD));
        }

        System.out.println(answer.intValue());
    }

    private static BigInteger f(int h, int w, BigInteger[] factorial, BigInteger[] inv_factorial) {
        return factorial[h + w - 2].multiply(
                inv_factorial[h - 1].multiply(inv_factorial[w - 1])
        ).mod(BigInteger.valueOf(MOD));
    }
}
```

This Java code does the equivalent task as the Python code. Note the following differences while translating the code:
- Instead of a `list`, we use an array of `BigInteger` in Java to handle the factorials and their inverses.
- `BigInteger` provides built-in functions to perform modular arithmetic actions like `multiply`, `mod`, and `modInverse`.
- We use `Scanner` for input. Be sure to close the `Scanner` to avoid any resource leaks.
- The `f` function has been adapted to Java, taking additional arguments `factorial` and `inv_factorial` as there are no closures in Java.
- The Python `print` function has been replaced with `System.out.println` and we use `intValue()` method to convert the BigInteger to an integer.
- In Java, constants are typically declared in uppercase, and underscore is used to separate thousands groups to improve readability (e.g., `MOD` instead of `mod` and `10_0000_0007`).
