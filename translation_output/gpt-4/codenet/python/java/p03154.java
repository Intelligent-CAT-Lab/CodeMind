```java
import java.util.Scanner;

public class Solution {
    private static final int MOD = (int) (1e9 + 7);
    private static final int list_size = 20000001;

    public static void main(String[] args) {
        long[] f_list = new long[list_size];
        long[] f_r_list = new long[list_size];

        f_list[0] = 1;
        f_r_list[0] = 1;

        for (int i = 0; i < list_size - 1; i++) {
            f_list[i + 1] = (f_list[i] * (i + 1)) % MOD;
        }

        f_r_list[list_size - 1] = pow(f_list[list_size - 1], MOD - 2, MOD);

        for (int i = list_size - 2; i >= 0; i--) {
            f_r_list[i] = (f_r_list[i + 1] * (i + 1)) % MOD;
        }

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        long ans = k * f_list[h + w] * f_r_list[h + w - k] % MOD;
        ans = (ans + (long)(h + w) * k * (k + 1) * f_list[h + w - 1] * f_r_list[2] * f_r_list[h + w - k]) % MOD;
        ans = (ans + (long)h * w * f_list[h + w - 2] * (k - 1) * k * (k + 1) * pow(3, MOD - 2, MOD) * f_r_list[h + w - k]) % MOD;

        System.out.println(ans);
    }

    private static long pow(long base, long exponent, long modulus) {
        long result = 1;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % modulus;
            }

            base = (base * base) % modulus;
            exponent >>= 1;
        }

        return result;
    }
}
```

The Java code provided above defines a class `Solution` containing the translated Python script. The task performs calculations using factorial and modular multiplicative inverses to compute a certain value `ans` based on inputs `h`, `w`, and `k`.

Several adjustments have been made to accommodate differences between Python and Java:
- Java lacks native big integer arithmetic, so calculations that could potentially overflow `long` are performed modulo `MOD`.
- Java arrays are initialized with all elements set to `0`, hence just the first elements of `f_list` and `f_r_list` are initialized to `1`.
- The Java `Scanner` class is used to read input from `System.in`.
- The `pow` function has been implemented to replace Python's built-in `pow`. It's a modular exponentiation method that calculates (`base`^`exponent`) % `modulus` efficiently using successive squaring.
- Type casting is used where necessary before multiplication to avoid integer overflow.
- The resulting `ans` is printed to the console.
