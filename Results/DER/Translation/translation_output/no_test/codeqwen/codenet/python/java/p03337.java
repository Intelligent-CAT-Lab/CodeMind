Here is the Java version of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result = Math.max(a + b, Math.max(a - b, a * b));
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, adds them together, subtracts them, and multiplies them. It then uses the `Math.max` function to find the maximum of these three values and prints it out.
