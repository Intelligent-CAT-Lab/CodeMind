System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
201

Expected output:
701


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


Answer:
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
        int t = (int)Math.pow(10, l);
        for (int i = 0; i < Math.pow(10, l); i++) {
            List<Integer> list = new ArrayList<>();
            int tmp = i;
            for (int j = 0; j < l; j++) {
                list.add(tmp % 10);
                tmp /= 10;
            }
            Collections.shuffle(list);
            int b = 0;
            for (int j = 0; j < l; j++) {
                b = b * 10 + list.get(j);
            }
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < l; j++) {
                    sb.append(list.get(j));
                }
                r = sb.toString();
            }
        }
        System.out.println(r);
    }
}
```<|endoftext|>
