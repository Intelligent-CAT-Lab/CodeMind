Here's the equivalent Java code for the provided Python program:

```java
import java.util.Scanner;

public class ClosestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Math.abs(x - a) < Math.abs(x - b) ? 'A' : 'B');
    }
}
```

When you run this Java code, it will read three integers from the input, compare their differences with the variable `x`, and print either 'A' or 'B' depending on which value (`a` or `b`) is closer to `x`. Remember that it assumes the input is provided in the same way as the test case, formatted as "x a b", without additional prompts or explanations.
