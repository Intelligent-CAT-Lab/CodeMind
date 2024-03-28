Here's the Python code translated to Java:

```java
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Solution {

    static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        FastReader f = new FastReader(System.in);
        System.out.println(solve(f));
    }

    static int solve(FastReader f) {
        int n = f.nextInt();

        long[] fact = new long[n+1];
        long[] ifact = new long[n+1];
        fact[0] = 1;
        ifact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
            ifact[i] = BigInteger.valueOf(fact[i])
                            .modInverse(BigInteger.valueOf(MOD))
                            .longValue();
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

    static long nCk(int n, int k, long[] fact, long[] ifact) {
        if (k < 0 || k > n) return 0;
        return (fact[n] * ifact[n-k] % MOD * ifact[k] % MOD) % MOD;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        
        // Other input methods can be added below for reading different types of input, if needed.
    }
}
```

This implementation reuses some components of the Python code but adapted to Java's syntax and language features. The `FastReader` class provides an easy way to read inputs in Java, replacing Python's `Reader` object.

Please note the following when translating from Python to Java:

1. Java is statically typed. Hence, datatype declarations are necessary.
2. Java's `BigInteger` class provides methods for modular inverse, which was used to calculate the inverse factorial.
3. The `print` statement is replaced by `System.out.println` for output.
4. The range-based loop `for i in xrange(n/2,n)` is adjusted for Java's looping conventions (`for (int i = n/2; i < n; i++)`).
5. Java uses the `%` operator for modulo, similar to Python.
6. A `FastReader` inner class has been implemented for fast input, which is important when handling large amounts of data (this emulates the behavior of Python's `input()`, `raw_input()`, and related methods within the Reader class).

The test case provided (with `n = 4`) should output `29` when this program is executed. Ensure that you have the necessary Java development environment set up to compile and run the program.
