```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        final int MOD = 1000000007;

        int x = fastExponentiation(2, n, MOD) - 1;
        int A = modComb(n, a, MOD);
        int B = modComb(n, b, MOD);
        int ans = (x - A - B + MOD) % MOD;
        System.out.println(ans);
    }

    public static int fastExponentiation(int base, int exponent, int mod) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent /= 2;
        }
        return (int) result;
    }

    public static int modInverse(int a, int mod) {
        return fastExponentiation(a, mod - 2, mod);
    }

    public static int modComb(int n, int a, int mod) {
        long cnt = 1;
        for (int i = 0; i < a; i++) {
            cnt = (cnt * (n - i)) % mod;
            cnt = (cnt * modInverse(i + 1, mod)) % mod;
        }
        return (int) cnt;
    }
}
```
This Java code is the translation of the provided Python code. It takes input for `n`, `a`, and `b`, calculates the modular exponentiation, modular inverse, and the modular combination, and finally calculates the result based on the given formulas and constraints.
