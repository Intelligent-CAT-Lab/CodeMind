```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();

        double ans = (double)(r * t) / a;
        System.out.printf("%.12f\n", ans);
    }
}
```
