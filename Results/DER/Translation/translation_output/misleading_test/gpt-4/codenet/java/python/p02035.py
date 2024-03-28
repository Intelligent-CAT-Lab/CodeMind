Here is a Python equivalent of the Java code provided:

```python
from sys import stdin
from math import comb, factorial

MOD = 10 ** 9 + 7

def mod_pow(x, y, mod):
    result = 1
    while y:
        if y % 2:
            result = result * x % mod
        y //= 2
        x = x * x % mod
    return result

def solve(n, m):
    mod = m
    ans = 0
    exp2_vals = [mod_pow(2, i, mod) for i in range(n+1)]
    fact = [1] * (n+1)
    for i in range(1, n+1):
        fact[i] = fact[i-1] * i % mod

    for r in range(1, n):
        b = n - r
        t = comb(n, r, exact=True) % mod
        t = t * mod_pow(2, r * (r - 1) // 2, mod) % mod
        t = t * mod_pow(2, b * (b - 1) // 2, mod) % mod
        p = 0
        for i in range(b+1):
            if i % 2 == 0:
                p += comb(b, i, exact=True) * mod_pow(exp2_vals[b - i] - 1, r, mod) % mod
                p %= mod
            else:
                p -= comb(b, i, exact=True) * mod_pow(exp2_vals[b - i] - 1, r, mod) % mod
                p += mod
                p %= mod
        t = t * p % mod
        ans = (ans + t) % mod
    return ans

def main():
    n, m = map(int, stdin.readline().split())
    ans = solve(n, m)
    print(ans)

if __name__ == "__main__":
    main()
```

The above Python code expects standard input in the format specified in the test case. You can run the test case by adding the following at the bottom of the script and running the Python code with the provided input:

```python
input_str = '3 310779401\n'
stdin = io.StringIO(input_str)
main()
```

Remember to import `io` at the beginning of the script for `StringIO` to work. This would emulate the input and should give you the expected output.
