Here's the equivalent Java code for the Python snippet you provided:

```java
import java.util.Scanner;

public class MultiplyInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Multiply and print the result
        System.out.println(a * b);

        scanner.close();
    }
}
```

Explanation:
- We import `Scanner` from `java.util` to read user input.
- We create a `MultiplyInput` class with a main method since Java executes code within a class.
- Inside the `main` method, we create a `Scanner` object to read from the standard input (keyboard).
- We read two integers using the `nextInt()` method of the `Scanner` class.
- We multiply the two integers and print the result using `System.out.println()`.
- We close the `Scanner` to prevent resource leaks.
