```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double radiansC = Math.toRadians(c);

        double result1 = 0.5 * a * b * Math.sin(radiansC);
        double result2 = a + b + Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(radiansC)), 0.5);
        double result3 = b * Math.sin(radiansC);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
```
