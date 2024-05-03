Here is the Python equivalent of the Java code:

```python
import sys

MOD = 998244353
INF = int(1e18)

def solve():
    n, x, d = map(int, input().split())
    if d == 0:
        if x == 0:
            print(1)
            return
        else:
            print(n + 1)
            return

    if x == 0:
        print(1 + n * (n - 1) // 2)
        return

    m = {}

    for take in range(n + 1):
        b = take * x
        sum_ = take * (take - 1) // 2
        rsum = (n - take) * take + sum_
        c = b // d
        if c not in m:
            m[c] = []
        m[c].append((sum_, rsum))

    ans = 0
    for k in m:
        v = sorted(m[k], key=lambda x: x[0])
        l, r = 0, 0
        f = False
        for p in v:
            if not f:
                f = True
                l, r = p
            else:
                if p[0] <= r:
                    r = max(r, p[1])
                else:
                    ans += r - l + 1
                    l, r = p
        ans += r - l + 1

    print(ans)

solve()
```

This Python code does the same thing as the Java code. It reads the input, calculates the result, and prints it. The main difference is that Python uses different syntax and data structures than Java. For example, Python uses `map` to convert a list of strings to a list of integers, and Python uses `sorted` to sort a list of tuples.
