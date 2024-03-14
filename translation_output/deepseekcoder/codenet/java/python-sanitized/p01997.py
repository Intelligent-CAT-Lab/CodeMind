import sys
import math

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.length = 0
        self.p = 0

    def has_next_byte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.stream.readinto(self.buffer)
            except Exception:
                self.length = 0
            if self.length <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.p]
        return -1

    def is_printable(self, n):
        return 33 <= n and n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buffer[self.p]):
            self.p += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        s = []
        t = self.read_byte()
        while self.is_printable(t):
            s.append(chr(t))
            t = self.read_byte()
        return "".join(s)

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

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
        return a * b // self.gcd(a, b)

    def factorial(self, i):
        if i == 1:
            return 1
        else:
            return i * self.factorial(i - 1)

    def manhat(self, x1, y1, x2, y2):