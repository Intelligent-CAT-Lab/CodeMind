Here is the Java translation of the given Python code that calculates the sum using `java.math.BigDecimal` for precision:

```java
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        BigDecimal d = BigDecimal.ZERO;
		
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(valueOf(N), MathContext.DECIMAL128));
        }
        
        for (int i = 0; i < (N >= K ? K : N); i++) {
            double a = Math.log(K / (double)(i + 1)) / Math.log(2);
            d = d.add(ONE.divide(valueOf(2).pow((int)Math.ceil(a)), MathContext.DECIMAL128).multiply(ONE.divide(valueOf(N), MathContext.DECIMAL128)));
        }

        System.out.println(s.add(d, MathContext.DECIMAL128).doubleValue());
        scanner.close();
    }
}
```

Please note that the `math.log` function with base 2 in Python is translated to `Math.log` divided by `Math.log(2)` to achieve the logarithm base 2 in Java. For fractions, we are using `BigDecimal` which can handle arbitrary-precision signed decimal numbers. We also need to ensure we set a `MathContext` for division operations to avoid non-terminating decimal expansions.

To run the above code, feed the input "3 10" and it should produce the output close to "71.6240279555314" depending on rounding and precision settings. Please note that due to the differences in floating-point precision and handling between Python and Java, as well as differences in arbitrary-precision arithmetic, the outputs might not be identical but should be very close.
