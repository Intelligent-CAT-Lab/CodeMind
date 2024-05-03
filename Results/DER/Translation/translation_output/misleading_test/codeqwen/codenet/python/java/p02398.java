Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then iterates over the range from `a` to `b` (inclusive), checking if `c` is divisible by each number in this range. If it is, it increments `ans` by 1. Finally, it prints out the value of `ans`.
