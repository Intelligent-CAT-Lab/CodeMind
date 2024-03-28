<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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
            while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
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

python code:<fim_suffix><fim_middle>

```python
import sys

def nCr(n, r):
    f = [1] * (n + 1)
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % 1000000007
    inv = [0] * (n + 1)
    inv[n] = pow(f[n], 1000000007 - 2, 1000000007)
    for i in range(n, 0, -1):
        inv[i - 1] = inv[i] * i % 1000000007
    return f[n] * inv[r] * inv[n - r] % 1000000007

def main():
    input = sys.stdin.readline
    MOD = 1000000007
    n, k = map(int, input().split())
    if k >= n:
        print(nCr(n + n - 1, n - 1) % MOD)
    else:
        ans = 0
        for i in range(k + 1):
            up = nCr(n, i) * nCr(n - 1, k - i) % MOD
            den1 = pow(i, MOD - 2, MOD)
            den2 = pow(n - i, MOD - 2, MOD)
            den = den1 * den2 % MOD
            ans += up * den % MOD
        print(ans % MOD)

if __name__ == '__main__':
    main()

```
'''
<|endoftext|>
