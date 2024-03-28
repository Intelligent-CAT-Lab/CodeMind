Here is the translated Python code:

```python
import sys
import math

class Solver:

    def calc(self, n, st):
        ans = 1
        val = st
        while val < n:
            val *= 2
            ans *= 2
        return ans

    def solve(self, n, k):
        ans = 0.0
        for i in range(1, n + 1):
            cnt = self.calc(k, i)
            wk = 1 / (cnt * n)
            ans += wk
        return ans

if __name__ == "__main__":
    n, k = map(int, input().split())
    solver = Solver()
    result = solver.solve(n, k)
    print("{:.15f}".format(result))
```

This Python code defines a `Solver` class that broadly replicates the behavior of the original Java code's `Solver` class, performing the mathematical calculations. It also includes a `main` function that serves as the entry point of the program, reading input from `stdin` and printing the output formatted to fifteen decimal places (to match Java's default double precision output). Ensure that your input is provided in the same format as the Java code (space-separated integers on a single line from standard input).

Note that the Python `print` function, as used above, will ensure that the output has a fixed number of decimal places, whereas Java's `PrintWriter` may use scientific notation depending on the value being output. If you require exact formatting as in Java (which sometimes could vary depending on the implementation), you would have to implement additional formatting logic in Python.
