Here is the Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.printf("%d %d %.5f", a / b, a % b, (double) a / b);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, performs integer division and modulo operations, and then prints the results. The `printf` method is used to print the results with 5 decimal places. The `(double) a / b` is used to ensure that the division is performed as floating-point division, not integer division.
