```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int ans = 0;
        int q, r;
        q = x / 11;
        ans += 2 * q;
        r = x % 11;
        q = r / 6;
        ans += q;
        r = r % 6;
        if (r > 0) {
            ans += 1;
        }

        System.out.println(ans);
    }
}
```
