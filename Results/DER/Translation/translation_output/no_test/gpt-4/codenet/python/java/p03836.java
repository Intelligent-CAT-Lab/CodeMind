Here's the equivalent Java code:

```java
import java.util.Scanner;

public class TranslatePythonToJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();

        int x = tx - sx;
        int y = ty - sy;

        StringBuilder order = new StringBuilder();
        order.append("L");

        for (int i = 0; i < y + 1; i++) {
            order.append("U");
        }
        for (int i = 0; i < x + 1; i++) {
            order.append("R");
        }
        order.append("D");

        order.append("R");
        for (int i = 0; i < y + 1; i++) {
            order.append("D");
        }
        for (int i = 0; i < x + 1; i++) {
            order.append("L");
        }
        order.append("U");

        for (int i = 0; i < y; i++) {
            order.append("U");
        }
        for (int i = 0; i < x; i++) {
            order.append("R");
        }
        for (int i = 0; i < y; i++) {
            order.append("D");
        }
        for (int i = 0; i < x; i++) {
            order.append("L");
        }

        System.out.println(order.toString());
        scanner.close();
    }
}
```

Make sure to put this code inside a class and compile it in a Java environment. The equivalent code first imports the `java.util.Scanner` class for reading input from the console, then declares variables and uses a `StringBuilder` to accumulate the series of moves. Java doesn't have the `*` operator for Strings as Python does, so a loop is used to append each character multiple times to the `StringBuilder`. Finally, the `StringBuilder` is converted to a `String` to be printed to the console.
