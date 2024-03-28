Below is the Java code translated into Python:

```python
import sys
import math
from io import BytesIO, IOBase


MOD = 1000000007


class Combinatorics:
    def __init__(self, n):
        N = max(2, n + 1)
        self.fact = [1] * N
        self.inv = [1] * N
        self.finv = [1] * N
        self.fact[0] = self.fact[1] = 1
        self.finv[0] = self.finv[1] = 1
        self.inv[1] = 1
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % MOD
            self.inv[i] = MOD - self.inv[MOD % i] * (MOD // i) % MOD
            self.finv[i] = self.finv[i - 1] * self.inv[i] % MOD

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


class FastScanner:
    def __init__(self):
        self.input = sys.stdin
        self.buffer = bytearray()
        self.pos = 0

    def read(self):
        while not self.buffer:
            try:
                data = self.input.read(1024)
                if not data:
                    raise EOFError()
                self.buffer.extend(data)
            except Exception as e:
                print(e)
                break
        self.pos = 0

    def readline(self):
        self.read()
        pos = self.buffer.find(b'\n', self.pos)
        if pos == -1:
            return
        line = self.buffer[self.pos:pos]
        self.pos = pos+1
        return line

    def nextint(self):
        return int(self.readline())

    def next(self):
        return self.readline().decode().strip()

    def nextarray(self, n, dtype=int):
        return [dtype(x) for x in self.next().split()][:n]

def main():
    fs = FastScanner()
    n, k = fs.nextarray(2)
    c = Combinatorics(n - 1)
    print(c.homogeneous(k, n - k))

if __name__ == "__main__":
    main()
```

Notes on the Python version in comparison to the Java version:
- Python does not have static typing; thus type information is omitted.
- Python does not have a separate `Thread` class to start a new thread for the main function; instead, the main function is called directly.
- The `FastScanner` class is adapted for Python's different methods for reading inputs.
- Since there is no `System.out.println()`, `print()` is used in Python to output the result.
- The `mod` operations are the same in both languages, ensuring that the calculations remain within the limits of integer values to avoid overflow.
- Python integers have arbitrary precision, and thus there is no need for explicit range checks for `nextInt` as are done in Java's `FastScanner`. However, the Python version of `FastScanner` here is a simplified adaptation and should be adjusted according to the expected input for real-world use cases.
- The `Combinatorics` class methods don't require casting to `int` since there is no distinction between integer types of different sizes in Python.
