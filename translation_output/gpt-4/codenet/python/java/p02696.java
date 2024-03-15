Below you will find the Java translation of the provided Python code. The Java code reads inputs from the console, then it performs the calculations according to the logic of the given Python script.

```java
import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read integers A, B, N from the input
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.close();

        // Perform the calculation and print the result
        System.out.println((int) ((long) A * Math.min(B - 1, N) / B));
    }
}
```

In Java, explicit type casting is necessary because the result of the arithmetic operation is not automatically floored, as it is implied in Python by using the `floor` function. Also, the operands on the right-hand side of the assignments get automatically promoted to the larger data type if necessary. Since `B` could be potentially large, an intermediate cast to a long is added for safety to prevent integer overflow before performing the division and final cast to an `int`.
