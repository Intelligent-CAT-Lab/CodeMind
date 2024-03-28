Below is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long X = modPow(2, n, MOD) - 1;
        long A = modComb(n, a, MOD);
        long B = modComb(n, b, MOD);
        long ans = (X - A - B + 2 * MOD) % MOD;
        System.out.println(ans);
        scanner.close();
    }

    private static long modPow(long base, int exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) != 0) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }

    private static long modComb(int n, int a, long mod) {
        long cnt = 1;
        for (int i = 0; i < a; ++i) {
            cnt = (cnt * (n - i)) % mod;
            cnt = (cnt * modPow(i + 1, (int)mod - 2, mod)) % mod;
        }
        return cnt;
    }
}
```

In the above Java code:

- We have a `Main` class with the `main` method as the entry point of the program.
- We use `Scanner` to read input from `System.in`.
- We have an additional `modPow` method which computes the modular exponentiation (base^exponent mod mod) using the fast exponentiation method.
- We have converted the `modComb` method from Python to Java and translated the for loop accordingly.
- Note that we cast `mod-2` to `int` in the `modComb` function call to `modPow` because exponents can be treated as `int` safely within the `modPow` function.
- We add `2 * MOD` before taking the modulo to ensure that the subtraction inside the parentheses does not result in a negative number, which can happen in some programming languages due to how the modulus operation is computed for negative numbers.
- We close the `Scanner` at the end to avoid resource leakage.
