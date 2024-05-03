Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;

        BigDecimal bd = new BigDecimal(s).setScale(5, RoundingMode.HALF_UP);
        double sRounded = bd.doubleValue();

        bd = new BigDecimal(l).setScale(5, RoundingMode.HALF_UP);
        double lRounded = bd.doubleValue();

        System.out.println(sRounded + " " + lRounded);
    }
}
```

This Java code does the same thing as your Python code. It reads a double value from the user, calculates the area and circumference of a circle, rounds these values to 5 decimal places, and then prints them out. The `BigDecimal` class is used for rounding the values to 5 decimal places.
