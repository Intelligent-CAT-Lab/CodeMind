Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        int d = a - b;
        int n = (int) Math.max(0, (x - b) / (double) d);
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the difference between `a` and `b`, then calculates the number of times `d` fits into `x - b` (rounding down to the nearest whole number), then adds `b` to `x` times that number, and finally prints the result modulo 1000000007.
