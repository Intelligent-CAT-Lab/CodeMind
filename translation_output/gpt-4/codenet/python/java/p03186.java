Sure, here's how the given Python code could be translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read three integers from the input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (c <= a + b + 1) {
            System.out.println(b + c);
        } else {
            System.out.println(a + 2 * b + 1);
        }
        
        scanner.close();
    }
}
```

This Java code snippet does the same thing as the Python code: It reads three integers as input, then applies the logic defined in the if-else block and prints the result to the console. The `Scanner` class is used for reading input in Java. Remember to import the `java.util.Scanner` package at the beginning. The `scanner.close();` statement is there to properly close the `Scanner` after its use to prevent resource leaks.
