```java
import java.util.Scanner;

public class Main {
    static long mod = (long) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (n <= k) {
            long x = 1;
            for (int i = 0; i < n - 1; i++) {
                x *= (2 * n - 1 - i) % mod;
                x %= mod;
            }

            long y = 1;
            for (int i = 0; i < n - 1; i++) {
                y *= (i + 1) % mod;
                y %= mod;
            }

            System.out.println((x * bp(y, mod - 2)) % mod);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            
            for (int i = 0; i < k; i++) {
                t = (t * (i + 1)) % mod;
                y = (y * (n - 1 - i)) % mod;
                y = (y * (n - i)) % mod;
                long c = bp(t, mod - 2);
                x += (y * c * c) % mod;
                x %= mod;
            }
            
            System.out.println(x);
        }
    }

    public static long bp(long a, long n) {
        long r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = (r * a) % mod;
            }
            a = (a * a) % mod;
            n >>= 1;
        }
        return r;
    }
}
```
