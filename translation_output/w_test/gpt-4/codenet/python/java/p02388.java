Here's the equivalent Java code:

```java
import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input
        int x = scanner.nextInt();
        // Calculate x to the power of 3 and print the result
        System.out.println(x * x * x);
        // Close the scanner
        scanner.close();
    }
}
```

To run the code, compile it with `javac CubeCalculator.java` and run it with `java CubeCalculator`. When prompted, input `2`, and the output will be `8`, which is the expected output for the test case.
