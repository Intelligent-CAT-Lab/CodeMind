```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(0.5 * a * b * Math.sin(Math.toRadians(c)));
        System.out.println(a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(c))));
        System.out.println(b * Math.sin(Math.toRadians(c)));
    }
}
```
