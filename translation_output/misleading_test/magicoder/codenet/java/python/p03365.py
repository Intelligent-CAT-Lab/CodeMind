<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
-29

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
 */
public class p03365 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int i = in.nextInt();

            long[] md = new long[i];

            int rm = i - 2;
            int lx = i - 2;
            while (rm >= 0) {
                md[lx + 1] = Util.c(rm, lx);
                rm -= 2;
                lx--;
            }
            long res = 0;
            long prev = 0;
            for (int m = 1; m < i; m++) {
                long cur = Util.fact(m) * Util.fact(i - m - 1) % Util._m;
                cur = cur * (md[m]) % Util._m;


                res += (cur - prev + Util._m) * m % Util._m;
                prev = cur;

            }


            out.println(res % Util._m);

        }

    }

    static class MyScan {
        private final InputStream in;
        private byte[] inbuf = new byte[1024];
        public int lenbuf = 0;
        public int ptrbuf = 0;

        public MyScan(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = in.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

    }

    static class Util {
        public static final long M07 = 1000_000_007;
        public static long _m = M07;
        private static long[] fact;
        private static long[] inv;
        private static long[] ifact;

        public static void l() {
            fact = new long[1000001];
            inv = new long[1000001];
            ifact = new long[1000001];
            for (int s = 0; s < 2; s++) {
                fact[s] = 1;
                ifact[s] = 1;
                inv[s] = 1;
            }
            inv[0] = 0;
            for (int i = 2; i < inv.length; i++) {
                inv[i] = (_m - (_m / i) * inv[(int) (_m % i)] % _m) % _m;
            }
            for (int i = 2; i < fact.length; i++) {
                fact[i] = i * fact[i - 1] % _m;
                ifact[i] = inv[i] * ifact[i - 1] % _m;
            }
        }

        public static long c(int a, int b) {
            if (fact == null) l();
            return ifact[a] * ifact[b - a] % _m * fact[b] % _m;
        }

        public static long fact(int a) {
            if (fact == null) l();
            return fact[a];
        }

    }
}


```

@@ Response
```python
import sys

def c(a, b):
    if a == 0 or a == b:
        return 1
    else:
        return (fact[b] * inv[a] * inv[b - a]) % _m

def fact(a):
    if a == 0 or a == 1:
        return 1
    else:
        return (a * fact(a - 1)) % _m

def solve(i):
    md = [0] * i
    rm = i - 2
    lx = i - 2
    while rm >= 0:
        md[lx + 1] = c(rm, lx)
        rm -= 2
        lx -= 1
    res = 0
    prev = 0
    for m in range(1, i):
        cur = (fact(m) * fact(i - m - 1)) % _m
        cur = (cur * md[m]) % _m
        res = (res + (cur - prev + _m) * m) % _m
        prev = cur
    return res

_m = 1000000007
fact = [0] * 1000001
inv = [0] * 1000001
ifact = [0] * 1000001

for s in range(2):
    fact[s] = 1
    ifact[s] = 1
    inv[s] = 1
inv[0] = 0
for i in range(2, len(inv)):
    inv[i] = (_m - (_m // i) * inv[_m % i] % _m) % _m
for i in range(2, len(fact)):
    fact[i] = i * fact[i - 1] % _m
    ifact[i] = inv[i] * ifact[i - 1] % _m

i = int(sys.stdin.readline())
print(solve(i))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the result using the `solve` function, and prints the result. The `c` and `fact` functions are used to calculate combinations and factorials, respectively. The `inv`, `fact`, and `ifact` lists are used to store the inverse, factorial, and inverse factorial of numbers, respectively. The `_m` variable is the modulus used in the calculations.<｜end▁of▁sentence｜>
