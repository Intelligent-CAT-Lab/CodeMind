```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        long ans = Long.MIN_VALUE;
        ans = Math.max(ans, (long) a * c, (long) a * d, (long) b * c, (long) b * d);
        System.out.println(ans);
    }
}
```
