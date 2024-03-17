<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1-(2+3-4+5)

Expected output:
5


```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time,copy,functools

sys.setrecursionlimit(10**7)
inf = 10**20
eps = 1.0 / 10**13
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
    s = S()
    fm = {}

    a = []
    for c in s:
        if '0' <= c <= '9':
            ci = int(c)
            if len(a) > 0 and isinstance(a[-1], int):
                a[-1] = a[-1] * 10 + ci
            else:
                a.append(ci)
        else:
            a.append(c)

    def f(a):
        key = tuple(a)
        if key in fm:
            return fm[key]
        if len(a) == 2:
            fm[key] = [inf,-inf]
            return [inf,-inf]
        for i in range(len(a)):
            if a[i] != '(':
                if i > 0:
                    a = a[i:]
                break
        for i in range(len(a)-1,-1,-1):
            if a[i] != ')':
                a = a[:i+1]
                break
        if len(a) == 1:
            r = [a[0],a[0]]
            fm[key] = r
            return r

        ri = [inf]
        ra = [-inf]
        l = len(a)
        for i in range(1,len(a)-1):
            if not a[i] in ['+','-'] or (i > 1 and a[i-2] == '(') or (i+2 < l and a[i+2] == ')'):
                continue
            fl = f(a[:i])
            fr = f(a[i+1:])
            if a[i] == '+':
                ri.append(fl[0]+fr[0])
                ra.append(fl[1]+fr[1])
            else:
                ri.append(fl[0]-fr[1])
                ra.append(fl[1]-fr[0])

        r = [min(ri), max(ra)]
        fm[key] = r
        return r

    r = f(a)
    # print(r)
    # for k in sorted(fm.keys(), key=lambda x: [len(str(x)), str(x)]):
    #     print('k,fm[k]', ''.join(map(str,k)),fm[k])
    return r[1]


print(main())


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] result = new int[2];
        Map<String, Integer[]> fm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                a[i] = a[i] * 10 + a[i - 1];
            } else {
                a[i] = a[i];
            }
        }
        result = f(a);
        System.out.println(result[1]);
    }

    public static int[] f(int[] a) {
        String key = Arrays.toString(a);
        if (fm.containsKey(key)) {
            return fm.get(key);
        }
        if (a.length == 2) {
            fm.put(key, new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE});
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != '(') {
                if (i > 0) {
                    a = Arrays.copyOfRange(a, i, a.length);
                }
                break;
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != ')') {
                a = Arrays.copyOfRange(a, 0, i + 1);
                break;
            }
        }
        if (a.length == 1) {
            return new int[]{a[0], a[0]};
        }
        int[] ri = new int[2];
        int[] ra = new int[2];
        int len = a.length;
        for (int i = 1; i < len - 1; i++) {
            if (a[i] != '+' && a[i] != '-' && (i > 1 && a[i - 2] == '(') || (i + 2 < len && a[i + 2] == ')')) {
                continue;
            }
            int[] fl = f(Arrays.copyOfRange(a, 0, i));
            int[] fr = f(Arrays.copyOfRange(a, i + 1, len));
            if (a[i] == '+') {
                ri[0] = fl[0] + fr[0];
                ra[0] = fl[1] + fr[1];
            } else {
                ri[0] = fl[0] - fr[1];
                ra[0] = fl[1] - fr[0];
            }
        }
        ri[1] = Math.min(ri[0], ra[0]);
        ra[1] = Math.max(ri[0], ra[0]);
        fm.put(key, new int[]{ri[1], ra[1]});
        return new int[]{ra[1], ri[1]};
    }
}
```</s>
