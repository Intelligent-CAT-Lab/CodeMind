Here is the Python equivalent of the Java code:

```python
import sys

mod = 998244353

def calc(n, m):
    if n == m:
        return 1
    if n == m - 1:
        return 9
    return 9 * calc(n + 1, m)

def solve(n):
    n = n // 2
    res = 7
    p2 = 8
    num = 1
    den = 2
    for i in range(1, n):
        res *= 9
        if i > 1:
            inc = p2
            inc *= num
            inc %= mod
            inc *= pow(den, mod - 2, mod)
            inc %= mod
            res += inc
        res %= mod
        p2 = (p2 * 2) % mod
        num *= 2 * i
        num %= mod
        num *= 2 * i + 1
        num %= mod
        if i > 1:
            den *= i - 1
        den %= mod
        den *= i + 2
        den %= mod
    return res

n = int(sys.stdin.readline())
print(solve(n))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the result using the `solve` function, and prints the result to the standard output. The `solve` function calculates the result using the `calc` function, which is a recursive function that calculates the number of ways to choose `n` elements from a set of `2n` elements. The `pow` function is a Python built-in function that calculates the power of a number with modulo.
