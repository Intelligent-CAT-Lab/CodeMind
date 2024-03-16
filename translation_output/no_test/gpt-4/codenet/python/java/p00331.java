Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read H and R
        int H = scanner.nextInt();
        int R = scanner.nextInt();
        
        // Perform the conditional checks and print the results
        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0) {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
        
        scanner.close();
    }
}
```

Please note that in Python, `input().split()` reads a line from standard input and splits the line into a list of strings based on whitespace. The `map()` function then converts each string into an `int`. Java's `Scanner` class provides a method `nextInt()` which directly reads and parses an integer value.

Also, in the Java version, I enclosed the code in a `main` method inside a `Main` class, since Java is class-based and requires an entry point for execution. This may not be necessary in Python, which is not strictly class-based and can run code that's outside any classes or functions.
