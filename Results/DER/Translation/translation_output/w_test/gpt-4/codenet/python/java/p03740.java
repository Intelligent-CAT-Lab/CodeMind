Here is the translated Java code that performs the same logic as the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(Math.abs(x - y) <= 1 ? "Brown" : "Alice");

        scanner.close();
    }
}
```

This program reads two numbers from standard input in Java, compares their difference, and then prints "Brown" if their absolute difference is less than or equal to 1. Otherwise, it prints "Alice". This is equivalent to the given Python code.
