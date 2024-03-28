Here is the Java equivalent of the Python code you've provided:

```java
import java.util.Scanner;

public class ModCombExample {
    private static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        long X = powMod(2, n, MOD) - 1;
        long A = modComb(n, a, MOD);
        long B = modComb(n, b, MOD);
        long ans = (X - A - B + 2 * MOD) % MOD; // Adding 2*MOD to handle negative values
        System.out.println(ans);
    }

    private static long modComb(int n, int a, long mod) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt = (cnt * (n - i)) % mod;
            cnt = (cnt * powMod(i + 1, mod - 2, mod)) % mod;
        }
        return cnt;
    }

    private static long powMod(long base, long exponent, long mod) {
        long result = 1;
        base = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}
```

Notes on the Java code:

- I replaced the tuple unpacking with separate variable declarations.
- Java does not have a built-in `pow` function for modular exponentiation that handles negative exponents for modular multiplicative inverses, so I implemented `powMod` method to perform the modular exponentiation.
- Since Java does not support operator overloading, the `%` operator must be used explicitly for each arithmetic operation to ensure the result stays within the modular bounds.
- Java's `%` operator can return a negative result for negative operands, so I corrected for this when performing `(X - A - B)` by adding `2 * MOD` before taking the modulo. This is a common trick to make sure the final result is positive.
- The `Scanner` class was used for input, similar to Python's `input()` function.
- I closed the `Scanner` object to avoid a resource leak, which is a good practice in Java.
- The method `modComb` corresponds to the `modcomb` function in Python.

Make sure to wrap this Java code within a class if you're using it as a standalone program.
