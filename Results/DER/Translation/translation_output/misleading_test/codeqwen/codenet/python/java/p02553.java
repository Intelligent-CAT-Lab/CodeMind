Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long ans = -1000000000000000000L;
        ans = Math.max(ans, (long) a * c, (long) a * d, (long) b * c, (long) b * d);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, calculates the maximum product of any two numbers from the input, and prints the result. The `Math.max` function is used to find the maximum value, and the `(long)` cast is used to ensure that the product is calculated as a long integer, which can handle larger values.
