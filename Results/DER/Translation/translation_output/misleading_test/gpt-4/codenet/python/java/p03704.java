To translate the provided Python code into Java, you need to perform a few key changes because Java is statically typed and more verbose than Python. Note that the recursive function and loop constructs will need to be adapted to Java's syntax and that input and output handling will be done differently (e.g., using a `Scanner` for input and `System.out.println` for output).

Below is the Java equivalent of the Python code. Since Java methods must reside within a class, I have created one called `Main` to enclose the logic.

```java
import java.util.Scanner;

public class Main {

    static int f(int d, int x, int y) {
        int n = Integer.parseInt("9".repeat(x) + "0".repeat(y));
        if (x < 1) return d == 0 ? 1 : 0;
        int sum = 0;
        for (int i = -9; i <= 9; i++) {
            if (Math.abs(d + i * n) < n) {
                sum += f(d + i * n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1 ? 1 : 0));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int totalSum = 0;
        for (int i = 1; i <= 20; i++) {
            totalSum += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(totalSum);
        scanner.close();
    }
}
```

Please note the following changes and considerations:

1. The Java `repeat` method is used to replicate strings, similar to the Python code, which concatenates repeated character strings. If you are running this code in a version of Java prior to Java 11, you'll need to replace the string repeat method with an alternative approach for creating repeated characters.

2. The ternary operator `condition ? trueValue : falseValue` is used to match the inline `if` conditions of Python.

3. In Java, the `sum` variable explicitly accumulates the sum of the recursive function's results, instead of the implicit summing done in Python's list comprehension.

4. The `for` loop includes both the starting value and the stopping value, as Java's loop structure is `for (initialization; termination; increment)`.

This code should produce the same output as the Python code for the given input, with the results printed to the console.
