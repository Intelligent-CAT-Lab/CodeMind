Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

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
            if (x_min <= x && x <= x_max && y_min <= y && y <= y_max) {
                return p % 3 + 1;
            }
            f = f1 + f2;
            if (p % 4 == 0) {
                x_max += f; // east
            } else if (p % 4 == 1) {
                y_max += f; // north
            } else if (p % 4 == 2) {
                x_min -= f; // west
            } else {
                y_min -= f; // south
            }
            f2 = f1;
            f1 = f;
            p = p + 1;
        }
    }
}
```

Here's a breakdown of the changes made:
1. The `def` keyword from Python is replaced with `public static int` in Java to declare the `search` method that returns an integer.
2. The inline assignment and reading input in Python `(x, y = map(int, input().split())` is replaced with separate statements to read the integers in Java.
3. The print function in Python `print(search(x, y))` is replaced with `System.out.println(search(x, y))` in Java.
4. Java requires explicit variable type declarations.
5. The `while (True)` infinite loop from Python is kept the same in Java, with the capitalization of `true` changed to fit Java's case sensitivity (`while (true)`).
6. The `Scanner` class and its methods `nextInt()` and `close()` are used in Java to handle user input from the console.
