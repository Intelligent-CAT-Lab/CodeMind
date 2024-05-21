import sys

class Methods:
    def print(self, *args):
        print(*args)

    def yesno(self, out, b):
        out.write("Yes" if b else "No")
        out.write("\n")

    def YESNO(self, out, b):
        out.write("YES" if b else "NO")
        out.write("\n")

    def max(self, *args):
        return max(args)

    def min(self, *args):
        return min(args)

    def gcd(self, a, b):
        if b == 0:
            return a
        else:
            return self.gcd(b, a % b)

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
    def __init__(self, inp):
        self.inp = inp
        self.buffer = bytearray(1024)
        self.length = 0
        self.p = 0

    def hasNextByte(self):
        if self.p < self.length:
            return True
        else