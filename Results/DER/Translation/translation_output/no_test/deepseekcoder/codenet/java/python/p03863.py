<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
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

    private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }

    private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }

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
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
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
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static long nl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}

```

### Response:
```python
import io
import sys
import time
import re

is_ = sys.stdin
out = sys.stdout
INPUT = ""

def solve():
    s = ns()
    l = len(s)

    if l % 2 == 0 ^ s[0] == s[-1]:
        out.write("Second\n")
    else:
        out.write("First\n")

def main():
    S = time.time()
    global is_
    if INPUT:
        is_ = io.StringIO(INPUT)
    solve()
    out.flush()
    G = time.time()
    tr(f"{G-S}ms")

def eof():
    if lenbuf == -1: return True
    lptr = ptrbuf
    while lptr < lenbuf:
        if not isSpaceChar(inbuf[lptr]): return False
        lptr += 1

    try:
        is_.seek(0)
        while True:
            b = is_.read(1)
            if not b: return True
            if not isSpaceChar(b):
                is_.seek(is_.tell() - 1)
                return False
    except Exception:
        return True

inbuf = bytearray(1024)
lenbuf = 0
ptrbuf = 0

def readByte():
    global lenbuf, ptrbuf
    if lenbuf == -1: raise EOFError()
    if ptrbuf >= lenbuf:
        ptrbuf = 0
        try: lenbuf = is_.readinto(inbuf)
        except Exception: raise EOFError()
        if lenbuf <= 0: return -1
    return inbuf[ptrbuf]

def isSpaceChar(c): return not (c >= 33 and c <= 126)

def skip():
    b = readByte()
    while b != -1 and isSpaceChar(b): b = readByte()
    return b

def nd(): return float(ns())
def nc(): return chr(skip())

def ns():
    b = skip()
    s = []
    while not isSpaceChar(b):
        s.append(chr(b))
        b = readByte()
    return "".join(s)

def na(n):
    a = [0]*n
    for i in range(n): a[i] = ni()
    return a

def ni():
    num = 0
    b = readByte()
    minus = False
    while not ((b >= '0' and b <= '9') or b == '-' or b == ''): b = readByte()
    if b == '-':
        minus = True
        b = readByte()
    while True:
        if b >= '0' and b <= '9':
            num = num * 10 + (ord(
