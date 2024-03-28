```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println((int) Math.ceil((double) n / (2 * d + 1)));
    }
}
```
