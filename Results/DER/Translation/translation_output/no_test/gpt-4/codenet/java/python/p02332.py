Below is the translated Java code to Python:

```python
import sys
from math import factorial

MOD = 1000000007

class Combinatrics:
    def __init__(self, n):
        self.fact = [1] * (n + 1)
        self.inv = [1] * (n + 1)
        self.finv = [1] * (n + 1)
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

    def factorial(self, n):
        return self.fact[n]

    def fact_inv(self, n):
        return self.finv[n]

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % MOD * self.finv[n - r] % MOD

    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[n - r] % MOD

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)

def main():
    n, k = map(int, sys.stdin.readline().split())
    c = Combinatrics(k)
    print(c.permutation(k, n))

if __name__ == '__main__':
    main()
```

In Python, we don't need the `Runnable` interface, as we directly define the entry point of a Python program using `if __name__ == '__main__':`. The `FastScanner` class was also not necessary since Python has built-in functionality to read from standard input using `sys.stdin.readline()`. I removed the threading part because Python's Global Interpreter Lock (GIL) does not allow true parallelism on multicore processors when executing Python bytecode.

If you need to support multithreading in Python (for I/O-bound operations or for using extensions not affected by GIL), Python has a `threading` module, but in the given translation, a multithreading setup would not enhance performance and has been thus omitted.

Please note that in competitive programming, IO speed can be a concern; hence, Python users often use `sys.stdin.readline()` over `input()`, which is why I used it in my translation. The `print` function is used directly for output, and no special class for I/O efficiency as in the Java code is necessary.
