Certainly! Below is the translation of the given Python code to Java:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(powMod(k, n, MOD));
    }

    private static long powMod(int base, int exponent, int mod) {
        long result = 1;
        long x = base % mod;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
            exponent /= 2;
        }

        return result;
    }
}
```

A few important notes on the differences between the Python code and the Java code:

1. Java requires a class and a `main` method to run the program. In this code, I've created a `Main` class with a `main` method to match the expected Java conventions.

2. Instead of `raw_input()` which is used in Python 2.x, Java uses a `Scanner` object to read input from standard input. 

3. Since Python handles large integers automatically, operations involving large numbers do not typically require consideration of integer overflow or modulus arithmetic in the way they do in Java. In Java, we need to cast the result to `long` and take care of modulo operation manually to prevent overflow.

4. Java does not have built-in big number arithmetic for the power operation with modulus unlike Python's pow function, hence, I've defined a custom method `powMod` that computes the power result modulo `MOD` efficiently using binary exponentiation.
