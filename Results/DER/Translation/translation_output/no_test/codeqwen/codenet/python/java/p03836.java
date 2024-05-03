Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int sx = Integer.parseInt(inputs[0]);
        int sy = Integer.parseInt(inputs[1]);
        int tx = Integer.parseInt(inputs[2]);
        int ty = Integer.parseInt(inputs[3]);

        int x = tx - sx;
        int y = ty - sy;

        StringBuilder order = new StringBuilder();

        for (int i = 0; i <= y; i++) {
            order.append("U");
        }
        for (int i = 0; i <= x; i++) {
            order.append("R");
        }
        for (int i = 0; i <= y; i++) {
            order.append("D");
        }
        for (int i = 0; i <= x; i++) {
            order.append("L");
        }

        order.append("U");
        order.append("R");
        order.append("D");
        order.append("L");

        for (int i = 0; i <= y; i++) {
            order.append("U");
        }
        for (int i = 0; i <= x; i++) {
            order.append("R");
        }
        for (int i = 0; i <= y; i++) {
            order.append("D");
        }
        for (int i = 0; i <= x; i++) {
            order.append("L");
        }

        System.out.println(order.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, calculates the differences between the target and source coordinates, and then constructs a string representing the sequence of moves required to reach the target from the source. The `StringBuilder` class is used to efficiently build the string.
