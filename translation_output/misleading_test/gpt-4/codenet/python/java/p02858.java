Below is your Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int T = scanner.nextInt();

        int gh = gcd(H, T);
        int gw = gcd(W, T);

        int h = H / gh;
        int w = W / gw;

        final int MOD = 1000000007;

        System.out.println(
            pow((pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3 + MOD) % MOD, (long) gh * gw, MOD));
    }

    // Method to calculate the Greatest Common Divisor
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    // Method to calculate the power with mod (x^y % mod)
    private static int pow(int x, long y, int mod) {
        int result = 1;
        x = x % mod;

        while (y > 0) {
            if (y % 2 != 0) result = (result * x) % mod;
            y = y >> 1;
            x = (x * x) % mod;
        }

        return result;
    }
}
```

The above Java code takes three integers as input, `H`, `W`, and `T`. It then finds the greatest common divisors between `H` and `T`, and between `W` and `T`. It calculates the modified values of `h` and `w`, and finally prints out the result of the given mathematical expression using modulo `1000000007`. The program defines additional methods `gcd` and `pow` to calculate the Greatest Common Divisor and modular exponentiation, respectively.
