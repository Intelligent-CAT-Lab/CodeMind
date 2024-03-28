Below is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");

        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        int abs_x = Math.abs(x);
        int abs_y = Math.abs(y);

        if (0 <= x && x < y) {
            System.out.println(y - x);
            System.exit(0);
        }
        if (0 < y && y < x) {
            System.out.println(x - y + 2);
            System.exit(0);
        }
        if (y == 0 && 0 < x) {
            System.out.println(x + 1);
            System.exit(0);
        }

        if (x < y && y <= 0) {
            System.out.println(y - x);
            System.exit(0);
        }
        if (y < x && x < 0) {
            System.out.println(x - y + 2);
            System.exit(0);
        }
        if (x == 0 && y < 0) {
            System.out.println(abs_y + 1);
        }

        if (x < 0 && 0 < y) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
            System.exit(0);
        }
        if (y < 0 && 0 < x) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
            System.exit(0);
        }

        scanner.close();
    }
}
```

In this Java code:
1. We import `java.util.Scanner` for console input similar to Python's `input()` function.
2. Instead of the Python tuple assignment, we use `String` array and parse integers from the input string.
3. Math.abs() is used for the absolute value, similar to abs() in Python.
4. System.out.println() is the Java equivalent for Python's print.
5. System.exit(0) is used to terminate the program similar to exit() in Python, where `0` indicates a normal termination.
