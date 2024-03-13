import sys
import math

class Methods:
    def print(self, *ar):
        print(ar)

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def gcd(self, a, b):
        return math.gcd(a, b)

    def lcm(self, a, b):
        return abs(a*b) // math.gcd(a, b)

    def factorial(self, i):
        if i == 1:
            return 1
        else:
            return i * self.factorial(i-1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1-x2) + abs(y1-y2)

    def euclid(self, x1, y1, x2, y2):
        return math.sqrt((x2-x1)**2 + (y2-y1)**2)

    def isPrime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True

class FastScanner:
    def __init__(self, stream):
        self.stream = stream

    def hasNextByte(self):
        return self.stream.read(1) != b''

    def readByte(self):
        return ord(self.stream.read(1))

    def isPrintable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.hasNextByte() and not self.isPrintable(self.readByte()):
            pass

    def hasNext(self):
        self.skip()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        temp = self.readByte()
        while self.isPrintable(temp):
            yield chr(temp)
            temp = self.readByte()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())