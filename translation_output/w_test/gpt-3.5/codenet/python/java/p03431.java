```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int p = 998244353;

        long[] f = new long[k + 1];
        f[0] = 1;
        for (int i = 0; i < k; i++) {
            f[i + 1] = (i + 1) * f[i] % p;
        }

        long result = 0;
        for (int i = 0; i < n - 1; i++) {
            result = (result + f[k - 1] * modInverse(f[i] * f[k - 1 - i] % p, p) % p) % p;
        }

        System.out.println(result);
    }

    public static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            long q = a / m;
            long t = m;

            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x += m0;

        return x;
    }
}
```
