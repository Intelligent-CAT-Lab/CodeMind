Here is the Python equivalent of the Java code:

```python
import sys

def modpow(a, n, mod):
    res = 1
    while n > 0:
        if (n & 1) == 1:
            res = res * a % mod
        a = a * a % mod
        n >>= 1
    return res

def solve():
    n = int(input())
    mod = 1000000007
    total = modpow(10, n, mod)
    partial = 2 * modpow(9, n, mod)
    both = modpow(8, n, mod)
    ans = (total - partial + both) % mod
    ans = (ans + mod) % mod
    print(ans)

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the total, partial, and both values, and then prints the result. The `modpow` function is a Python equivalent of the Java `modpow` function. The `solve` function is the main function that performs the calculations and prints the result. The `if __name__ == "__main__":` block is used to call the `solve` function when the script is run directly.
