Here is the Java version of your Python code:

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
            System.out.println(a - k + " " + b);
            return;
        }
        System.out.println(0 + " " + Math.max(b - k, 0));
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, and then performs the same operations as your Python code. The `Math.max` function is used to replace the `max` function in Python. The `return` statement is used to exit the `main` method in Java, which is equivalent to `exit()` in Python.
