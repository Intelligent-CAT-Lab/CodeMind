Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        System.out.printf("%.5f %.5f", s, l);
    }
}
```

This Java code does the same thing as your Python code. It reads a double value from the user, calculates the area and circumference of a circle, and then prints these values to the console with 5 decimal places.
