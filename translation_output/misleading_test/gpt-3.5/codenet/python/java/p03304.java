```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        if (d > 0) {
            double result = 2 * (n - d) * (m - 1) / Math.pow(n, 2);
            System.out.println(result);
        } else {
            double result = (m - 1) / (double) n;
            System.out.println(result);
        }
    }
}
```
