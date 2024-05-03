Here is the Java version of your Python code:

```java
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < n - 2 / n; i++) {
            System.out.println(IntStream.range(0, n - 1)
                    .map(j -> (i - ~(j ^ (n % 2 < (j + 2 < n && i * 2 < n) ? 1 : 0))) % n + 1)
                    .mapToObj(String::valueOf)
                    .reduce((a, b) -> a + " " + b)
                    .orElse(""));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the console, then it uses a for loop to iterate from 0 to `n - 2 / n`. For each iteration, it uses a stream of integers from 0 to `n - 1`, applies a series of operations to each integer, and then joins the results into a single string. The `reduce` operation is used to concatenate the strings together with spaces in between. The result is printed to the console.
