Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(0.5 * a * b * Math.sin(Math.toRadians(c)));
        System.out.println(a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c))));
        System.out.println(b * Math.sin(Math.toRadians(c)));
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the three expressions, and prints the results. The `Math.toRadians` method is used to convert degrees to radians, and `Math.sqrt` is used to calculate the square root.
