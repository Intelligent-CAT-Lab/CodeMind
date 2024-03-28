```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx, sy, tx, ty;
        sx = scanner.nextInt();
        sy = scanner.nextInt();
        tx = scanner.nextInt();
        ty = scanner.nextInt();

        int x = tx - sx;
        int y = ty - sy;

        StringBuilder order = new StringBuilder("L");

        order.append("U".repeat(y+1));
        order.append("R".repeat(x+1));
        order.append("D");

        order.append("R");
        order.append("D".repeat(y+1));
        order.append("L".repeat(x+1));
        order.append("U");

        order.append("U".repeat(y));
        order.append("R".repeat(x));
        order.append("D".repeat(y));
        order.append("L".repeat(x));

        System.out.println(order);
    }
}
```
