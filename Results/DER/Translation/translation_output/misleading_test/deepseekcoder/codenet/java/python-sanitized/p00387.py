import sys

class Methods:

    def print(self, *ar):
        print(ar)

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def gcd(self, a, b):
        return a if b == 0 else self.gcd(b, a % b)

    def lcm(self, a, b):
        return a * b // self.gcd(a, b)

    def factorial(self, n):
        return 1 if n == 1 else n * self.factorial(n - 1)

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

    def __init__(self, inp=sys.stdin):
        self.inp = inp

    def next(self):
        return self.inp.readline().rstrip()

    def next_int(self):
        return int(self.next())

    def next_int_array(self, n):
        return [int(x) for x in self.next().split()]

    def next_long(self):
        return long(self.next())

    def next_long_array(self, n):
        return [long(x) for x in self.next().split()]

    def next_double(self):
        return float(self.next())

    def next_double_array(self, n):
        return [float(x) for x in self.next().split()]


def solve(inp, out, ms):
    a = inp.next_int()