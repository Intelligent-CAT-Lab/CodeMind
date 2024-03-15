Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        
        while (Math.log(n) / Math.log(2) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int)(Math.log(n) / Math.log(2)));
        }
        
        System.out.println(x);
        scanner.close();
    }
}
```

Explanation:
- Import `Scanner` for input, similar to Python's `input()`.
- Use a main class and method which is the entry point for running the Java application.
- Create a `Scanner` object to read from standard input.
- Use `Math.log()` method to calculate the logarithm with base 2 by dividing `Math.log(n)` by `Math.log(2)`.
- Check if the result of `Math.log(n) / Math.log(2) % 1` is not equal to `0`.
- Use `Math.pow()` to calculate `2` raised to the power of the floored logarithm result.
- Print the output using `System.out.println()`.
- Close the `Scanner` to avoid resource leak.
