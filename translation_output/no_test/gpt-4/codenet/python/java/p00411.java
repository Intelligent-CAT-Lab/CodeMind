Here's the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input and split into variables
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();

        // Compute the answer
        double ans = (double) r * t / a;

        // Print the result formatted to 6 decimal places
        System.out.printf("%.6f", ans);

        // Close the scanner
        scanner.close();
    }
}
```

This Java code performs the same operations as the Python code: it takes the input, splits it into three integers, performs the calculation, and then prints out the result formatted to six decimal places. Remember that in Java, we need to explicitly cast at least one of the integer operands to a `double` before the division to get a floating-point result, which is why I cast `r` to `double` in the calculation.
