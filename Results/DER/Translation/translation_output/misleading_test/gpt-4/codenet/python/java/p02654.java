Here is the translated Java code for the provided Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        System.out.println(solve(n, a));
    }

    public static long[] prepare(int n, long MOD) {
        long[] factorials = new long[n + 1];
        factorials[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorials[i] = (factorials[i - 1] * i) % MOD;
        }
        long[] finvs = new long[n + 1];
        finvs[n] = modPow(factorials[n], MOD - 2, MOD);
        for (int i = n; i > 0; i--) {
            finvs[i - 1] = (finvs[i] * i) % MOD;
        }
        return new long[][]{factorials, finvs};
    }

    public static long solve(int n, int a) {
        long MOD = (long)(1e9 + 7);
        long[][] precomputed = prepare(n, MOD);
        long[] facts = precomputed[0];
        long[] finvs = precomputed[1];
        long[] invs = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            invs[i] = (facts[i - 1] * finvs[i]) % MOD;
        }
        int r = n - a;

        long ans = 0;
        for (int l = 0; l < a; l++) {
            long tmp1 = facts[a] * finvs[l] % MOD * finvs[a - l] % MOD;
            long tmp2 = facts[n - l - 1] * (a - l) % MOD;
            ans = (ans + longPow(-1, l & 1) * tmp1 * tmp2) % MOD;
        }

        for (int k = 1; k < a; k++) {
            for (int l = 0; l < k; l++) {
                long tmp1 = facts[k] * finvs[l] % MOD * finvs[k - l] % MOD;
                long tmp2 = facts[n - l - 1] * (k - l) % MOD * invs[r + k - l] % MOD;
                ans = (ans + longPow(-1, l & 1) * tmp1 * tmp2) % MOD;
            }
        }

        return ans;
    }

    public static long modPow(long base, long exp, long mod) {
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

    public static long longPow(long base, long exp) {
        if (exp == 0) return 1;
        if (exp % 2 == 0) {
            return longPow(base * base, exp / 2);
        }
        return base * longPow(base * base, exp / 2);
    }
}
```
Please note a few points regarding Java and Python differences:

1. Java uses static typing, so we declare the types of all variables.
2. The main method is used as the entry point for a Java program.
3. Java does not have a built-in power function with a modulus parameter, so `modPow` has been implemented manually.
4. Instead of using a for each loop to split the input like in Python, the Java version uses a Scanner object to read integers directly.
5. The returned value from `prepare(n, MOD)` is a two-dimensional array of long values (`long[][]`). In Java, we can't return tuples directly like in Python, so we use an array to hold both the factorials and finvs.
6. Java does not support list comprehensions, so we must initialize `invs` using a traditional loop.
7. Python's exponentiation of (-1) ** exp is replaced with a custom method `longPow` that handles the power of -1 for even and odd exponents efficiently.

Make sure to run this Java code in an environment where the input matches the expected input format, and the output will be printed to the console accordingly.
