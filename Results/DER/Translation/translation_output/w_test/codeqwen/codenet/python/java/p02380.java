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

        System.out.printf("%.8f\n", result1);
        System.out.printf("%.8f\n", result2);
        System.out.printf("%.8f\n", result3);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the three results, and prints them out with 8 decimal places. The `Math.toRadians` method is used to convert degrees to radians, and `Math.sqrt` is used to calculate the square root. The `printf` method is used to print the results with 8 decimal places.
