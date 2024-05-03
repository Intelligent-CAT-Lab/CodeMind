Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        BigDecimal result = new BigDecimal(4.0/3.0 * Math.PI * Math.pow(B, 3)).setScale(10, RoundingMode.HALF_UP);
        System.out.println(result.toPlainString());
    }
}
```

In this Java code, we use `BigDecimal` for precise floating point arithmetic. The `setScale` method is used to round the result to 10 decimal places. The `RoundingMode.HALF_UP` argument specifies that if the last digit is 5 or more, the number should be rounded up.
