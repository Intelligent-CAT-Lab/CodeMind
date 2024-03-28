Below is the Python code translated into Java:

```java
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class TestProgram {

    static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testInput = sc.nextInt();
        System.out.println(solve(testInput));
    }

    public static int solve(int n) {
        long[] fact = new long[n+1];
        long[] ifact = new long[n+1];
        fact[0] = 1;
        ifact[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            ifact[i] = BigInteger.valueOf(fact[i]).modInverse(BigInteger.valueOf(MOD)).longValue();
        }

        long ans = 0;
        long c0 = 0;
        for (int i = n/2; i < n; i++) {
            long c1 = (nCk(i-1, n-1-i, fact, ifact) * fact[i] % MOD * fact[n-i-1] % MOD - c0 + MOD) % MOD;
            ans = (ans + c1 * i) % MOD;
            c0 = (c0 + c1) % MOD;
        }

        return (int)ans;
    }

    public static long nCk(int n, int k, long[] fact, long[] ifact) {
        if (k < 0 || k > n) return 0;
        return fact[n] * ifact[n-k] % MOD * ifact[k] % MOD;
    }
}
```

Please note that I omitted the `Reader` class from the original Python code, which is used to handle file-based input, and replaced it with a simple scanner for input. If you need file input handling similar to the original Python code, you might consider using Java's file I/O classes such as `BufferedReader` and `FileReader`. For this example, I've assumed the input `n` is directly provided via standard terminal (console) input.
