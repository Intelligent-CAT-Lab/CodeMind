Here's the Python code translated to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        long ans = (long)x + (long)n * (long)b;

        System.out.println(ans % 1000000007);
    }
}
```

This Java code does the same steps as the Python code:
1. Reads three integers from the user input.
2. Calculates `d` as the difference between `a` and `b`.
3. Determines `n` as the result of `(x - b) / d`, ensuring it's at least `0`.
4. Calculates `ans` as `x + n * b`.
5. Prints `ans` modulo `1000000007`.

Please note that I've cast `x`, `n` and `b` to `long` in the calculation of `ans` to prevent any potential integer overflow. This is because in the original Python code, integers can grow arbitrarily large. In Java, however, the `int` type is limited to 32 bits, so when dealing with potentially large numbers, it's safer to use `long` which is a 64-bit type.
