Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();

        int result = x - t;
        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, subtracts the second integer from the first, and prints the result if it is greater than zero. If the result is not greater than zero, it prints 0.
