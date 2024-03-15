Here's how you could translate the given Python code to Java:

```java
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class DecimalCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathContext mc = new MathContext(200); // Set precision to 200

        String[] input = scanner.nextLine().split(" ");
        BigDecimal n = new BigDecimal(input[0], mc);
        BigDecimal d = new BigDecimal(input[1], mc);
        BigDecimal x = new BigDecimal(input[2], mc);

        BigDecimal ans = BigDecimal.ZERO;
        BigDecimal two = new BigDecimal("2", mc);
        
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal bi = new BigDecimal(Integer.toString(i), mc);
            BigDecimal term1 = n.subtract(bi).add(BigDecimal.ONE);
            BigDecimal term2 = term1.divide(bi, mc);
            BigDecimal term3 = d.add(x.multiply(n.multiply(two).subtract(BigDecimal.ONE).divide(two, mc)));
            ans = ans.add(term2.multiply(term3, mc), mc);
        }

        System.out.println(ans);
        
        scanner.close();
    }
}
```

Please note that both the Python's `Decimal` and Java's `BigDecimal` are arbitrary-precision decimal types, but the way they handle precision and rounding might slightly differ.

Also, the original Python code uses `print(ans)` without formatting the output, which could lead to a scientific notation for very large or small numbers. In Java, `System.out.println(ans)` also prints out the exact representation without scientific notation as it would in this case, but if needed, you can format the output to a specific format using `DecimalFormat` or by calling `.toPlainString()` on the `BigDecimal` object.
