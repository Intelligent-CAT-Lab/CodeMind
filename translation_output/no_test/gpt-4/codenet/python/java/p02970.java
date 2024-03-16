Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println((n + (2 * d)) / (2 * d + 1));
        scanner.close();
    }
}
```

Please note the `(-(-n // (2 * d + 1)))` expression in Python performs ceiling division to make sure that the result is rounded up. In Java, to perform ceiling division and get the same behavior, you can add the divisor (minus 1) to the dividend before performing the division. In this case, I've added `(2 * d)` to `n` before dividing by `(2 * d + 1)` to achieve the ceiling effect.

Also note that in Java, you should close the `Scanner` object after you are done using it to avoid any potential resource leaks. This is typically not something you need to worry about in Python, which is why there isn't an equivalent statement in the original Python code.
