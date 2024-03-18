```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int ans = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        System.out.println(ans);
    }
}
```
