<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
    static int bisect(int ng, int ok, Judge judge) {
        while (Math.abs(ng-ok) > 1) {
            int m = (ng+ok) / 2;
            if (judge.judge(m)) {
                ok = m;
            } else {
                ng = m;
            }
        }
        return ok;
    }

    static int solve(String S) {
        Map<Character, Integer> d = new HashMap<>();
        d.put('0', 0);
        d.put('1', 1);
        d.put('?', 2);
        char[] c = S.toCharArray();
        Integer[] s = new Integer[c.length];
        for (int i = 0; i < c.length; i++) {
            s[i] = d.get(c[i]);
        }
        int[][] lookup = {{ -1, -1}, {1, 1}, { -1, 1}};

        Judge judge = new Judge(s, lookup);

        int best = 1000000 * 2;
        int n0 = (int) Arrays.stream(s).filter(i -> i == 0).count();
        int n1 = (int) Arrays.stream(s).filter(i -> i == 1).count();
        int n2 = (int) Arrays.stream(s).filter(i -> i == 2).count();
        int lo = -n0-n2;
        int hi = n1+n2;
        while (true) {
            hi = bisect(-1, hi, judge);
            lo = bisect(1, lo, judge);
            if (hi-lo >= best) {
                break;
            } else {
                best = hi-lo;
            }
        }
        hi += 1;
        lo = bisect(1, lo, judge);
        return Math.min(best, hi-lo);
    }

    public static void main(String[] args) {
        String S = new Scanner(System.in).next();
        System.out.println(solve(S));
    }
}

interface Judge {
    boolean judge(int x);
}
```

This Java code is a direct translation of the Python code. It uses Java's built-in functional interfaces and lambda expressions to implement the `Judge` interface, which is used in the `bisect` function. The `solve` function is also translated, using Java's Stream API to count the number of 0s, 1s, and ?s in the string. The main function reads the input string and prints the result of the `solve` function.
<|EOT|>
