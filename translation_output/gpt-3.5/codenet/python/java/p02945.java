```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = Math.max(a - b, Math.max(a + b, a * b));

        System.out.println(result);
    }
}
```
