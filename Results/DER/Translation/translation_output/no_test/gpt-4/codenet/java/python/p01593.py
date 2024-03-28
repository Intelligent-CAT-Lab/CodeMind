Here is the Java code translated to Python, keeping the logic as close to the original as possible:

```python
import sys
from math import inf

class p01593:
    INF = 1 << 28
    EPS = 1e-12

    def run(self):
        self.n, self.m = map(int, input().split())
        self.solve()

    def solve(self):
        dp = [0.0] * (self.n + 1)
        dp[0] = 1.0
        for j in range(1, self.n + 1):
            for i in range(1, min(self.m, j) + 1):
                dp[j] += dp[j - i] / j
        print(f"{dp[self.n]:.12f}")

if __name__ == '__main__':
    p01593().run()
```

Some key differences to note between Java and Python:
- Python does not have explicit type declarations.
- In Python, the `main` method doesn't require a static declaration.
- Input and output are done differently; Python does not typically use a Scanner object for input.
- The formatted string printing syntax is different in Python (`f-strings` or the `format` function).
- Math functions are imported from the `math` module rather than used through static imports.
- The range function in Python is used in place of loop constructs and automatically creates a sequence of numbers.
- No need to explicitly cast the formatted double to a string in Python as the print function handles different types nicely.

