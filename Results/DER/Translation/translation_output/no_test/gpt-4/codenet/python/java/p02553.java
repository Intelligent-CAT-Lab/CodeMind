Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Compute the maximum product
        long ans = Long.MIN_VALUE;  // Equivalent to -1000000000000000000L
        ans = Math.max(ans, (long) a * c);
        ans = Math.max(ans, (long) a * d);
        ans = Math.max(ans, (long) b * c);
        ans = Math.max(ans, (long) b * d);

        // Print the result
        System.out.println(ans);

        // Close the scanner
        scanner.close();
    }
}
```

Please note the following differences between Python and Java:

1. Java requires explicit type declaration, so variable types must be specified (e.g., `int` and `long`).
2. In Java, there is no direct equivalent to Python's multiple assignment and `map` function for reading space-separated inputs. Instead, we use a `Scanner` to read each integer separately.
3. Java does not have a global `max` function that accepts multiple arguments like Python does. Instead, you use `Math.max` repeatedly to get the maximum of two values at a time.
4. I've used `Long.MIN_VALUE` to represent the large negative number, as Java does not support literal numbers of arbitrary length.
5. In Java, it’s good practice to close the `Scanner`.

Now you can compile and run the Java program to achieve the same functionality as the given Python code.
