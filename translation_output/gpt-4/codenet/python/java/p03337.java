Here's the translated version of the Python code you provided into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int maxVal = Math.max(Math.max(a + b, a - b), a * b);
        System.out.println(maxVal);
    }
}
```

This Java code does the following:
- Import `Scanner` for reading from standard input.
- Inside the `main` method, create a `Scanner` to read two integers, separated by space, from the standard input.
- Reads two integers and assigns them to `a` and `b`.
- Closes the `Scanner` because it's no longer needed after reading the inputs.
- Calculates the maximum of `a + b`, `a - b`, and `a * b` using two `Math.max` calls.
- Prints out the result.
