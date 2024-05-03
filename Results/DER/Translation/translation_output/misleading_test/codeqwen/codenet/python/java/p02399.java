Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.printf("%d %d %.8f", a / b, a % b, (double) a / b);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, performs integer division and modulo operations, and then prints the results. The `printf` method is used to print the results with a precision of 8 decimal places. The `(double) a / b` is used to ensure that the division is performed as a floating-point division, not integer division.
