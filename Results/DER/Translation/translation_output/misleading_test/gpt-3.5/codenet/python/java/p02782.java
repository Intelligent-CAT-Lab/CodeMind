```java
import java.util.Scanner;

public class Main {
    static int mod = 1000000007;
    static int rng = 2000100;
    static long[] fctr = new long[rng];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        for (int i = 0; i < rng; i++) {
            fctr[i] = i == 0 ? 1 : 0;
        }

        for (int i = 1; i < rng; i++) {
            fctr[i] = (fctr[i - 1] * i) % mod;
        }

        int result = (int) (((cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1)) % mod + mod) % mod);
        System.out.println(result);
    }

    public static long cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return (fctr[n] * finv(n - k) % mod * finv(k)) % mod;
        }
    }

    public static long finv(int x) {
        return pow(fctr[x], mod - 2);
    }

    public static long pow(long base, int exp) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}
```
```
