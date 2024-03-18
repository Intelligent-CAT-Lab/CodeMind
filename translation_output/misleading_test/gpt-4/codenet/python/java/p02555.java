Here is the translated Java code for the provided Python program:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        if (s < 3) {
            System.out.println(0);
            System.exit(0);
        }
        int n = s / 3;

        long[] fact = new long[2 * s + 1];
        long[] inv = new long[2 * s + 1];
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= 2 * s; i++) {
            fact[i] = i * fact[i - 1] % MOD;
        }
        inv[2 * s] = power(fact[2 * s], MOD - 2, MOD);
        for (int i = 2 * s - 1; i > 0; i--) {
            inv[i] = inv[i + 1] * (i + 1) % MOD;
        }

        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1, fact, inv)) % MOD;
        }
        System.out.println(ans);
    }

    private static long comb(int x, int y, long[] fact, long[] inv) {
        if (x < y || y < 0) return 0;
        return fact[x] * inv[y] % MOD * inv[x - y] % MOD;
    }

    private static long power(long base, int exponent, int mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) != 0)
                result = result * base % mod;
            base = base * base % mod;
            exponent >>= 1;
        }
        return result;
    }
}
```

To run this Java program, ensure it's saved in a file named `Main.java`. Compile the program using the `javac Main.java` command and run it using `java Main`. You'll need to enter the value for `s` (as you would with the Python code), and the program will output the expected result.

Remember that Java is a statically typed language, so you have to declare the type of each variable. Also, Java uses explicit exception handling and doesn't have an `exit()` function like Python, but you can use `System.exit(0)` to terminate the program early.
