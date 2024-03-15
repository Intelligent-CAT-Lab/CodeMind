Here's the translated code from Python to Java. You can use it within a `main` method of a Java class:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        BigInteger kBig = BigInteger.valueOf(k);
        BigInteger result = kBig.multiply(kBig.subtract(BigInteger.ONE).pow(n - 1));
        System.out.println(result);
    }
}
```

Let me explain the steps I took to convert the Python code to Java code:

1. Java requires type declarations. So, `n` and `k` need to be declared with their types (`int` in this case).
2. Input in Java can be read using a `Scanner` object.
3. In Java, we don't have the power operator (`**`) like in Python, so we need to use the `pow` method from the `BigInteger` class to handle the power operation. This is necessary since `n` and `k` could be large and might exceed the range of a primitive integer.
4. Java uses `System.out.println` for standard output.

Note that using `BigInteger` is important here since the result of the calculation can be very large, potentially exceeding the capacity of an `int` or a `long`. If you are sure the values of `n` and `k` are small enough to fit in an `int` or `long`, you could use the respective primitives and use `Math.pow` instead of `BigInteger`. However, the original Python code does not impose any limits on the value of `n` and `k`, which is why `BigInteger` is more appropriate for a direct translation.
