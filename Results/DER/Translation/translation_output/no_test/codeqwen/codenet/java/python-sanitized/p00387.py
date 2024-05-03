import sys

class Methods:
    def print(self, *args):
        print(*args)

    def max(self, *args):
        return max(args)

    def min(self, *args):
        return min(args)

    def gcd(self, a, b):
        if b > 0:
            return self.gcd(b, a % b)
        else:
            return a

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def factorial(self, i):
        if i == 1:
            return 1
        else:
            return i * self.factorial(i - 1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)

    def euclid(self, x1, y1, x2, y2):
        return ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 0.5

    def is_prime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(n ** 0.5) + 1, 2):
            if n % i == 0:
                return False
        return True


class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.in_ = stream
        self.buffer = bytearray(1024)
        self.length = 0
        self.p = 0

    def has_next_byte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.in_.readinto(self.buffer)
            except Exception as e:
                e.print_traceback()
            if self.length <= 0:
                return False