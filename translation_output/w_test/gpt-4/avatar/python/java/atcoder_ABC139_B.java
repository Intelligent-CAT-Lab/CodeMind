Here is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int h = sc.nextInt();
        sc.close();

        int result = (h - 2) / (t - 1) + 1;
        System.out.println(result);
    }
}
```

Keep in mind the following:

1. In Java, we typically use `Scanner` class from `java.util` package to read input from the user.
2. You read the integers `t` and `h` using `nextInt()` method of an instance of `Scanner`.
3. Java performs integer division similarly to Python's `//` operator when both operands are integers, so `(h - 2) / (t - 1)` is the equivalent operation.
4. The `Scanner` should be closed after it's no longer needed to free up the resources.
5. Java requires a class definition and a `main` method as an entry point for the program execution.

The Java code provided will read two integers from the user input (assumed to be separated by a space), compute the given formula, and print out the resulting integer, just like the Python code does.
