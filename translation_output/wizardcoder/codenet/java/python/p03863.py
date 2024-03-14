Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class p03863 {
    static InputStream is;
    static PrintWriter out;
    static String INPUT = "";

    static void solve()
    {
        String s = ns();
        int l = s.length();

        if (l % 2 == 0 ^ s.charAt(0) == s.charAt(l - 1)) {
            out.println("Second");
        } else {
            out.println("First");
        }
    }

    public static void main(String[] args) throws Exception
    {
        long S = System.currentTimeMillis();
        is = INPUT.isEmpty()? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);

        solve();
        out.flush();
        long G = System.currentTimeMillis();
        tr(G-S+"ms");
    }

    private static boolean eof()
    {
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

    private static int readByte()
    {
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

    private static String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private static char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n &&!(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p? buf : Arrays.copyOf(buf, p);
    }

    private static char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }

    private static int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }

    private static int ni()
    {
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

    private static long nl()
    {
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

class p03863:
    is = None
    out = None
    INPUT = ""

    def solve():
        s = ns()
        l = len(s)

        if (l % 2 == 0) ^ (s[0] == s[l - 1]):
            out.println("Second")
        else:
            out.println("First")

    def main(args):
        S = System.currentTimeMillis()
        is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        out = PrintWriter(System.out)

        solve()
        out.flush()
        G = System.currentTimeMillis()
        tr(G-S+"ms")

    def eof():
        if lenbuf == -1:
            return True
        lptr = ptrbuf
        while lptr < lenbuf:
            if not isSpaceChar(inbuf[lptr]):
                return False
            lptr += 1

        try:
            is.mark(1000)
            while True:
                b = is.read()
                if b == -1:
                    is.reset()
                    return True
                elif not isSpaceChar(b):
                    is.reset()
                    return False
        except IOException:
            return True

    def readByte():
        if lenbuf == -1:
            raise InputMismatchException()
        if ptrbuf >= lenbuf:
            ptrbuf = 0
            try:
                lenbuf = is.read(inbuf)
            except IOException:
                raise InputMismatchException()
            if lenbuf <= 0:
                return -1
        return inbuf[ptrbuf]

    def isSpaceChar(c):
        return not (c >= 33 and c <= 126)

    def skip():
        b = readByte()
        while b!= -1 and isSpaceChar(b):
            b = readByte()
        return b

    def nd():
        return float(ns())

    def nc():
        return chr(skip())

    def ns():
        b = skip()
        sb = ""
        while not isSpaceChar(b):
            sb += chr(b)
            b = readByte()
        return sb

    def ns(n):
        buf = [0] * n
        b = skip()
        p = 0
        while p < n and not isSpaceChar(b):
            buf[p] = b
            p += 1
            b = readByte()
        return p == n and buf or buf[:p]

    def nm(n, m):
        map = [ns(m) for i in range(n)]
        return map

    def na(n):
        a = [0] * n
        for i in range(n):
            a[i] = ni()
        return a

    def ni():
        num = 0
        b = readByte()
        minus = False
        while b!= -1 and not ((b >= '0' and b <= '9') or b == '-'):
            b = readByte()
        if b == '-':
            minus = True
            b = readByte()
        while b!= -1 and b >= '0' and b <= '9':
            num = num * 10 + (b - '0')
            b = readByte()
        return minus and -num or num

    def nl():
        num = 0
        b = readByte()
        minus = False
        while b!= -1 and not ((b >= '0' and b <= '9') or b == '-'):
            b = readByte()
        if b == '-':
            minus = True
            b = readByte()
        while b!= -1 and b >= '0' and b <= '9':
            num = num * 10 + (b - '0')
            b = readByte()
        return minus and -num or num

    def tr(*o):
        if INPUT:
            System.out.println(Arrays.deepToString(o))

if __name__ == '__main__':
    p0386
