Here's the translated Java code:

```java
import java.util.Scanner;

public class ReflectionPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int a = x2 - x1;
        int b = y2 - y1;

        System.out.println((x2 - b) + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
    }
}
```

To run this code, you would need to compile it first and then execute the Java program. When running the program, you can provide the test input `2 3 6 6` and it should output `3 10 -1 7`.
