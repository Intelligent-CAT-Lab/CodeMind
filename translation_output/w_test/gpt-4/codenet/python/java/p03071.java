Here is the translation of the Python code into Java:

```java
import java.util.Scanner;

public class MaxValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calculating values
        int maxVal = Math.max(A + B, Math.max(2 * A - 1, 2 * B - 1));

        // Printing the maximum value
        System.out.println(maxVal);

        scanner.close();
    }
}
```

If you run the Java code with the sample test input `5 3`, the expected output would be `9`, which is the maximum value among `A+B`, `2*A-1`, and `2*B-1`.
