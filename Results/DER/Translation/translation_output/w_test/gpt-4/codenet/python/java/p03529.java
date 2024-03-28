Here's the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    final static int MOD = 1000000007;
    final static int SIZE = 3300;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] lis = new long[SIZE];
        lis[0] = 1;

        for (int i = N; i > 0; i--) {
            long[] nlis = new long[SIZE];

            for (int j = 0; j <= K; j++) {
                for (int last = 0; last < SIZE; last++) {
                    if (i < j) {
                        nlis[last] += lis[last];
                        nlis[last] %= MOD;
                    } else if ((last + j) / i + last < SIZE) {
                        nlis[last + (last + j) / i] += lis[last];
                        nlis[last + (last + j) / i] %= MOD;
                    }
                }
            }

            lis = nlis;
        }

        long ans = 1L * K * (K + 1) / 2 * modPow(K + 1, N - 1, MOD) * N % MOD;

        for (int i = 0; i < SIZE; i++) {
            ans -= lis[i] * i;
            ans = (ans + MOD) % MOD;
        }
        
        System.out.println(ans);
        sc.close();
    }

    public static long modPow(long base, int exp, int modulo) {
        long result = 1;
        base %= modulo;
        
        while (exp > 0) {
            if ((exp & 1) != 0) {
                result = (result * base) % modulo;
            }
            
            base = (base * base) % modulo;
            exp >>= 1;
        }
        
        return result;
    }
}
```

The translation includes all necessary modifications to work with Java's syntax, data types, and built-in methods. A few things to note:

- The method `modPow` is used to calculate `(K + 1)^(N - 1) mod MOD`, as Java does not have a built-in method equivalent to Python's `pow` with modulus.
- The arrays and loops have been adapted to work with Java's zero-based indexing.
- The division operation in the calculation of `ans` is done with `1L * K * (K + 1) / 2` to avoid integer division issues.
- The `Scanner` class is used for input.
- Resource management is handled by closing the `Scanner` at the end with `sc.close()`.
