```java
import java.util.Scanner;

public class ThreeDivisors {

    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s < 3) {
            System.out.println(0);
            System.exit(0);
        }
        int n = s / 3;
        int[] fact = new int[2 * s + 1];
        int[] inv = new int[2 * s + 1];
        
        fact[0] = 1;
        inv[0] = 1;
        
        for (int i = 1; i <= 2 * s; i++) {
            fact[i] = (int) ((long) i * fact[i - 1] % MOD);
        }
        
        inv[2 * s] = pow(fact[2 * s], MOD - 2);
        for (int i = 2 * s - 1; i > 0; i--) {
            inv[i] = (int) ((long) inv[i + 1] * (i + 1) % MOD);
        }
        
        int ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % MOD;
        }
        
        System.out.println(ans);
    }

    private static int pow(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (int) ((long) result * base % MOD);
            }
            base = (int) ((long) base * base % MOD);
            exp /= 2;
        }
        return result;
    }

    private static int comb(int x, int y) {
        if (x >= y && y >= 0) {
            return (int) ((long) fact[x] * inv[y] % MOD * inv[x - y] % MOD);
        } else {
            return 0;
        }
    }
}
```
```
