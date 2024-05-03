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
        BigDecimal result = new BigDecimal(4.0/3.0 * Math.PI * Math.pow(B, 3));
        result = result.setScale(10, RoundingMode.HALF_UP);
        System.out.println(result.toPlainString());
    }
}
```

This Java code does the same thing as your Python code. It reads two double values from the user, calculates the result, and then prints it out with 10 decimal places. The BigDecimal class is used to handle the precision of the floating point numbers. The setScale method is used to round the result to 10 decimal places. The RoundingMode.HALF_UP rounding mode is used to ensure that the result is rounded to the nearest number with a half-up strategy.
