Below is the equivalent Java code for the Python script you've provided. I've mimicked the functions to align closely with the Python utility functions you used, translating them into idiomatic Java:

```java
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    static final int mod = 998244353;
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    // Utility methods to simulate Python-like input methods
    static int[] LI() throws IOException {
        st = new StringTokenizer(br.readLine());
        int[] res = new int[st.countTokens()];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(st.nextToken());
        }
        return res;
    }

    static int I() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static char[] S() throws IOException {
        return br.readLine().toCharArray();
    }

    static List<int[]> LIR(int n) throws IOException {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(LI());
        }
        return res;
    }

    static List<char[]> SR(int n) throws IOException {
        List<char[]> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(S());
        }
        return res;
    }

    // Compute power with mod (iterative version)
    static long powMod(long base, long exponent, int modulus) {
        long result = 1;
        base %= modulus;
        while (exponent > 0) {
            if (exponent % 2 == 1)
                result = (result * base) % modulus;
            exponent >>= 1;
            base = (base * base) % modulus;
        }
        return result;
    }

    static void solve() throws IOException {
        int[] input = LI();
        int n = input[0], k = input[1], a = input[2];
        long[] lst = new long[k + 1];
        lst[k - 1] = 1;
        long A = a * powMod(100L * n, mod - 2, mod) % mod;
        long inv = powMod(n, mod - 2, mod);

        for (int i = k - 2; i >= 0; --i) {
            if (k > i + n) {
                lst[i] = (A * (lst[i + 1] - lst[i + n + 1]) + lst[i + 1]) % mod;
            } else {
                lst[i] = (A * (lst[i + 1] - lst[k]) + (n - (k - i) + 1) * inv + lst[i + 1]) % mod;
            }
        }
        System.out.println((lst[0] - lst[1] + mod) % mod);
    }

    public static void main(String[] args) throws IOException {
        // Increase stack size for deep recursion
        new Thread(null, new Runnable() {
            public void run() {
                try {
                    solve();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, "solve", 1 << 26).start();
    }
}
```

The Java code here tries to keep as much of the original Python logic as possible and includes the standard Input functions to emulate Python's I/O.

Do note, however, that Java does not encourage the use of recursion for really deep calls due to risk of `StackOverflowError`. In the above code, I've increased the stack size in the `main` function to accommodate deep recursion if necessary.

Moreover, the `modPow` function of `BigInteger` can be used instead of the custom `powMod` function. However, using `BigInteger` would be less efficient due to its immutable nature and overhead of working with objects.

Also, be advised that the `solve()` method throws an `IOException` which should be handled in a real-world application. The sample here omits that handling for brevity.
