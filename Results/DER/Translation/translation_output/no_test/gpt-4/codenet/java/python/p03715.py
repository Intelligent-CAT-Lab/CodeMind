Here's the translated Java code into Python:
```python
import math
import random
import sys

class p03715:
    mod = int(1e9+7)
    random.seed(0)

    # MAIN CODE
    def run(self):
        TEST_CASE = 1
        while TEST_CASE != 0:
            TEST_CASE -= 1
            h, w = map(int, input().split())
            
            print(self.dfs(3, float('inf'), float('-inf'), w, h))

    def dfs(self, d, S1, S2, w, h):
        if w <= 0 or h <= 0:
            return float('inf')
        if d == 1:
            return max(S2, w * h) - min(S1, w * h)

        ans = float('inf')
        for i in range(-1, 2):
            dw = w // d + i
            dh = h // d + i
            if dw > 0:
                ans = min(ans, self.dfs(d - 1, min(S1, dw * h), max(S2, dw * h), w - dw, h))
            if dh > 0:
                ans = min(ans, self.dfs(d - 1, min(S1, w * dh), max(S2, w * dh), w, h - dh))
        return ans
    
    # TEMPLATE
    @staticmethod
    def gcd(n, r):
        return n if r == 0 else p03715.gcd(r, n % r)

    @staticmethod
    def swap(x, i, j):
        x[i], x[j] = x[j], x[i]

    @staticmethod
    def print_array_ln(xs):
        print(*xs)

    @staticmethod
    def dump(*args):
        print(*args, file=sys.stderr)

    def main(self):
        try:
            self.run()
        except EOFError:
            pass

if __name__ == '__main__':
    obj = p03715()
    obj.main()
```

Please note that the original Java code contains a comprehensive `IOFast` class for efficient reading and writing of data, which is not directlty transferable to Python because of the differences in standard I/O handling between the languages. Python's built-in `input()` function provides the reading capability for standard input, and `print()` writes to standard output. The `sys.stderr` stream is for printing debugging information, similar to `System.err.println` in Java.

In Python, the `//` division operator is used to get integer division, the `max()` and `min()` functions are used for calculating maximum and minimum values respectively, and built-in exception handling (`try`/`except`) is used for managing the End-Of-File condition.

The `@staticmethod` decorator is used in Python to indicate that a method is a static method of the class, which does not receive an implicit first argument (the instance `self`).
