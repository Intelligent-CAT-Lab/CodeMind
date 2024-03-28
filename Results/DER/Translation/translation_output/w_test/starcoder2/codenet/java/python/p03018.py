

```

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
print(ans)

```

## 03019

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
100


```

import java.util.*;
import java.io.*;
class p03019 {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int a = sc.nextInt();
        int b = sc.nextInt();
        p(a*b);
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

python code:

```

a, b = map(int, input().split())
print(a*b)

```

## 03020

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
100


```

import java.util.*;
import java.io.*;
class p03020 {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int a = sc.nextInt();
        int b = sc.nextInt();
        p(a*b);
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
    int max= Math.max
