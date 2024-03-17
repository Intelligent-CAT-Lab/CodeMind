<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ABCABC

Expected output:
3


```

import java.util.*;
import java.io.*;
class p03018 {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String str = sc.next();
        str = str.replace("BC", "X");
        int a = 0;
        long ans = 0;
        for(int i = str.length()-1; i>=0; i--) {
            char c = str.charAt(i);
            if(c=='X') {
                a++;
            }else if(c=='A') {
                ans += a;
            }else {
                a = 0;
            }
        }
        p(ans);
    }
    public static <T> void p(T element) {
	System.out.println(element);
    }
    public static <T> void pp(T element) {
        System.out.print(element);
        }
    public static int min(int a, int b, int c) {
	int min = Math.min(a,b);
	min = Math.min(min,c);
	return min;
    }
    public static int max(int a, int b,int c) {
	int max= Math.max(a,b);
	max = Math.max(max,c);
        return max;
    }
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
 
    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
 
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
```
[/INST]
```python
import sys

def p(x):
    print(x)

def pp(x):
    print(x, end=' ')

def min(x, y, z):
    return min(min(x, y), z)

def max(x, y, z):
    return max(max(x, y), z)

def fast_scan():
    inp = sys.stdin
    buffer = bytearray(1024)
    ptr, buflen = 0, 0

    def has_next_byte():
        if ptr < buflen:
            return True
        else:
            ptr = 0
            try:
                buflen = inp.read(buffer)
            except:
                return False
            if buflen <= 0:
                return False
        return True

    def read_byte():
        if has_next_byte():
            return buffer[ptr]
        else:
            return -1

    def is_printable_char(c):
        return 33 <= c and c <= 126

    def has_next():
        while has_next_byte() and not is_printable_char(buffer[ptr]):
            ptr += 1
        return has_next_byte()

    def next():
        if not has_next():
            raise NoSuchElementException()
        sb = StringBuilder()
        b = read_byte()
        while is_printable_char(b):
            sb.append(chr(b))
            b = read_byte()
        return sb.str()

    def next_long():
        if not has_next():
            raise NoSuchElementException()
        minus = False
        b = read_byte()
        if b == '-':
            minus = True
            b = read_byte()
        if not (b >= '0' and b <= '9'):
            raise NumberFormatException()
        n = 0
        while True:
            if (b >= '0' and b <= '9'):
                n *= 10
                n += b - '0'
            elif b == -1 or not is_printable_char(b):
                return minus * n if minus else n
            else:
                raise NumberFormatException()
            b = read_byte()

    def next_int():
        return next_long() // (1 << 63)

    def next_double():
        return float(next())

if __name__ == '__main__':
    str = input()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in range(len(str)-1, -1, -1):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)
```</s>
