```java
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final long MOD = (long) Math.pow(10, 9) + 7;

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * k) % MOD;
        }

        System.out.println(result);
    }
}
```
