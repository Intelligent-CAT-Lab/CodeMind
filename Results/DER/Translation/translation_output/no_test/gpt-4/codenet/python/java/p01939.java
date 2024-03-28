Here is your Python code translated into Java, enclosed in ```java```:

```java
import java.util.Scanner;

public class Main {

    private static final int MOD = 1000000007;

    private static long sum(long a, long d, long n) {
        return n * (2 * a + (n - 1) * d) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        scanner.close();

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

Please make sure to compile and run this Java code in a proper environment, as syntax errors might occur if the code formatting gets altered in any way.
