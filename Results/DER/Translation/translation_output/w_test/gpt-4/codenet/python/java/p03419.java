Below you'll find the Python code translated into Java. To receive the input, I will use a `Scanner` class and for output, simple `System.out.println` statements are used. The logic is kept the same as in your Python code.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        if (n == 1 || m == 1) {
            System.out.println((n * m == 1) ? 1 : Math.max(n, m) - 2);
        } else {
            System.out.println((long) (n - 2) * (m - 2));
        }

        scanner.close();
    }
}
```

Here are some key points from the translation:

1. The `Scanner` class is used for input in Java, which requires `import java.util.Scanner;` at the beginning.
2. Java variables must have a declared type, so we use `int` for `n` and `m`.
3. Java does not have a `max` function in the same way Python does; instead, `Math.max` is used.
4. Java uses `System.out.println` for output instead of `print`.
5. Type casting to `long` is used in the `else` block to prevent integer overflow if the result exceeds the `int` type's limit.

To run the above Java code, you will need to have a Java development environment set up, compile the code with `javac`, and then run it using the `java` command. If you provide the same test input "2 2", the expected output will be "0", consistent with your Python code example.
