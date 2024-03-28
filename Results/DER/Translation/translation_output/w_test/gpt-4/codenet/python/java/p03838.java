Below is the translation of the given Python code into Java:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int abs_x = Math.abs(x);
        int abs_y = Math.abs(y);
        
        if (0 <= x && x < y) {
            System.out.println(y - x);
            System.exit(0);
        }
        if (0 < y && y < x) {
            System.out.println(x - y + 2);
            System.exit(0);
        }
        if (y == 0 && 0 < x) {
            System.out.println(x + 1);
            System.exit(0);
        }

        if (x < y && y <= 0) {
            System.out.println(y - x);
            System.exit(0);
        }
        if (y < x && x < 0) {
            System.out.println(x - y + 2);
            System.exit(0);
        }
        if (x == 0 && y < 0) {
            System.out.println(abs_y + 1);
        }

        if (x < 0 && 0 < y) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
            System.exit(0);
        }
        if (y < 0 && 0 < x) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
            System.exit(0);
        }
        
        scanner.close();
    }
}
```

When running this Java program with the input "10 20", it will produce the expected output "10".
