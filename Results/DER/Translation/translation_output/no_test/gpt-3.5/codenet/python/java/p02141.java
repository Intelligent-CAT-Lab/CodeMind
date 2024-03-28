```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        float a = (Math.min(W/2 , x + w/2) + Math.max(-W/2, x-w/2));
        float b = (Math.min(H/2 , y + h/2) + Math.max(-H/2, y-h/2));
        System.out.println(b/a);
    }
}
```
