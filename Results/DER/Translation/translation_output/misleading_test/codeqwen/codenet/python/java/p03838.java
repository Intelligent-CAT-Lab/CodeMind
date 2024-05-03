Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int abs_x = Math.abs(x);
        int abs_y = Math.abs(y);

        if (0 <= x && x < y) {
            System.out.println(y - x);
            return;
        }
        if (0 < y && y < x) {
            System.out.println(x - y + 2);
            return;
        }
        if (y == 0 && 0 < x) {
            System.out.println(x + 1);
            return;
        }

        if (x < y && y <= 0) {
            System.out.println(y - x);
            return;
        }
        if (y < x && x < 0) {
            System.out.println(x - y + 2);
            return;
        }
        if (x == 0 && y < 0) {
            System.out.println(abs_y + 1);
            return;
        }

        if (x < 0 && y < 0) {
            System.out.println(abs(abs_y - abs_x) + 1);
            return;
        }
        if (y < 0 && x < 0) {
            System.out.println(abs(abs_y - abs_x) + 1);
            return;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates their absolute values, and then checks the conditions you specified. If a condition is met, it prints the result and exits the program. If no condition is met, it does nothing and continues to the next condition.
