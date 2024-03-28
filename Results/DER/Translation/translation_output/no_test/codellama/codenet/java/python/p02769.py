<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```python
import math

class Maths:
    @staticmethod
    def nCrs(n, r, p):
        # r is small
        up = 1
        down = 1
        for i in range(n - r + 1, n + 1):
            up *= i
            up %= p
        for i in range(1, r + 1):
            down *= i
            down %= p
        return (up * Maths.power(down, p - 2, p)) % p

    @staticmethod
    def power(x, y, p):
        res = 1
        x = x % p
        while y > 0:
            if y & 1 == 1:
                res = (res * x) % p
            y = y >> 1
            x = (x * x) % p
        return res

class ERoaming:
    def __init__(self):
        self.fact = []
        self.factinv = []
        self.mod = 1000000007
        self.n = 0

    def gen(self):
        self.fact = [1] * (self.n + 1)
        self.factinv = [1] * (self.n + 1)
        self.fact[0] = 1
        self.factinv[0] = Maths.power(self.fact[0], self.mod - 2, self.mod)
        for i in range(1, self.n + 1):
            self.fact[i] = i * self.fact[i - 1]
            self.fact[i] %= self.mod
            self.factinv[i] = Maths.power(self.fact[i], self.mod - 2, self.mod)

    def solve(self, test_number, in, out):
        self.n = in.next_long()
        k = in.next_long()
        if k >= self.n:
            out.println(Maths.nCrs(self.n + self.n - 1, self.n - 1, self.mod))
        else:
            ans = 0
            self.gen()
            for i in range(0, k + 1):
                up = self.fact[self.n] * self.fact[self.n - 1]
                up %= self.mod
                den1 = self.factinv[i] * self.factinv[i]
                den1 %= self.mod
                den2 = self.factinv[self.n - i] * self.factinv[self.n - i - 1]
                den2 %= self.mod
                den = den1 * den2
                den %= self.mod
                ans += up * den
                ans %= self.mod
                # out.println((up*den)%mod)
            out.println(ans)

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = self.reader.readline()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.next_token()

    def next_long(self):
        return long(self.next())

if __name__ == "__main__":
    input_stream = sys.stdin
    output_stream = sys.stdout
    input_reader = InputReader(input_stream)
    output_writer = PrintWriter(output_stream
