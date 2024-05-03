Here is the Python equivalent of the Java code:

```python
import sys

class Solver:
    def __init__(self):
        self.inp = sys.stdin.readline
        self.out = sys.stdout.write
        self.err = sys.stderr.write

    def ni(self):
        return int(self.inp().strip())

    def nl(self):
        return list(map(int, self.inp().strip().split()))

    def solve(self):
        a = self.ni()
        b = self.ni()
        self.out(str(max(a + b, a - b, a * b)) + '\n')

solver = Solver()
solver.solve()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the maximum of the sum of the two numbers, the difference of the two numbers, and the product of the two numbers, and then writes the result to the standard output.
