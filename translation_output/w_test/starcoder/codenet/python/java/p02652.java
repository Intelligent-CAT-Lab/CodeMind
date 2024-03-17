<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0??

Expected output:
1


```

def bisect(ng, ok, judge):
    while abs(ng-ok) > 1:
        m = (ng+ok)//2
        if judge(m):
            ok = m
        else:
            ng = m
    return ok

def solve(S):
    d = {'0':0,'1':1,'?':2}
    S = tuple(d[c] for c in S)
    lookup = ((-1,-1),(1,1), (-1,1))

    def judge(target_lo, target_hi):
        lo,hi = 0,0
        pl = target_lo%2 == 0
        ph = target_hi%2 == 0
        for s in S:
            a,b = lookup[s]
            lo = max(lo+a, target_lo+pl)
            hi = min(hi+b, target_hi-ph)
            if hi < lo:
                return False
            pl = not pl
            ph = not ph
        return True

    best = 10**6*2
    n0,n1,n2 = S.count(0), S.count(1), S.count(2)
    lo = -n0-n2
    hi = n1+n2
    while True:
        hi = bisect(-1, hi, lambda x: judge(lo, x))
        lo = bisect(1, lo, lambda x: judge(x, hi))
        if hi-lo >= best:
            break
        else:
            best = hi-lo
    hi += 1
    lo = bisect(1, lo, lambda x: judge(x, hi))
    return min(best, hi-lo)

# from itertools import product, accumulate
# from random import shuffle

# def naive(S):
#     d = {'0':(-1,), '1':(1,), '?': (-1,1)}
#     return min(max(0,max(accumulate(X)))-min(0,min(accumulate(X))) for X in product(*(d[c] for c in S)))

if __name__ == '__main__':
    S = input()
    print(solve(S))

    # for _ in range(50):
    #     S = ['0']*15+['1']*15+['?']*14
    #     shuffle(S)
    #     S = ''.join(S)
    #     print(S, naive(S), solve(S))
```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        int[] d = new int[3];
        d[0] = -1;
        d[1] = 1;
        d[2] = -1;
        int n0 = 0, n1 = 0, n2 = 0;
        for (char c : S.toCharArray()) {
            if (c == '0') n0++;
            if (c == '1') n1++;
            if (c == '?') n2++;
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        while (true) {
            int mid = (lo + hi) / 2;
            if (judge(lo, mid)) {
                hi = mid;
            } else {
                lo = mid;
            }
            if (hi - lo < 2) break;
        }
        return hi - lo;
    }

    public static boolean judge(int lo, int hi) {
        int n0 = 0, n1 = 0, n2 = 0;
        int[] d = new int[3];
        d[0] = -1;
        d[1] = 1;
        d[2] = -1;
        for (char c : S.toCharArray()) {
            if (c == '0') n0++;
            if (c == '1') n1++;
            if (c == '?') n2++;
        }
        int target_lo = lo;
        int target_hi = hi;
        int pl = target_lo % 2 == 0;
        int ph = target_hi % 2 == 0;
        for (char c : S.toCharArray()) {
            int a = d[c - '0'][0];
            int b = d[c - '0'][1];
            target_lo = Math.max(target_lo + a, lo + pl);
            target_hi = Math.min(target_hi + b, hi - ph);
            if (target_hi < target_lo) return false;
            pl =!pl;
            ph =!ph;
        }
        return true;
    }
}
```
<|endoftext|>
