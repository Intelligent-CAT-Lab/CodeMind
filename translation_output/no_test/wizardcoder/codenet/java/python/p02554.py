Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class p02554 {
    static InputStream is;
    static PrintWriter out;
    static String INPUT = "";

    static void solve() {
        long n = nl();
        long mod = 1000000007;
        long total = modpow(10, n, mod);
        long partial = 2 * modpow(9, n, mod);
        long both = modpow(8, n, mod);
        long ans = (total - partial + both) % mod;
        ans = (ans + mod) % mod;
        System.out.println(ans);
    }

    public static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        long S = System.currentTimeMillis();
        is = INPUT.isEmpty()? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);

        solve();
        out.flush();
        long G = System.currentTimeMillis();
        tr(G-S+"ms");
    }

    private static boolean eof() {
        if(lenbuf == -1)return true;
        int lptr = ptrbuf;
        while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;

        try {
            is.mark(1000);
            while(true){
                int b = is.read();
                if(b == -1){
                    is.reset();
                    return true;
                }else if(!isSpaceChar(b)){
                    is.reset();
                    return false;
                }
            }
        } catch (IOException e) {
            return true;
        }
    }

    private static byte[] inbuf = new byte[1024];
    static int lenbuf = 0, ptrbuf = 0;

    private static int readByte() {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }

    private static boolean isSpaceChar(int c) { return!(c >= 33 && c <= 126); }

    private static int skip() { int b; while((b = readByte())!= -1 && isSpaceChar(b)); return b; }

    private static double nd() { return Double.parseDouble(ns()); }
    private static char nc() { return (char)skip(); }

    private static String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private static char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n &&!(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p? buf : Arrays.copyOf(buf, p);
    }

    private static char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }

    private static int[] na(int n) {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }

    private static int ni() {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte())!= -1 &&!((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus? -num : num;
            }
            b = readByte();
        }
    }

    private static long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte())!= -1 &&!((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus? -num : num;
            }
            b = readByte();
        }
    }

    private static void tr(Object... o) { if(INPUT.length()!= 0)System.out.println(Arrays.deepToString(o)); }
}

```

### Response:
```python
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.*

class p02554:
    is = None
    out = None
    INPUT = ""

    def solve():
        n = int(input())
        mod = 1000000007
        total = pow(10, n, mod) % mod
        partial = 2 * pow(9, n, mod) % mod
        both = pow(8, n, mod) % mod
        ans = (total - partial + both) % mod
        ans = (ans + mod) % mod
        print(ans)

    def modpow(self, a, n, mod):
        res = 1
        while n > 0:
            if n & 1 == 1:
                res = (res * a) % mod
            a = (a * a) % mod
            n >>= 1
        return res

    def main(self):
        S = System.currentTimeMillis()
        self.is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        self.out = PrintWriter(System.out)

        self.solve()
        self.out.flush()
        G = System.currentTimeMillis()
        self.tr(G-S+"ms")

    def eof(self):
        if self.lenbuf == -1:
            return True
        lptr = self.ptrbuf
        while lptr < self.lenbuf:
            if not self.isSpaceChar(self.inbuf[lptr]):
                return False
            lptr += 1

        try:
            self.is.mark(1000)
            while True:
                b = self.is.read()
                if b == -1:
                    self.is.reset()
                    return True
                elif not self.isSpaceChar(b):
                    self.is.reset()
                    return False
        except IOException as e:
            return True

    def readByte(self):
        if self.lenbuf == -1:
            raise InputMismatchException()
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = self.is.read(self.inbuf)
            except IOException as e:
                raise InputMismatchException()
            if self.lenbuf <= 0:
                return -1
        return self.inbuf[self.ptrbuf]

    def isSpaceChar(self, c):
        return not (c >= 33 and c <= 126)

    def skip(self):
        b = self.readByte()
        while b!= -1 and self.isSpaceChar(b):
            b = self.readByte()
        return b

    def nd(self):
        return float(self.ns())

    def nc(self):
        return chr(self.skip())

    def ns(self):
        b = self.skip()
        sb = StringBuilder()
        while not self.isSpaceChar(b):
            sb.appendCodePoint(b)
            b = self.readByte()
        return sb.toString()

    def ns(self, n):
        buf = char[n]()
        b = self.skip()
        p = 0
        while p < n and not self.isSpaceChar(b):
            buf[p] = chr(b)
            p += 1
            b = self.readByte()
        return n == p and buf or Arrays.copyOf(buf, p)

    def nm(self, n, m):
        map = char
