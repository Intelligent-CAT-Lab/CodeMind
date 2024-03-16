<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
mod = 10**9+7
dd = [(-1,0),(0,1),(1,0),(0,-1)]
ddn = [(-1,0),(-1,1),(0,1),(1,1),(1,0),(1,-1),(0,-1),(-1,-1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)


def main():
    n = I()
    a = [0]
    for i in range(1, 50000):
        a.append(a[-1] + i)

    t = bisect.bisect_left(a, n)
    r = [1] * t + [0] * t
    for i in range(t):
        ai = a[t-i]
        ti = t + i
        # print(n,ai,ti,''.join(map(lambda x: '()'[x], r)))
        if n < ai:
            ts = min(t, ai-n)
            r[ti],r[ti-ts] = r[ti-ts],r[ti]
            n -= t - ts
        else:
            break

    return ''.join(map(lambda x: '()'[x], r))




print(main())


```

@@ Response
```java
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static String main() throws IOException {
        int n = nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        for (int i = 1; i < 50000; i++)
            a.add(a.get(i - 1) + i);

        int t = Collections.binarySearch(a, n);
        if (t < 0)
            t = -t - 1;
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 0; i < t; i++)
            r.add(1);
        for (int i = 0; i < t; i++)
            r.add(0);

        for (int i = 0; i < t; i++) {
            int ai = a.get(t - i - 1);
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                Collections.swap(r, ti, ti - ts);
                n -= t - ts;
            } else
                break;
        }

        StringBuilder sb = new StringBuilder();
        for (int x : r)
            sb.append(x == 1 ? '(' : ')');
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(main());
    }
}
```

Please note that Java does not have built-in support for bisect_left function like Python. So, we use Collections.binarySearch() method to achieve the same functionality. Also, Java does not have a built-in swap function for lists, so we use Collections.swap() method.<｜end▁of▁sentence｜>
