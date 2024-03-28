Below is the translated Java code that performs the same function as the Python code you've provided:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println((int) Math.ceil((double) n / (2 * d + 1)));
        scanner.close();
    }
}
```

This code snippet includes a `solve` method that reads two integers from the standard input, calculates the result as specified in the Python code, and prints it to the standard output. The `Math.ceil` function is used to perform the equivalent of Python's ceiling division `(-(-n // (2*d + 1)))`.

You can use the following as your test input:

```
6 2
```

When you run this Java code with the test input provided above, the expected output will be `2`, which matches the expected output of the original Python code.
