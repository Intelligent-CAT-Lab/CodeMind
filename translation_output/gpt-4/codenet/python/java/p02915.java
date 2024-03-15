Here is the equivalent Java code which achieves the same functionality as the provided Python code. Note that in Java, we need to import `java.io.*` for input/output operations, and exception handling is required for `IOException` when dealing with the standard input stream.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CubeNumbers {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int n = Integer.parseInt(line.split("\\s+")[0]);
                System.out.println((long) n * n * n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

A few important differences and points to consider between the Python and Java code:

1. Java requires explicit imports for classes from `java.io` package.
2. Java uses `BufferedReader` for buffered reading from the input stream.
3. We use a `try-with-resources` statement to automatically close the `BufferedReader` after we are done.
4. Exception handling is done using a `try-catch` block.
5. We must explicitly parse the `String` object to an `int`.
6. To prevent integer overflow when cubing, we can use a `long` type for the result of `n * n * n`.
7. We print the result using `System.out.println`.

Note that there is no direct equivalent of `sys.stdin` in Java, so `BufferedReader` is a common way to read input from the console.
