Here's a Python translation of the provided Java code:

```python
import sys
import math

MOD = 1_000_000_007


def main():
    x, y = map(int, sys.stdin.readline().split())
    if (2 * y - x) % 3 != 0 or (2 * y - x) < 0:
        print(0)
        return
    a = (2 * y - x) // 3
    if (2 * x - y) % 3 != 0 or (2 * x - y) < 0:
        print(0)
        return
    b = (2 * x - y) // 3
    fif = enum_fif(3000000, MOD)
    print(C(a + b, a, MOD, fif))


def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod


def enum_fif(n, mod):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod

    a = f[n]
    b = mod
    p = 1
    q = 0
    while b > 0:
        c = a // b
        a, b = b, a % b
        p, q = q, p - c * q

    invf[n] = p + mod if p < 0 else p
    for i in range(n - 1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod

    return [f, invf]


if __name__ == "__main__":
    main()
```

This code is a straight translation with some differences due to the nature of Python:
- Java's input mechanism has been replaced with Python's `sys.stdin.readline`.
- The modulo inverse computation logic has been adapted to use Python's tuple swapping and floor division.
- The arrays are pre-sized in Python, removing the need for dynamic array expansion.
- Array copying in the `enumFIF` method is not required as list slicing in Python inherently creates a new list.
- The 'main' function encapsulates the program logic, with a `if __name__ == "__main__":` guard to make the script executable.

Please be aware that Python requires significant indentation to interpret code blocks, unlike Java which uses braces. The indentation in the provided code must be preserved to maintain the logical structure.

This code should be run in an environment where the input values are provided to the standard input, similar to how the Java code would be executed.
