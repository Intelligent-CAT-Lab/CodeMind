```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x = a;
        int h = 0;
        int s = 0;

        while (x > 0) {
            x -= 1;
            h += 1;
            s += 1;
        }

        while (s / b != 0) {
            h += 1;
            s = s - b + 1;
        }

        System.out.println(h);
    }
}
```
