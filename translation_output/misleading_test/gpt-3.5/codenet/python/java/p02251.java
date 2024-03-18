```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        int[] coins = {25, 10, 5, 1};

        for (int x : coins) {
            ans += n / x;
            n %= x;
        }

        System.out.println(ans);
    }
}
```
