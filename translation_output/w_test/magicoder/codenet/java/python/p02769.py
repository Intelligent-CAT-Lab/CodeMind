<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
10


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

@@ Response
```python
import sys

def gen(n):
    fact = [0] * (n + 1)
    factinv = [0] * (n + 1)
    fact[0] = 1
    factinv[0] = power(fact[0], mod - 2, mod)
    for i in range(1, n + 1):
        fact[i] = i * fact[i - 1]
        fact[i] %= mod
        factinv[i] = power(fact[i], mod - 2, mod)
    return fact, factinv

def solve(n, k):
    if k >= n:
        return nCrs(n + n - 1, n - 1, mod)
    else:
        ans = 0
        fact, factinv = gen(n)
        for i in range(k + 1):
            up = fact[n] * fact[n - 1]
            up %= mod
            den1 = factinv[i] * factinv[i]
            den1 %= mod
            den2 = factinv[n - i] * factinv[n - i - 1]
            den2 %= mod
            den = den1 * den2
            den %= mod
            ans += up * den
            ans %= mod
        return ans

def nCrs(n, r, p):
    #r is small
    up = 1
    down = 1
    for i in range(n - r + 1, n + 1):
        up *= i
        up %= p
    for i in range(1, r + 1):
        down *= i
        down %= p
    return (up * power(down, p - 2, p)) % p

def power(x, y, p):
    res = 1
    x = x % p
    while (y > 0):
        if ((y & 1) == 1):
            res = (res * x) % p
        y = y >> 1
        x = (x * x) % p
    return res

def main():
    n, k = map(int, sys.stdin.readline().split())
    mod = 1000000007
    print(solve(n, k))

if __name__ == "__main__":
    main()
```

This Python code is equivalent to the Java code provided. It reads two integers from the standard input, calculates the result using the `solve` function, and prints the result. The `solve` function calculates the result based on the given conditions. The `gen` function is used to generate the factorial and its inverse. The `nCrs` function is used to calculate the combination. The `power` function is used to calculate the power of a number modulo a given number.<｜end▁of▁sentence｜>
