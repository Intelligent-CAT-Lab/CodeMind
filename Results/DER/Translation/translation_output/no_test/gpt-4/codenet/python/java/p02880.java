Here is the translated Java code that performs the same function as the Python code you provided:

```java
import java.util.Scanner;

public class MultiplicationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean found = false;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No");
        }

        scanner.close();
    }
}
```

Some key differences to note between Python and Java:

1. In Java, we use a `Scanner` object to read input from the user, as opposed to `input()` in Python.
2. Java variables need to be explicitly typed. We declare `N` as an `int` using the `int` keyword.
3. Java requires all code to exist within a class; I've named this example class `MultiplicationChecker`.
4. Java uses explicit braces `{}` for block structuring, rather than indentation.
5. The `System.out.println()` method is used for printing to the console in Java.
6. Instead of Python's `exit()`, Java uses a `break` statement inside a loop to exit it. If we were in a method, we could also use a `return` statement.
7. We should close the `Scanner` resource after we're done with it using `scanner.close()`.
