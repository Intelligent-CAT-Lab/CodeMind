Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then iterates over the range from `L` to `R` (inclusive), and for each number `i`, it checks if `i` is divisible by `d`. If it is, it increments `ans` by 1. Finally, it prints out the value of `ans`.
