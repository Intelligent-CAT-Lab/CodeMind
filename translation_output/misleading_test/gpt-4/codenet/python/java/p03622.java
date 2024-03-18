Below is the translated Java code encapsulated in `java` tags:

```java
import java.util.Scanner;

public class Main {
    private static final long M = 8 * 8 * 8 * 8 * 8 * 8 * 8;
    private static final long MOD = M * 476 + 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        
        if (A < B) {
            long temp = A;
            A = B;
            B = temp;
        }

        long[] f = new long[(int)M];
        long[] g = new long[(int)M];
        f[0] = 1;
        g[0] = 1;

        // Calculating factorial values
        for (int i = 1; i < M; i++) {
            f[i] = f[i - 1] * i % MOD;
        }

        // Inverse factorial
        g[(int)M - 1] = powMod(f[(int)(M - 1)], MOD - 2, MOD);
        for (int i = (int)M - 2; i >= 0; i--) {
            g[i] = g[i + 1] * (i + 1) % MOD;
        }

        long i = 0;
        long k = 1;
        long j = 1;
        while (j <= B) {
            i = (i + k * f[(int)(A + B - j)] * g[(int)(B - j)]) % MOD;
            k = k * 2 % MOD;
            j++;
        }

        long result = (i * f[(int)B] * g[(int)(A + B)] + A) % MOD;
        System.out.println(result);
    }

    private static long powMod(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}
```

This program assumes that the input will be provided in a similar way as in the Python example, via standard input (stdin), typically by typing the input and pressing enter. The main method uses a Scanner to read the inputs `A` and `B` from `stdin`. The computation approach and formula are kept consistent with the Python version, making use of modular arithmetic and pre-computed factorials and inverse factorials.

Make sure you have the Java Runtime Environment installed and then you may compile the program with `javac Main.java` and run it with `java Main`. The input should be provided on the command line after program execution.
