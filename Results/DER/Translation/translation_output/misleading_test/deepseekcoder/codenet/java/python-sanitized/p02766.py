import sys

class p02766:
    def __init__(self):
        self.inp = sys.stdin
        self.out = sys.stdout
        self.MOD = (10 ** 9) + 7

    def ceil(self, a, b):
        return (a + b - 1) // b

    def gcd(self, a, b):
        return b if a % b == 0 else self.gcd(b, a % b)

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def solve(self):
        N, K = map(