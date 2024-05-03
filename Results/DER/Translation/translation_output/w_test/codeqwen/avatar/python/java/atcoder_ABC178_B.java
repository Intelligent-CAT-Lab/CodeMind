Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long ans = Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d)));
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads four long integers from the standard input, calculates the maximum of the products of the four numbers, and prints the result. The `Math.max` function is used to find the maximum of two numbers, and it can be used to find the maximum of four numbers by calling it four times in a row.
