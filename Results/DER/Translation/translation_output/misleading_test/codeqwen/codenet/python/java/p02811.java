Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        if (500 * K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the result of 500*K and compares it to X, and prints "Yes" if the result is greater than or equal to X, and "No" otherwise.
