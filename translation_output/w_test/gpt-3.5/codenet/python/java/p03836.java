```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        
        int x = tx - sx;
        int y = ty - sy;

        StringBuilder order = new StringBuilder("L");

        order.append("U".repeat(Math.max(0, y + 1)));
        order.append("R".repeat(Math.max(0, x + 1)));
        order.append("D");

        order.append("R");
        order.append("D".repeat(Math.max(0, y + 1)));
        order.append("L".repeat(Math.max(0, x + 1)));
        order.append("U");

        order.append("U".repeat(Math.max(0, y)));
        order.append("R".repeat(Math.max(0, x)));
        order.append("D".repeat(Math.max(0, y)));
        order.append("L".repeat(Math.max(0, x));

        System.out.println(order.toString());
    }
}
```
