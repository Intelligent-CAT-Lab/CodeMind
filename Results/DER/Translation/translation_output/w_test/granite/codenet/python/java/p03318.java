System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
19


```
#!/usr/bin/env python3
from collections import defaultdict
from collections import deque
from heapq import heappush, heappop
import sys
import math
import bisect
import random
import itertools
sys.setrecursionlimit(10**5)
stdin = sys.stdin
bisect_left = bisect.bisect_left
bisect_right = bisect.bisect_right
def LI(): return list(map(int, stdin.readline().split()))
def LF(): return list(map(float, stdin.readline().split()))
def LI_(): return list(map(lambda x: int(x)-1, stdin.readline().split()))
def II(): return int(stdin.readline())
def IF(): return float(stdin.readline())
def LS(): return list(map(list, stdin.readline().split()))
def S(): return list(stdin.readline().rstrip())
def IR(n): return [II() for _ in range(n)]
def LIR(n): return [LI() for _ in range(n)]
def FR(n): return [IF() for _ in range(n)]
def LFR(n): return [LI() for _ in range(n)]
def LIR_(n): return [LI_() for _ in range(n)]
def SR(n): return [S() for _ in range(n)]
def LSR(n): return [LS() for _ in range(n)]
mod = 1000000007
inf = float('INF')

#A
def A():
    s = S()
    a = s.count("-")
    b = s.count("+")
    print(b-a)
    return

#B
def B():
    n = S()
    num = sum(map(int, n))
    n = int("".join(n))
    print(["Yes", "No"][n % num > 0])
    return

#C
def C():
    n, k = LI()
    LI()
    print((n - k) // (k - 1) + 1 + bool((n - k) % (k - 1)))
    return

# D
# è§£èª¬AC
# è§£èª¬ãããã­ï¼ããã§ãããäººããï¼
# é ã«çè§£ãã¦ãã
# 1) æ¡æ°ãä¸ããã¨x/S(x)ãä¸æããã®ã¯è§£èª¬ãè¦ãã°ããã
#
# 2) ä¸ä¸æ¡ã9ã§ãããã¨ãçè§£ãã
# xã®ä¸ä¸æ¡ã9ã§ãªãã¨ãã¦
# x/S(x) - (x+1)/S(x+1) ã«ã¤ãã¦ S(x) =y ã¨ãã¦
# x/y - (x+1)/(y+1) = x/y - x/(y+1) - 1/(y+1)
#                   = x * (1/y - 1/(y+1)) - 1/(y+1)
#                   = x/y/(y+1) - 1/(y+1)
#                   = (x/y - 1)/(y+1) â (1)
# ä»æããã«x/y >= 1ãªã®ã§ (1) > 0 ã ãã
# x/y > (x+1)/(y+1)
# ãã£ã¦ä¸ä¸æ¡ã¯å¤§ããã»ããããã®ã§9ã§ãã
#
# 3)ç¹°ä¸ãããªãå ´åå¤åãããæ¡ã¯
# ã§ããã ãå°ããã»ããããã¨ãããã¨ãç¤ºã
# åã®æ°ãxã¨ãã¦iæ¡ç®ã¨i+1æ¡ç®ã«ã¤ãã¦å¤åãããã¨ããã¨
# ã©ãèãã¦ãx/S(x)ã¯S(x)ã¯åç­ã®ä¸æãã¿ããã
# å¯¾ãi+1æ¡ç®ã®ã»ããxãä¸æããããiæ¡ç®ã®
# ã»ãããããã¨ãããã 
# 
# 4) ç¢ºå®ãããæ¡ã®æ°ãå¤ãããªããã¨ãç¤ºã
# ã¤ã¾ãå¤åãããããæ¡(ããã®æ¡ãiæ¡ç®ã¨ãã¦10**(i-1)ãxã«è¶³ã
# ã¨æå°å¤ãã¨ãããã¨èãããã)ãiæ¡ç®ã¨ãã¦i-1æ¡ç®ããå°ããªæ¡
# ã«ã¤ãã¦å¤åãããæå³ããªããã¨ãç¤ºã 
# x/S(x) - (x+10^(i-1))/S(x+1) ã«ã¤ãã¦ä¸ã¨åæ§ã«ããã°
# = (x/y - 10**(i-1)) / y ãè¨ããã®ã§ 
# x/y ã 10**(i-1) ãä¸åã£ã¦ããå ´å
# ãã®æ¡ããå°ããå¤ãå¤åããã¦ãx/S(x)ãæ¸å°ããªããã¨ãããã
# x/S(x)ãxä»¥ä¸ã®æ´æ°ã§x/S(x)ãä¸çªå°ããã§ããã®ã§ããããã
# ä¸åº¦ä¸åã£ã 10**(i-1) ãx/S(x)ãä¸åããã¨ã¯ããå¾ãªã
# ãã£ã¦ãå¤åãããããæ¡ãiæ¡ç®ã¨ãã¦i-1æ¡ç®ããå°ããªæ¡
# ã«ã¤ãã¦å¤åãããæå³ããªããã¨ãããã£ã
# 
# 4)ãã®ã¾ã¾æ¯åx/yã®å¤ãè¨ç®ãã¦ããã®æ¡æ°ããè¶³ã10**(i-1)
# ãè¨ç®ãã¦ãããããå¤åãããæ¡ç®ãiæ¡ç®ã¨ãã¦i+1æ¡ç®ãå¤åããã
# ã»ããx/S(x)ãå°ãããªãã¨ããç¶æã¯
# ã¤ã¾ãx/yã10**(i-1)ãä¸åã£ãã¨ãã
# æå³ã«ãªããããã£ã¨è¨ç®éãè½ã¨ããæ¹æ³ãæ¬è§£æ³ã«ãªã 
def D():
    K = II()
    ans = 1
    i = 0
    def Sunuke(a):
        return a / sum(map(int, str(a)))
    def Check(a, i):
        return Sunuke(a + 10 ** i) > Sunuke(ans + 10 ** (i + 1))
    while K:
        print(ans)
        K -= 1
        i += Check(ans, i)
        ans += 10 ** i
    return


#Solve
if __name__ == '__main__':
    D()
```


Answer:
```java
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int k = sc.nextInt();
        long ans = 1;
        int i = 0;
        while (k > 0) {
            System.out.println(ans);
            k--;
            i += check(ans, i);
            ans += (long)Math.pow(10, i);
        }
    }

    public static int check(long a, int i) {
        double sa = (double)a / sum(a);
        double sb = (double)(a + (long)Math.pow(10, i)) / sum(a + (long)Math.pow(10, i));
        if (sa < sb) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int sum(long a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
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
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
        while (hasNextByte() &&!isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
            } else if (b == -1 ||!isPrintableChar(b)) {
                return minus? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
```


```java
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int k = sc.nextInt();
        long ans = 1;
        int i = 0;
        while (k > 0) {
            System.out.println(ans);
            k--;
            i += check(ans, i);
            ans += (long)Math.pow(10, i);
        }
    }

    public static int check(long a, int i) {
        double sa = (double)a / sum(a);
        double sb = (double)(a + (long)Math.pow(10, i)) / sum(a + (long)Math.pow(10, i));
        if (sa < sb) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int sum(long a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
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
            if (buflen > 0) {
                return true;
            } else {
                return false;
            }
        }
    private int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
        while (hasNextByte() &&!isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            n *= 10;
            n += b - '0';
        }
        return minus? -n : n;
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
```
<|endoftext|>
