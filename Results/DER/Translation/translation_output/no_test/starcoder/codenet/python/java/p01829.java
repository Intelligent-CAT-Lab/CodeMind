<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**10
mod = 998244353
dd = [(0,-1),(1,0),(0,1),(-1,0)]
ddn = [(0,-1),(1,-1),(1,0),(1,1),(0,1),(-1,-1),(-1,0),(-1,1)]

def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x)-1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def I(): return int(sys.stdin.readline())
def F(): return float(sys.stdin.readline())
def S(): return input()
def pf(s): return print(s, flush=True)


def main():
    s = S()
    l = len(s)
    n = int(s)
    m = inf
    r = 0
    t = 10**l
    for a in itertools.permutations(range(10), l):
        b = 0
        for c in a:
            b = b * 10 + c
        tm = max(abs(n-b),t-abs(n-b))
        if m > tm:
            m = tm
            r = ''.join(map(str,a))

    return r


print(main())



```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        String r = "";
        int t = (int) Math.pow(10, l);
        for (int[] a : new int[10][l]) {
            int b = 0;
            for (int i = 0; i < l; i++) {
                b = b * 10 + a[i];
            }
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                r = "";
                for (int i = 0; i < l; i++) {
                    r += a[i];
                }
            }
        }
        System.out.println(r);
    }
}
```
<|endoftext|>
