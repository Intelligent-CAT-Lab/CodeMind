

```python
import sys

def solve(in, out, ms):
    out.write(in.next() == "ani" and "square1001" or "e869120")

class Methods:
    def print(self, *ar):
        print(ar, file=sys.stderr)

    def yesno(self, out, b):
        out.write(b and "Yes" or "No")

    def YESNO(self, out, b):
        out.write(b and "YES" or "NO")

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def gcd(self, a, b):
        return b and self.gcd(b, a % b) or a

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def factorial(self, i):
        return i == 1 and 1 or i * self.factorial(i - 1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)

    def euclid(self, x1, y1, x2, y2):
        return (x2 - x1) ** 2 + (y2 - y1) ** 2

    def isPrime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(n ** 0.5) + 1, 2):
            if n % i == 0:
                return False
        return True


class FastScanner:
    def __init__(self, stream):
        self.in = stream
        self.buffer = [0] * 1024
        self.length = 0
        self.p = 0

    def hasNextByte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.in.readinto(self.buffer)
            except Exception as e:
                print(e, file=sys.stderr)
            if self.length <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.p]
        return -1

    def isPrintable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.hasNextByte() and not self.isPrintable(self.buffer[self.p]):
            self.p += 1

    def hasNext(self):
        self.skip()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise Exception("No more tokens")
        sb
