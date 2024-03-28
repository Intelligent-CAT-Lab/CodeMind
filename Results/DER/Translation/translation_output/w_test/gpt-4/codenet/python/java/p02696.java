Here's the translated code in Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println((int) ((long) A * Math.min(B - 1, N) / B));
        scanner.close();
    }
}
```

You would run this Java program and input `5 7 4` to get the expected output of `2`.

Note: Java uses integer division for `int` types, truncating towards zero, which is similar to floor division for positive numbers. The cast to `long` in the expression is to avoid any potential integer overflow when multiplying `A` by `Math.min(B - 1, N)` before dividing by `B`.
