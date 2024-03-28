Below is the translated Java code for the provided Python code. The `BigDecimal` class in Java is used to handle arbitrary-precision decimal numbers, similar to the `Decimal` class in Python.

```java
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class BigDecimalComputation {
    public static void main(String[] args) {
        // Use a custom math context with 200 digits of precision
        MathContext mc = new MathContext(200);

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        BigDecimal n = new BigDecimal(input[0], mc);
        BigDecimal d = new BigDecimal(input[1], mc);
        BigDecimal x = new BigDecimal(input[2], mc);
        BigDecimal ans = BigDecimal.ZERO;
        BigDecimal two = new BigDecimal("2", mc);

        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal bigI = new BigDecimal(i, mc);
            BigDecimal term1 = n.subtract(bigI).add(BigDecimal.ONE);
            BigDecimal term2 = d.add(x.multiply((n.multiply(two).subtract(BigDecimal.ONE)).divide(two, mc)));
            ans = ans.add(term1.divide(bigI, mc).multiply(term2, mc));
        }

        // Print the result
        System.out.println(ans);
        
        scanner.close();
    }
}
```

To test this Java code with the input provided in the test case, please make sure to run it with an environment that has support for high-precision computations like the ones required by the BigDecimal class.

Test input:
1000 100 100

Expected output:
649620280.957660079002380
