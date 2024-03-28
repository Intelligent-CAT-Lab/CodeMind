Here is the translated Python code corresponding to the provided Java code:

```python
import sys
from collections import defaultdict

MOD = 998244353
INF = float('inf')

def solve(n, x, d):
    if d == 0:
        if x == 0:
            return 1
        else:
            return n + 1

    if x == 0:
        return 1 + n * (n - 1) // 2

    m = defaultdict(list)

    for take in range(n + 1):
        b = take * x
        sum_ = take * (take - 1) // 2
        rsum = (n - take) * take + sum_
        c = b // d
        add(m, b % d, (c + sum_, c + rsum))

    ans = 0
    for k, v in m.items():
        v = sorted(v, key=lambda p: (p[0], p[1]))
        l = r = 0
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

    return ans

def add(m, k, v):
    m[k].append(v)

def power(a, b):
    x, y = 1, a
    while b > 0:
        if b % 2 != 0:
            x = (x * y) % MOD
        y = (y * y) % MOD
        b //= 2
    return x % MOD

def gcd(a, b):
    while a != 0:
        tmp = b % a
        b = a
        a = tmp
    return b

def main():
    input = sys.stdin.readline
    T = 1
    for _ in range(T):
        n, x, d = map(int, input().split())
        print(solve(n, x, d))

if __name__ == "__main__":
    main()
```

Explanation of changes:
- `java.util.*` classes have been replaced with their Python `collections` counterparts.
- Input and output handling has been changed to use the `sys` module and standard input/output.
- The `solve` function takes in the input parameters instead of reading them inside the function.
- The `add` function has been moved outside of the class structure and simplified.
- The sorting has been changed to use a lambda function specifying sort keys instead of a custom `Comparator`.
- `power` and `gcd` functions have been rewritten following Python syntax.
- The class structure has been removed. and `main` function has been define at module level.
- The byte-by-byte input processing functions have been removed because file I/O is different in Python.
- The Java `main` function has been converted to a Python script format that checks if the module is being run as the main program.

This Python code uses the built-in `float('inf')` to replicate Java's `Integer.MAX_VALUE` and Python's `defaultdict` to replicate Java's `HashMap`. Please note that the code snippet assumes that an equivalent input method is provided as we removed the detailed input processing from the original Java code.
