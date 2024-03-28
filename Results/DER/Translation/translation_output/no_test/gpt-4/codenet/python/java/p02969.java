Here is the equivalent Java code for the Python snippet you've provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println(3 * (r * r));
        scanner.close();
    }
}
```

This Java code does the following:
1. It imports the `Scanner` class, which is used for obtaining input from the user.
2. It defines a `Main` class and the `main` method, which is the entry point for a Java application.
3. It creates a `Scanner` object to read input from the standard input stream (usually, the keyboard).
4. It reads an integer value to the variable `r`.
5. It calculates `3 * (r * r)` and prints the result to the standard output (usually, the terminal).
6. Finally, it closes the `Scanner` object to prevent a resource leak.
