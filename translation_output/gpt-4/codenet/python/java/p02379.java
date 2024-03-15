Here is the equivalent Java code for the given Python code. It reads four float values as input, calculates the distance between two points (x1, y1) and (x2, y2), and prints out the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.printf("%.6f", distance);
        scanner.close();
    }
}
```

Ensure that when running this Java code, the input values must be separated by a space or a line break as the `Scanner.nextDouble()` function will parse the next available double from the input. The `printf` function is used to format the output to six decimal places, which is the Java equivalent of the Python `{:f}` format specification.
