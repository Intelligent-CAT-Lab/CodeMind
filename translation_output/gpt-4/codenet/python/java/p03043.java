Below is the Python code translated into Java, implementing the same logic:

```java
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FractionCalculation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 32, RoundingMode.HALF_UP));
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d.add(BigDecimal.valueOf(Math.pow(0.5, Math.ceil(a)))
                        .multiply(BigDecimal.ONE.divide(new BigDecimal(N), 32, RoundingMode.HALF_UP)));
            }
            s = s.add(d);
        } else {
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d.add(BigDecimal.valueOf(Math.pow(0.5, Math.ceil(a)))
                        .multiply(BigDecimal.ONE.divide(new BigDecimal(N), 32, RoundingMode.HALF_UP)));
            }
            s = s.add(d);
        }
        System.out.println(s);
        scanner.close();
    }
}
```

Some considerations:

1. Java's `BigDecimal` is used for precision decimals instead of `Fraction`.
2. The `RoundingMode.HALF_UP` and precision is specified to match Python's default behavior.
3. The `Math.log()` method in Java, by default, computes the natural logarithm (base `e`), so to calculate the logarithm base `2`, we'll use the change of base formula: `Math.log(value) / Math.log(2)`.
4. A `Scanner` is used to read input from the standard input stream (i.e., `System.in`), similar to Python's `input()`.
5. The code is enclosed in a class named `FractionCalculation`, because all code in Java must be part of a class.

Please make sure to provide input in the format "N K" without the quotes when running this Java program, as that's how the `Scanner` expects to receive the input based on the `nextInt()` calls.
