Here is the equivalent Java code for the provided Python script:

```java
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split("\\s+");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);

        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }

        int n = (x + y) / 3;
        x -= n;
        y -= n;

        long[] fact = new long[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];

        long c = factN * modinv(factX, MOD) % MOD * modinv(factY, MOD) % MOD;
        System.out.println(c);
    }

    private static long[] xgcd(long a, long b) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            long q = a / b;
            long temp1 = a % b;
            long temp2 = x0 - q * x1;
            long temp3 = y0 - q * y1;
            a = b;
            b = temp1;
            x0 = x1;
            x1 = temp2;
            y0 = y1;
            y1 = temp3;
        }
        return new long[] { a, x0, y0 };
    }

    private static long modinv(long a, long m) {
        long[] result = xgcd(a, m);
        long g = result[0], x = result[1];
        if (g != 1) {
            throw new ArithmeticException("modular inverse does not exist");
        } else {
            return (x % m + m) % m;
        }
    }
}
```

Some points to note:

1. Java is a strongly-typed language, so you must declare the types for all variables.
2. Java uses camelCase naming convention, while the sample Python code uses snake_case. In the Java translation above, I've maintained the snake_case for the method names and variables for consistency with the original Python code, but it would be more idiomatic to use camelCase in Java.
3. The `BufferedReader` is used to read inputs from the console. Similarly, `System.out.println` is used to output results to the console.
4. Java doesn't have built-in support for big integers in mathematical operations, so it's essential to handle the mod operation after each multiplication to avoid overflow in the factorial calculation.
5. Exception handling in Java is done with `throw new ArithmeticException(...)` instead of `raise Exception(...)` in Python.
6. Division in Java is similar to Python's floor division (//) for integers.

Please ensure to run this inside a class file named `Main`, or adjust the class name according to your needs.
