<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class p02769 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERoaming solver = new ERoaming();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoaming {
        long[] fact;
        long[] factinv;
        long mod = 1000000007;
        long n;

        public void gen() {
            fact = new long[(int) (n + 1)];
            factinv = new long[(int) (n + 1)];
            fact[0] = 1;
            factinv[0] = Maths.power(fact[0], mod - 2, mod);
            for (int i = 1; i <= n; i++) {
                fact[i] = i * fact[i - 1];
                fact[i] %= mod;
                factinv[i] = Maths.power(fact[i], mod - 2, mod);
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextLong();
            long k = in.nextLong();
            if (k >= n) {
                out.println(Maths.nCrs(n + n - 1, n - 1, mod));
            } else {
                long ans = 0;
                gen();
                for (int i = 0; i <= k; i++) {
                    long up = fact[(int) n] * fact[(int) (n - 1)];
                    up %= mod;
                    long den1 = factinv[i] * factinv[i];
                    den1 %= mod;
                    long den2 = factinv[(int) n - i] * factinv[(int) n - i - 1];
                    den2 %= mod;
                    long den = den1 * den2;
                    den %= mod;
                    ans += up * den;
                    ans %= mod;
//                out.println((up*den)%mod);
                }
                out.println(ans);
            }
        }

    }

    static class Maths {
        static long nCrs(long n, long r, long p) {
            //r is small
            long up = 1;
            long down = 1;
            for (long i = n - r + 1; i <= n; i++) {
                up *= i;
                up %= p;
            }
            for (long i = 1; i <= r; i++) {
                down *= i;
                down %= p;
            }
            return (up * power(down, p - 2, p)) % p;
        }

        static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}


```

### Response:
```python
import sys
from functools import reduce

mod = 1000000007

def gen(n):
    fact = [1]*(n+1)
    factinv = [1]*(n+1)
    for i in range(1, n+1):
        fact[i] = i * fact[i - 1] % mod
        factinv[i] = pow(fact[i], mod - 2, mod)
    return fact, factinv

def nCrs(n, r, p):
    if r > n:
        return 0
    return fact[n] * factinv[r] % p * factinv[n - r] % p

def power(x, y, p):
    res = 1
    x = x % p
    while (y > 0):
        if ((y & 1) == 1):
            res = (res * x) % p
        y = y >> 1
        x = (x * x) % p
    return res

def solve(n, k):
    if k >= n:
        return nCrs(n + n - 1, n - 1, mod)
    else:
        ans = 0
        fact, factinv = gen(n)
        for i in range(k+1):
            up = fact[n] * fact[n - 1] % mod
            den1 = factinv[i] * factinv[i] % mod
            den2 = factinv[n - i] * factinv[n - i - 1] % mod
            den = den1 * den2 % mod
            ans += up * den % mod
            ans %= mod
        return ans

fact, factinv = gen(100000)
for line in sys.stdin:
    n, k = map(int, line.split())
    print(solve(n, k))
```

This Python code does the same thing as the Java code. It reads two integers `n` and `k` from the standard input, and prints the result of the `solve` function to the standard output. The `solve` function calculates the result according to the formula in the Java code. The `gen` function generates the factorial and factorial inverse arrays, and the `nCrs` function calculates the combination of `n` choose `r` modulo `p`. The `power` function calculates the power of `x` to the `y` modulo `p`.
<|EOT|>
