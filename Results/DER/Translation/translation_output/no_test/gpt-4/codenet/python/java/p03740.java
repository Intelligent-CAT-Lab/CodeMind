Sure, here is the given Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integers separated by a space
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Checking the condition and printing the result
        if (Math.abs(x - y) <= 1) {
            System.out.println("Brown");
        } else {
            System.out.println("Alice");
        }

        scanner.close();
    }
}
```
This code assumes that the two integers `x` and `y` are given in one line, separated by a space, just like in the original Python code. We use `Scanner.nextInt()` to read them in Java. We also close the `Scanner` object at the end since it's good practice to release system resources when they're no longer needed.
