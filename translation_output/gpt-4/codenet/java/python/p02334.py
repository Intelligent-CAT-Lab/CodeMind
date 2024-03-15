Here is the translated Python code from Java to Python:

```python
import sys

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

    def combination(self, n, r):
        if n < r or r < 0:
            return 0
        return self.fact[n] * self.finv[r] % MOD * self.finv[n - r] % MOD

    def homogeneous(self, n, r):
        if n == 0 and r == 0:
            return 1
        return self.combination(n + r - 1, r)


def main():
    input_ = lambda: sys.stdin.readline().strip()
    n, k = map(int, input_().split())
    c = Combinatrics(n + k - 1)
    print(c.homogeneous(k, n))


if __name__ == "__main__":
    main()
```

In this translation, the original Java code's threading is not used in the Python translation, as Python has the Global Interpreter Lock (GIL), which means that CPU-bound Python threads often won't run in parallel anyway. However, if parallelism is needed, then you might want to explore other mechanisms in Python such as multiprocessing, async/await, or third-party libraries.

The input-reading `FastScanner` class from Java has been replaced with a simple lambda that reads and strips the input from standard input using `sys.stdin.readline().strip()`. This should suffice for competitive programming problems where input reading speed is crucial.

Note that in Python 3, integer division automatically converts to float. Therefore, division like `MOD // i` is used to get the floor division as in Java.
