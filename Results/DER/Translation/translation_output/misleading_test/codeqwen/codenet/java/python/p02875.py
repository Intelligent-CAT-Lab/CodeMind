Here is the Python equivalent of the Java code:

```python
import sys

mod = 998244353

def pow(x, y):
    x %= mod
    res = 1
    while y > 0:
        if y % 2 == 1:
            --y
            res = (res * x) % mod
        else:
            y /= 2
            x = (x * x) % mod
    return res

n = int(sys.stdin.readline()) // 2
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
        inc *= pow(den, mod - 2)
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
print(res)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the result, and prints it to the standard output. The `pow` function is a Python equivalent of the `pow` function in Java. It calculates the power of a number modulo `mod`. The rest of the code is the same as the Java code.
