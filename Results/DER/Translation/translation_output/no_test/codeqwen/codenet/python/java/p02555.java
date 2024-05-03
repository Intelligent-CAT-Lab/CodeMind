Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s < 3) {
            System.out.println(0);
            return;
        }
        int n = s / 3;
        int mod = (int) 1e9 + 7;
        int[] fact = new int[2 * s + 1];
        int[] inv = new int[2 * s + 1];
        fact[0] = 1;
        for (int i = 1; i < 2 * s + 1; i++) {
            fact[i] = (i * fact[i - 1]) % mod;
        }
        inv[2 * s] = pow(fact[2 * s], -1, mod);
        for (int i = 2 * s; i > 0; i--) {
            inv[i - 1] = (inv[i] * i) % mod;
        }
        int ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % mod;
        }
        System.out.println(ans);
    }

    public static int pow(int a, int b, int mod) {
        if (b == 0) {
            return 1;
        }
        int res = pow(a, b / 2, mod);
        res = (res * res) % mod;
        if (b % 2 == 1) {
            res = (res * a) % mod;
        }
        return res;
    }

    public static int comb(int x, int y) {
        return x >= y && y >= 0 ? fact[x] * inv[y] % mod * inv[x - y] % mod : 0;
    }
}
```

This Java code does the same thing as your
