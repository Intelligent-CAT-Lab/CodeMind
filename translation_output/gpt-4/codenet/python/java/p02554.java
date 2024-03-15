Here's the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ant = 1, bnt = 1, cnt = 1;
        final long mod = 1000000007;

        for (int i = 0; i < n; i++) {
            ant = 10 * ant % mod;
            bnt = 9 * bnt % mod;
            cnt = 8 * cnt % mod;
        }

        long ans = (ant - (bnt * 2 - cnt)) % mod;

        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(mod + ans);
        }

        scanner.close();
    }
}
```

This Java code performs the same calculations as the provided Python code and deals with possible negative values in the final result similarly by adding the `mod` value. Please note that the type for the calculation here is `long` to accommodate for the large numbers involved before taking the modulus.
