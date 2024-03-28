<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
class FastScanner:
    def __init__(self, inp=None):
        if inp is None:
            inp = sys.stdin
        self.inp = inp
        self.buf = []
        self.eof = False

    def next(self):
        if len(self.buf) == 0:
            if self.eof:
                raise Exception("No more tokens")
            self.buf = list(map(str, self.inp.readline().split()))
        return self.buf.pop(0)

    def has_next(self):
        if len(self.buf) == 0:
            if self.eof:
                return False
            self.buf = list(map(str, self.inp.readline().split()))
        return len(self.buf) > 0

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.inp.readline().rstrip('\n')

def p(element):
    sys.stdout.write(str(element) + "\n")

def pp(element):
    sys.stdout.write(str(element))

def min(a, b, c):
    return min(a, min(b, c))

def max(a, b, c):
    return max(a, max(b, c))

def solve():
    sc = FastScanner()
    str = sc.next_line()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in range(len(str)-1, -1, -1):
        c = str[i]
        if c=='X':
            a += 1
        elif c=='A':
            ans += a
        else:
            a = 0
    p(ans)

solve()
```
<|EOT|>
