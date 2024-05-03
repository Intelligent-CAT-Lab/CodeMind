Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        double result1 = 0.5 * a * b * Math.sin(Math.toRadians(c));
        double result2 = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c)));
        double result3 = b * Math.sin(Math.toRadians(c));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(Math.tan(Math.toRadians(c)));
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the three results, and prints them out. The `Math.toRadians` method is used to convert degrees to radians, and `Math.sin` and `Math.cos` are used to calculate the sine and cosine of an angle in radians. The `Math.sqrt` method is used to calculate the square root of a number. The `Math.tan` method is used to calculate the tangent of an angle in radians.
