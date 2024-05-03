Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(-(-N/2.0)/N);
    }
}
```

In Java, the `//` operator performs integer division, which means it will discard the decimal part of the division. To get the same result as in Python, we need to use the `/` operator which performs floating-point division.

Also, note that in Java, the `-` operator has higher precedence than the `/` operator, so we need to use parentheses to ensure that the division is performed before the negation.
