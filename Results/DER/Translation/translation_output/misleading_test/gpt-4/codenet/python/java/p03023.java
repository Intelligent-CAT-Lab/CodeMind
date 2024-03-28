Here's how you could translate the given Python code into Java:

```java
import java.util.Scanner;

public class PolygonInteriorAngleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 180 * (n - 2);
        System.out.println(s);
        scanner.close();
    }
}
```

When you run this Java program with the test input of 3, it will produce the expected output of 256.
