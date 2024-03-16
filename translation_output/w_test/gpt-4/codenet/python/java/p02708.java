```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long ans = 0;
        int mod = (int)1e9 + 7;
        for (int i = k; i <= n + 1; i++) {
            long maxSum = (long)(2 * n - i + 1) * i / 2;
            long minSum = (long)i * (i - 1) / 2;
            ans = (ans + maxSum - minSum + 1) % mod;
        }
        System.out.println(ans);
    }
}
```
