Here's how you can translate the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int rot = n / k;
        int x = n;

        if (k == 1 || n == k || n % k == 0) {
            x = 0;
        } else if (rot >= 1) {
            x = n - k * rot;
        }

        int t = x % k;

        System.out.println(Math.min(t, Math.abs(t - k)));

        scanner.close();
    }
}
```

A quick explanation of the changes:
- Java requires type declarations, so variables `n`, `k`, `rot`, `x`, and `t` are explicitly declared as `int`.
- In Java, input is typically read using the `Scanner` class instead of Python's `input()` function. 
- In Java, `System.out.println()` is used to print to the console instead of Python's `print` function.
- `Math.min()` and `Math.abs()` methods are used from Java's Math utility class to get the minimum and absolute values respectively.
