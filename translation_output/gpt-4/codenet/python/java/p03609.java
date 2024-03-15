Certainly! Here's how you could translate that Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner scanner = new Scanner(System.in);

        // Read the two integers, x and t
        int x = scanner.nextInt();
        int t = scanner.nextInt();

        // Calculate and print the result
        System.out.println(Math.max(x - t, 0));
    }
}
```

This Java code does the same as the Python code: it takes two integers as input, subtracts the second one from the first, and prints the result if it's greater than 0, or 0 otherwise. Java's `Math.max` is used to ensure the result is not negative by comparing the subtraction result with 0 and choosing the greater one.
