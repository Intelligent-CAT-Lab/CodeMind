Here's the equivalent Java code to perform the same actions:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println((a - k) + " " + b);
            System.exit(0);
        }
        System.out.println("0 " + Math.max(b - k, 0));
    }
}
```

This Java code snippet does what the Python code does: it reads three integers `a`, `b`, and `k` from the user input, then uses conditional logic to subtract `k` from `a`. If `a` is less than or equal to `k`, `a` is set to zero and `k` is adjusted. In case `a` is greater than `k`, the code prints the new values of `a` and `b` and exits. It then prints the final values of `a` (which would be 0) and the adjusted value of `b`. Note that `System.exit(0)` is used in Java to terminate the program.
