Certainly! Here is the equivalent Java program for the Python code you provided:

```java
import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble(); // User input for radius

        double s = r * r * Math.PI; // Area of the circle
        double l = r * 2 * Math.PI; // Circumference of the circle

        System.out.printf("%.5f %.5f%n", s, l); // Formatted output
    }
}
```

This Java code does the same calculations as the Python code you provided. It calculates the area and circumference of a circle given its radius input by the user, and then prints the two values formatted to five decimal places.
