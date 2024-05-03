Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((int)((n + 1) * n / 2));
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calculates the sum of all integers from 1 to n (inclusive), and prints the result. The `(int)` cast is used to ensure that the result is an integer, even if the calculation produces a floating-point number.
