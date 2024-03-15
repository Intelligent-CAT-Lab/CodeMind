```java
import java.util.*;

public class Main {
    static int mod = (int) 1e9 + 7;
    static int rng = 2000100;
    static int[] fctr = new int[rng];

    public static void main(String[] args) {
        Arrays.fill(fctr, 0);
        fctr[0] = 1;

        for (int i = 1; i < rng; i++) {
            fctr[i] = (int) ((long) fctr[i - 1] * i % mod);
        }

        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int result = (cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1) + mod) % mod;
        System.out.println(result);
    }

    private static int finv(int x) {
        return pow(fctr[x], mod - 2, mod);
    }
    
    private static int cmb(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        } else {
            return (int) (((long) fctr[n] * finv(n - k) % mod) * finv(k) % mod);
        }
    }

    private static int pow(int base, int exp, int MOD) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return (int) result;
    }
}
```
