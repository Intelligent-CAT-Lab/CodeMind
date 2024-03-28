<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
201

Expected output:
764

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
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        String r = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l1 = 0; l1 < 10; l1++) {
                        for (int l2 = 0; l2 < 10; l2++) {
                            for (int l3 = 0; l3 < 10; l3++) {
                                for (int l4 = 0; l4 < 10; l4++) {
                                    for (int l5 = 0; l5 < 10; l5++) {
                                        for (int l6 = 0; l6 < 10; l6++) {
                                            int a = i * 1000000 + j * 100000 + k * 10000 + l1 * 1000 + l2 * 100 + l3 * 10 + l4;
                                            int b = l5 * 1000000 + l6 * 100000 + a;
                                            int tm = Math.max(Math.abs(n - b), Math.abs(n - b) + 10000000);
                                            if (m > tm) {
                                                m = tm;
                                                r = l4 + "" + l3 + "" + l2 + "" + l1 + "" + k + "" + j + "" + i;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(r);
    }
}
```
<|endoftext|>
