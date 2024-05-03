Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (n <= k) {
            long x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = (x * (2 * n - 1 - i)) % 1000000007;
            }
            long y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = (y * (i + 1)) % 1000000007;
            }
            System.out.println((x * pow(y, 1000000005)) % 1000000007);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            for (int i = 0; i < k; i++) {
                t = (t * (i + 1)) % 1000000007;
                y = (y * (n - 1 - i)) % 1000000007;
                y = (y * (n - i)) % 1000000007;
                long c = pow(t, 1000000005);
                x = (x + y * c * c) % 1000000007;
            }
            System.out.println(x);
        }
    }

    public static long pow(long a, long n) {
        long r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = (r * a) % 1000000007;
            }
            a = (a * a) % 1000000007;
            n >>= 1;
        }
        return r;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard
