Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(search(x, y));
    }

    public static int search(int x, int y) {
        int x_min = 0;
        int y_min = 0;
        int x_max = 0;
        int y_max = 0;
        int f = 0;
        int f1 = 1;
        int f2 = 0;
        int p = 0;
        while (true) {
            if (x_min <= x && x <= x_max && y_min <= y && y <= y_max)
                return p % 3 + 1;
            f = f1 + f2;
            if (p % 4 == 0)
                x_max += f; // east
            else if (p % 4 == 1)
                y_max += f; // north
            else if (p % 4 == 2)
                x_min -= f; // west
            else
                y_min -= f; // south
            f2 = f1;
            f1 = f;
            p = p + 1;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calls the `search` method with these integers, and prints the result. The `search` method is the same as yours, but it uses `int` instead of `long` for the variables.
