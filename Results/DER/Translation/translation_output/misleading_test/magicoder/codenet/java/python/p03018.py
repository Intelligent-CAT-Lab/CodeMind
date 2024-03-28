<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ABCABC

Expected output:
77

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

@@ Response
Here is the equivalent Python code:

```python
class FastScanner:
    def __init__(self):
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0
        self.has_next = self.update()

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.buffer.read_from_socket(self.buffer)
            except EOFError:
                self.buflen = 0
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        s = []
        b = self.read_byte()
        while self.is_printable_char(b):
            s.append(chr(b))
            b = self.read_byte()
        return "".join(s)

    def next_long(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte()
        if b == '-'.encode()[0]:
            minus = True
            b = self.read_byte()
        if b < '0'.encode()[0] or '9'.encode()[0] < b:
            raise NumberFormatException()
        while True:
            if '0'.encode()[0] <= b and b <= '9'.encode()[0]:
                n *= 10
                n += b - '0'.encode()[0]
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise NumberFormatException()
        return int(nl)

    def next_double(self):
        return float(self.next())


def p(element):
    print(element)


def pp(element):
    print(element, end='')


def min(a, b, c):
    min_val = a
    if b < min_val:
        min_val = b
    if c < min_val:
        min_val = c
    return min_val


def max(a, b, c):
    max_val = a
    if b > max_val:
        max_val = b
    if c > max_val:
        max_val = c
    return max_val


def main():
    sc = FastScanner()
    str = sc.next()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in range(len(str) - 1, -1, -1):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)


if __name__ == "__main__":
    main()
```

Please note that Python does not have a built-in equivalent to Java's `System.out.println()` or `System.out.print()`. Instead, we use the `print()`
