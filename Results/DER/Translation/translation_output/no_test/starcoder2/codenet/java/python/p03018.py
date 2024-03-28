
```
import sys

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = sys.stdin.buffer.read(1024)
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c and c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise Exception("No more tokens")
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise Exception("No more tokens")
        n = 0
        minus = False
        b = self.readByte()
        if b == ord("-"):
            minus = True
            b = self.readByte()
        if not (ord("0") <= b and b <= ord("9")):
            raise Exception("No more tokens")
        while True:
            if ord("0") <= b and b <= ord("9"):
                n *= 10
                n += b - ord("0")
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise Exception("No more tokens")
            b = self.readByte()

    def nextInt(self):
        return int(self.nextLong())

    def nextDouble(self):
        return float(self.next())

sc = FastScanner()

str = sc.next()
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
print(ans)
```

## 3.019

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.*;
import java.io.*;
class p03019 {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i<n; i++) {
            int x = a[i];
            int y = a[i+1];
            if(x==y) {
                ans++;
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
 
    public long
