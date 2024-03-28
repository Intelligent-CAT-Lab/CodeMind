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

    def is_prime(self, n):
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

    def has_next_byte(self):
        if self.stream.readable():
            return True
        else:
            return False

    def read_byte(self):
        if self.has_next_byte():
            return self.stream.read(1)
        else:
            return None

    def is_printable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(ord(self.read_byte())):
            pass

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        temp = self.read_byte()
        while self.is_printable(ord(temp)):
            temp = self.read_byte()
        return temp

    def next_int(self):
        return int(