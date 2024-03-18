Certainly! Here's the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a + b) / 2);
        scanner.close();
    }
}
```

This Java code will have the same functionality as the Python code you provided. It reads two integers from the standard input, calculates the average, and prints the result to the standard output. The integer division will yield the same result as the `//` operator in Python, which is used for floor division.
