Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
16


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
            while ((b = readByte())!= -1 &&!((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus? -num : num;
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

### Response:
```python
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

class TaskC:
    def solve(self, testNumber, in, out):
        i = in.nextInt()

        md = [0] * i

        rm = i - 2
        lx = i - 2
        while rm >= 0:
            md[lx + 1] = Util.c(rm, lx)
            rm -= 2
            lx -= 1

        res = 0
        prev = 0
        for m in range(1, i):
            cur = Util.fact(m) * Util.fact(i - m - 1) % Util._m
            cur = cur * (md[m]) % Util._m

            res += (cur - prev + Util._m) * m % Util._m
            prev = cur

        out.println(res % Util._m)

class Util:
    M07 = 1000_000_007
    _m = M07
    fact = None
    inv = None
    ifact = None

    @staticmethod
    def l():
        Util.fact = [1] * 1000001
        Util.inv = [1] * 1000001
        Util.ifact = [1] * 1000001
        for s in range(2):
            Util.fact[s] = 1
            Util.ifact[s] = 1
            Util.inv[s] = 1
        Util.inv[0] = 0
        for i in range(2, Util.inv.length):
            Util.inv[i] = (Util._m - (Util._m // i) * Util.inv[Util._m % i] % Util._m) % Util._m
        for i in range(2, Util.fact.length):
            Util.fact[i] = i * Util.fact[i - 1] % Util._m
            Util.ifact[i] = Util.inv[i] * Util.ifact[i - 1] % Util._m

    @staticmethod
    def c(a, b):
        if Util.fact is None:
            Util.l()
        return Util.ifact[a] * Util.ifact[b - a] % Util._m * Util.fact[b] % Util._m

    @staticmethod
    def fact(a):
        if Util.fact is None:
            Util.l()
        return Util.fact[a]

class MyScan:
    def __init__(self, in):
        self.in = in
        self.inbuf = bytearray(1024)
        self.lenbuf = 0
        self.ptrbuf = 0

    def readByte(self):
        if self.lenbuf == -1:
            raise InputMismatchException()
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = self.in.read(self.inbuf)
            except IOException as e:
                raise InputMismatchException()
            if self.lenbuf <= 0:
                return -1
        return self.inbuf[self.ptrbuf]

    def nextInt(self):
        num = 0
        b = self.readByte()
        minus = False
        while b!= -1 and not ((b >= '0' and b <= '9') or b == '-'):
            b = self.readByte()
        if b == '-':
            minus = True
            b = self.readByte()
        while b!= -1 and (b >= '0' and b <= '9'):
            num = num * 10 + (b - '0')
            b = self.readByte()
        return -num if minus else num

if __name__ == '__main__':
    inputStream = System.in
    outputStream = System.out
    in = MyScan(inputStream)
    out = PrintWriter(outputStream)
    solver = TaskC()
    solver.solve(1, in, out)
    out.close()
```<|endoftext|>
