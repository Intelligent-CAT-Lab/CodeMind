```java
import java.util.Scanner;

public class Main {
    static final long MOD = (long) 1e9 + 7;

    public static long sum(long a, long d, long n) {
        return n * (2 * a + (n - 1) * d) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long s = 0;

        if (n == 1) {
            s = m + 1;
        } else {
            s = sum(m + 1, -n + 1, 1 + m / (n - 1));
            s *= 2;
            s -= (m + 1);
        }

        System.out.println(s % MOD);
    }
}
```

