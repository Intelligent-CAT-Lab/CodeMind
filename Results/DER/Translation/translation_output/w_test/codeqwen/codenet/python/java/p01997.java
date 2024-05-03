Here is the Java equivalent of your Python code:

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
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads two double values from the user, calculates the result, and then prints it out with 10 decimal places. The BigDecimal class is used to handle the rounding of the result.
