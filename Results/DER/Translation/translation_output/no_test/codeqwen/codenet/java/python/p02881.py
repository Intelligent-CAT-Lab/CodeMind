Here is the Python version of your Java code:

```python
import math

def solver(sc, out):
    n = sc.nextLong()
    sqrt = math.isqrt(n)
    x, y = 0, 0
    for i in range(sqrt, 0, -1):
        if n % i == 0:
            x = i
            y = n // i
            break
    ans = 0
    if x != 0 and y != 0:
        ans = (x - 1) + (y - 1)
    else:
        ans = n - 1
    out.write(str(ans) + '\n')

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

class Pair:
    def __init__(self, x, s):
        self.x = x
        self.s = s

    def __lt__(self, other):
        return self.x < other.x

class InputReader:
    def __init__(self, stream):
        self.reader = stream.readline
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = self.reader().split()
            except EOFError:
                raise RuntimeError("Input stream closed")
        return self.tokenizer.pop(0)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def readLongArr(self, n):
        return [self.nextLong() for _ in range(n)]

    def readIntArr(self, n):
        return [self.nextInt() for _ in range(n)]

if __name__ == "__main__":
    import sys
    solver(InputReader(sys.stdin), sys.stdout)
```

Please note that Python does not have a built-in `Math.sqrt()` function that returns the integer part of the square root. Instead, you can use `math.
