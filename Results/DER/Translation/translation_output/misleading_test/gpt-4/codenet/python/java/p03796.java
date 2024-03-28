Here's the equivalent Java code for the provided Python script. The code reads an integer from standard input, calculates the factorial of that number, and then prints the result modulo 1000000007. 

```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        BigInteger modulo = BigInteger.valueOf(1000000007);
        BigInteger result = factorial.mod(modulo);

        System.out.println(result.intValue());
    }
}
```

Please note that Java does not have a built-in factorial function like Python's `math.factorial`, so we have to calculate the factorial manually. The `BigInteger` class is used here to handle potentially large numbers resulting from the factorial operation, which may exceed the max value for `int` or `long` in Java.

Compile and run this Java program and input `3` when prompted to match the provided test case. The expected output will be `-68`. However, since we're using `BigInteger` and the modulo operation, the actual result will always be non-negative. If the expected output is `-68`, it seems there's a discrepancy, as the modulo operation in Java should give a result between `0` and `1000000006`. It's likely the expected output is intended to be `6` instead, which is indeed `3! % 1000000007`.
