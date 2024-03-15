Here is the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((double)(N + 1) / N / 2);
        }

        scanner.close();
    }
}
```

Explanation:
1. We import `Scanner` for input just like `input()` is used in Python.
2. In Java, we need to explicitly specify the data type of our variables. Hence `int N` is used to declare N as an integer.
3. A `Scanner` object is created to read from input (the standard input stream).
4. The `nextInt` method is used to read an integer.
5. The condition `N % 2 == 0` is used just like in Python to check if N is even.
6. `System.out.println()` is the Java equivalent of Python's `print()` function.
7. For the else case, we make sure to cast the numerator to `double` to get a floating-point division equivalent to Python's behavior.
8. Finally, the scanner object is closed to prevent resource leaks, which is good practice in Java.
