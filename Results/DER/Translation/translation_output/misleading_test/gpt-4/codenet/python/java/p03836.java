Here's the Java translation enclosed within ```java```:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();
        scanner.close();
        
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
    }
}
```

Make sure that you import `java.util.Scanner` and have the `Main` class and `main` method appropriately defined. This Java program takes the input in the same format as the Python program, performs the operations, and prints the output as expected.
