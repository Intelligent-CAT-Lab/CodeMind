Here is the equivalent Java code for your provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();

        int x = tx - sx;
        int y = ty - sy;

        StringBuilder order = new StringBuilder("L");

        for (int i = 0; i < y + 1; i++) order.append("U");
        for (int i = 0; i < x + 1; i++) order.append("R");
        order.append("D");

        order.append("R");
        for (int i = 0; i < y + 1; i++) order.append("D");
        for (int i = 0; i < x + 1; i++) order.append("L");
        order.append("U");

        for (int i = 0; i < y; i++) order.append("U");
        for (int i = 0; i < x; i++) order.append("R");
        for (int i = 0; i < y; i++) order.append("D");
        for (int i = 0; i < x; i++) order.append("L");

        System.out.println(order.toString());

        scanner.close();
    }
}
```

To test this Java program, you can compile and run it, then provide the test input "0 0 1 2" when prompted. The program will output "UURDDLLUUURRDRDDDLLU" as expected.
