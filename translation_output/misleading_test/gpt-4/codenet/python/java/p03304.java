Here's the translated Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        double d = scanner.nextDouble();
        scanner.close();

        double result;
        if (d > 0) {
            result = 2 * (n - d) * (m - 1) / (n * n);
        } else {
            result = (m - 1) / n;
        }

        System.out.println(result);
    }
}
```

When providing an input of `2 3 1`, the expected output is `-95.59809439141243`. However, the Python code you've given doesn't produce a negative result as it performs a simple arithmetic operation that yields a positive result. Moreover, the Python code does not appear to match the output mentioned.

Assuming there's a typo in the expected output, with the correct Python code, the Java translation above would work appropriately for inputs with the same logic as in the Python code. If the expected output is indeed `-95.59809439141243` with an input of `2 3 1`, there might be some missing context or a mistake in the output statement.

For accurate assistance, please provide the correct expected output or clarify the intent of the provided Python code.
