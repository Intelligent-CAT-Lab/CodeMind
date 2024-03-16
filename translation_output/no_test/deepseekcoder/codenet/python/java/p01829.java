<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    static int inf = 1000000000;
    static int mod = 998244353;
    static int[] dd = {0,-1,0,1,0};
    static int[] ddn = {0,-1,-1,0,1,1,0,-1,-1};

    static String s;
    static int l;
    static int n;
    static int m = inf;
    static String r = "";
    static int t;

    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        s = in.next();
        l = s.length();
        n = Integer.parseInt(s);
        t = (int)Math.pow(10, l);
        permutation(new int[l], new boolean[10], 0);
        System.out.println(r);
    }

    static void permutation(int[] a, boolean[] used, int idx) {
        if (idx == l) {
            int b = 0;
            for (int i = 0; i < l; i++) {
                b = b * 10 + a[i];
            }
            int tm = Math.max(Math.abs(n-b), t-Math.abs(n-b));
            if (m > tm) {
                m = tm;
                r = Arrays.toString(a).replaceAll("[\\[\\], ]", "");
            }
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!used[i]) {
                a[idx] = i;
                used[i] = true;
                permutation(a, used, idx + 1);
                used[i] = false;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, calculates the closest number by rearranging its digits, and prints the rearranged digits. The `permutation` function generates all permutations of the digits and checks each one to see if it is closer to the original number than the current best solution.
<|EOT|>
