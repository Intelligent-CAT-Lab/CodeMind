```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = x / 11;
        x = x - 11 * n;

        if (x == 0) {
            System.out.println(2 * n);
        } else if (x >= 1 && x <= 6) {
            System.out.println(1 + 2 * n);
        } else {
            System.out.println(2 + 2 * n);
        }
    }
}
```
