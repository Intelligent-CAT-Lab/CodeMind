Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        for (int c = b; c >= a; c--) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then it iterates from `b` to `a` (inclusive), and for each `c`, it checks if `h % (a + c) == 0`. If it is, it increments the `count`. Finally, it prints the `count`.
