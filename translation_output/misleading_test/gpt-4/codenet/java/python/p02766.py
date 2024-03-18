Here is the translated Python code based on the provided Java code:

```python
import math
import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.buffer = ""

    def read(self):
        if len(self.buffer) == 0:
            self.buffer = self.stream.readline()
        if len(self.buffer) == 0:
            return None
        result = self.buffer[0]
        self.buffer = self.buffer[1:]
        return result

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        b = self.read()
        while b and b not in "0123456789+-":
            b = self.read()
        sign = 1
        if b == "-":
            sign = -1
            b = self.read()
        ret = 0
        while b and b.isdigit():
            ret = ret * 10 + int(b)
            b = self.read()
        return ret * sign

class p02766:
    def __init__(self):
        self.MOD = int(1e9) + 7
        self.in_scanner = FastScanner()
        self.out = sys.stdout  # Use stdout for output

    def ceil(self, a, b):
        return (a + b - 1) // b

    def gcd(self, a, b):
        return b if a == 0 else self.gcd(b % a, a)

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def solve(self):
        N = self.in_scanner.next_int()
        K = self.in_scanner.next_int()
        base = 1
        cnt = 0
        while base <= N:
            cnt += 1
            base *= K
        self.out.write(str(cnt) + '\n')

if __name__ == '__main__':
    prog = p02766()
    prog.solve()
```

Python's standard input/output handling is much simpler, and many utility methods that were required in Java are already available in the Python standard library (e.g., `math.gcd`, `math.ceil`, though these methods are not used in the actual solution).

Make sure to run this script in an environment where it can read inputs from stdin and write outputs to stdout. If you want to handle files or other input/output redirections, you would have to adjust the script accordingly.
