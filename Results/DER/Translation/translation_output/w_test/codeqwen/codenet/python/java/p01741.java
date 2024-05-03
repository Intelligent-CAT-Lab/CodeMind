Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = n * Math.sqrt(2);
        if (result < n) {
            result = n;
        }
        System.out.printf("%.9f", result);
    }
}
```

This Java code does the same thing as your Python code. It reads a double value from the user, calculates the square root of the number multiplied by 2, and then checks if the result is less than the original number. If it is, it uses the original number, otherwise it uses the result. The result is then printed with 9 decimal places.
