Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = b;
        if (n * a > b) {
            ans = n * a;
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the product of `n` and `a`, and then checks if this product is greater than `b`. If it is, it assigns `n * a` to `ans`; otherwise, it assigns `b` to `ans`. Finally, it prints the value of `ans`.
