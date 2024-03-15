```python
import sys
import math

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while not self.tokenizer or not self.tokenizer.hasMoreTokens:
            try:
                self.tokenizer = iter(input().split())
            except StopIteration:
                raise RuntimeError("No more input available")
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def readLongArr(self, n):
        arr = [0] * n
        for i in range(n):
            arr[i] = self.nextLong()
        return arr

def solver(sc, out):
    n = sc.nextLong()
    sqrt = int(math.sqrt(n))
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

    print(ans)

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def main():
    sc = InputReader(sys.stdin)
    solver(sc, sys.stdout)

if __name__ == "__main__":
    main()
```

