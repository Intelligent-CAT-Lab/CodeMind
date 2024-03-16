Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class CanBuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        System.out.println(500 * K >= X ? "Yes" : "No");
        scanner.close();
    }
}
```

To run a test case equivalent to the provided Python test input `2 900`, run the Java program and enter the values `2 900` as input when prompted. It should output `Yes` as expected.
