<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int inf = (int)1e20;
    static int mod = (int)1e9+7;
    static int[] dd = {-1, 0, 1, 0, 0, -1, -1, 1, 1};
    static int[] ddn = {-1, 0, 1, 0, -1, -1, 1, 1, -1, 0, 0, -1};

    static int I() {
        return new Scanner(System.in).nextInt();
    }

    static String S() {
        return new Scanner(System.in).next();
    }

    static void pf(String s) {
        System.out.println(s);
    }

    static String main() {
        int n = I();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        for (int i = 1; i < 50000; i++) {
            a.add(a.get(a.size()-1) + i);
        }

        int t = Collections.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }
        ArrayList<Integer> r = new ArrayList<>(Collections.nCopies(t, 1));
        r.addAll(Collections.nCopies(t, 0));
        for (int i = 0; i < t; i++) {
            int ai = a.get(t-i);
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai-n);
                int temp = r.get(ti);
                r.set(ti, r.get(ti-ts));
                r.set(ti-ts, temp);
                n -= t - ts;
            } else {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2*t; i++) {
            sb.append((r.get(i) == 1) ? '(' : ')');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        pf(main());
    }
}
```

Please note that Java does not have built-in functions for binary search and array manipulation like Python's bisect and array. Also, Java does not have a built-in equivalent to Python's map function. Instead, we use a for loop to iterate over the list and apply the function to each element.
<|EOT|>
