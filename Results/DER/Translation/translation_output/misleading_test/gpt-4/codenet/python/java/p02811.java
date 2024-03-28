Here's the equivalent Java code for the provided Python script along with a sample execution using the test input of `2 900`:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        
        System.out.println(500 * K >= X ? "Ye" : "No");
        scanner.close();
    }
}

// Sample test case
// Input: 2 900
// Expected Output: Ye
```

This Java code does the following:

1. It imports `Scanner` for input handling.
2. Defines the `Main` class with the `main` method as the entry point.
3. Creates a `Scanner` instance to read from standard input.
4. Reads two integers, `K` and `X`, which are space-separated in the input.
5. Checks whether `500 * K` is greater than or equal to `X`.
6. Prints `"Ye"` if the above condition is true, or `"No"` otherwise.
7. Finally, it closes the `Scanner` instance to avoid resource leaks.

Make sure to compile and run the Java code in an environment where you can provide the standard input, like a terminal or an IDE with console support.
