Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0??

Expected output:
-36

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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(solve(S));
    }

    public static int solve(String S) {
        Map<Character, int[]> d = new HashMap<>();
        d.put('0', new int[]{-1});
        d.put('1', new int[]{1});
        d.put('?', new int[]{-1, 1});
        int[] Sarr = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            Sarr[i] = d.get(S.charAt(i))[0];
        }
        int n0 = 0, n1 = 0, n2 = 0;
        for (int s : Sarr) {
            if (s == -1) n0++;
            else if (s == 1) n1++;
            else n2++;
        }
        int lo = -n0 - n2;
        int hi = n1 + n2;
        int best = 1000000 * 2;
        while (true) {
            int mid = (lo + hi) / 2;
            if (judge(Sarr, lo, mid)) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
            if (hi - lo < best) {
                best = hi - lo;
            } else {
                break;
            }
        }
        int ans = best;
        lo = 1;
        hi = n1 + n2;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (judge(Sarr, mid, hi)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        ans = Math.min(ans, hi - lo + 1);
        return ans;
    }

    public static boolean judge(int[] Sarr, int lo, int hi) {
        int n0 = 0, n1 = 0, n2 = 0;
        int pl = lo % 2 == 0;
        int ph = hi % 2 == 0;
        for (int s : Sarr) {
            int a = s > 0? 1 : -1;
            int b = s < 0? 1 : -1;
            int lo1 = lo + a;
            int hi1 = hi + b;
            if (pl) lo1++;
            if (ph) hi1--;
            if (hi1 < lo1) return false;
            if (s == -1) n0++;
            else if (s == 1) n1++;
            else n2++;
            pl =!pl;
            ph =!ph;
        }
        return true;
    }
}
```<|endoftext|>
