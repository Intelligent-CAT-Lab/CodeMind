Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int p = 998244353;
        int[] f = new int[k + 1];
        f[0] = 1;
        for (int i = 1; i <= k; i++) {
            f[i] = (int) ((i * (long) f[i - 1]) % p);
            f[i] = (int) ((p - p / (i + 1)) * (long) f[i] % p);
        }
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum = (sum + (long) f[i] * pow(f[k - i], -1, p)) % p;
        }
        System.out.println(sum);
    }

    public static int pow(int a, int b, int p) {
        int res = 1;
        a = a % p;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % p;
            b = b >> 1;
            a = (a * a) % p;
        }
        return res;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers `n` and `k` from the standard input, calculates the factorials of `k` and `n-1`, and then calculates the sum of the products of the factorials. The `pow` function is used to calculate the modular multiplicative inverse of a number.
