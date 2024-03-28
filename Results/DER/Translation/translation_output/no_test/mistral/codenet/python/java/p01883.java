<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    static int n;
    static int[] a;
    static int[] r;
    static int mod = 1000000007;
    static int inf = 10000000000000000000L;
    static double eps = 1.0 / 10000000000000000000.0;
    static List<Integer> dd = Arrays.asList(new int[]{-1, 0}, new int[]{0, 1}, new int[]{1, 0}, new int[]{0, -1});
    static List<Integer> ddn = Arrays.asList(new int[]{-1, 0}, new int[]{-1, 1}, new int[]{0, 1}, new int[]{1, 1}, new int[]{1, 0}, new int[]{1, -1}, new int[]{0, -1}, new int[]{-1, -1});

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[50000];
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }
        int t = bisect.bisect_left(a, n);
        r = new int[t + 1];
        Arrays.fill(r, 1);
        for (int i = t; i >= 0; i--) {
            int ai = a[t - i];
            int ti = t + i;
            // System.out.println(n, ai, ti, Arrays.toString(r));
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r[ti] = r[ti - ts];
                r[ti - ts] = r[ti];
                n -= t - ts;
            } else {
                break;
            }
        }
        String ans = "";
        for (int i = 0; i <= t; i++) {
            ans += (r[i] == 1) ? "(" : ")";
        }
        System.out.println(ans);
    }
}
```</s>
