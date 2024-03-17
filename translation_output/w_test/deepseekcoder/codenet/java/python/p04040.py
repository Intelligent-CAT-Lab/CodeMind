<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1 1

Expected output:
2


```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class p04040 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DIrohaAndAGrid solver = new DIrohaAndAGrid();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIrohaAndAGrid {
        long modExp(long x, long y, long mod) {
            if (y == 0)
                return 1 % mod;
            long ret = modExp(x, y >> 1, mod);
            ret = ret * ret % mod;
            if ((y & 1) == 1)
                ret = ret * (x % mod) % mod;
            return ret;
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int r = s.nextInt(), c = s.nextInt();
            int a = s.nextInt(), b = s.nextInt();
            long mod = (long) 1e9 + 7;
            long[] fact = new long[r + c];
            long[] ifact = new long[r + c];
            fact[0] = 1;
            ifact[0] = 1;
            for (int i = 1; i < r + c; i++) {
                fact[i] = fact[i - 1] * i % mod;
                ifact[i] = ifact[i - 1] * modExp(i, mod - 2, mod) % mod;
            }
            long res = fact[r - 1 + c - 1] * ifact[r - 1] % mod * ifact[c - 1] % mod;
            long sub = 0;
            for (int x = 0; x < b; x++) {
                long v1 = fact[r - a - 1 + x] * ifact[r - a - 1] % mod * ifact[x] % mod;
                long v2 = fact[a - 1 + c - 1 - x] * ifact[a - 1] % mod * ifact[c - 1 - x] % mod;
                sub = (sub + v1 * v2 % mod) % mod;
            }
            res = (res - sub + mod) % mod;
            w.println(res);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


```

### Response:
```python
import sys

def modExp(x, y, mod):
    if y == 0:
        return 1 % mod
    ret = modExp(x, y >> 1, mod)
    ret = ret * ret % mod
    if (y & 1) == 1:
        ret = ret * (x % mod) % mod
    return ret

def solve(r, c, a, b):
    mod = (10**9) + 7
    fact = [0]*(r + c)
    ifact = [0]*(r + c)
    fact[0] = 1
    ifact[0] = 1
    for i in range(1, r + c):
        fact[i] = fact[i - 1] * i % mod
        ifact[i] = ifact[i - 1] * modExp(i, mod - 2, mod) % mod
    res = fact[r - 1 + c - 1] * ifact[r - 1] % mod * ifact[c - 1] % mod
    sub = 0
    for x in range(b):
        v1 = fact[r - a - 1 + x] * ifact[r - a - 1] % mod * ifact[x] % mod
        v2 = fact[a - 1 + c - 1 - x] * ifact[a - 1] % mod * ifact[c - 1 - x] % mod
        sub = (sub + v1 * v2 % mod) % mod
    res = (res - sub + mod) % mod
    return res

r, c, a, b = map(int, sys.stdin.readline().split())
print(solve(r, c, a, b))
```

This Python code reads four integers from the standard input, and then prints the result of the `solve` function. The `solve` function calculates the number of ways to choose a grid path from the top left corner to the bottom right corner of a grid with `r` rows and `c` columns, given that the grid cells can be traversed in `a` steps to the right or down, and the grid has `b` obstacles. The result is calculated modulo `(10**9) + 7` to prevent overflow.
<|EOT|>
