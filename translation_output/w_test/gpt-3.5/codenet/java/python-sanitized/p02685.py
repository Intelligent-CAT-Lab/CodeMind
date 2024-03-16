import sys
from math import *


class p02685:
    def modPow(self, a, p, m):
        if a == 1:
            return 1
        ans = 1
        while p > 0:
            if p % 2 == 1:
                ans = (ans * a) % m
            a = (a * a) % m
            p >>= 1
        return ans

    def modInv(self, a, m):
        return self.modPow(a, m - 2, m)

    def run(self):
        # sc = InputReader(sys.stdin)  # Uncomment this line if InputReader class is defined
        sc = InputReader(sys.stdin)

        n = int(sc.nextInt())
        m = int(sc.nextLong())
        k = int(sc.nextLong())
        ans = 0
        fact = [0] * (n + 1)
        ifact = [0] * (n + 1)
        fact[0] = fact[1] = ifact[0] = ifact[1] = 1
        for i in range(1, n + 1):
            fact[i] = self.mul(fact[i - 1], i)
            ifact[i] = self.modInv(fact[i], self.mod)
        for i in range(0, k + 1):
            ans = self.add(ans, self.mul(m, self.mul(self.modPow(m - 1, n - (i + 1), self.mod), self.NcR(n - 1, i)))
        print(ans)

    def NcR(self, n, r):
        return self.mul(fact[n], self.mul(ifact[r], ifact[n - r]))

    
    def sub(self, a, b):
        a %= self.mod
        b %= self.mod
        return ((a - b) % self.mod + self.mod) % self.mod

    def mul(self, a, b):
        a %= self.mod
        b %= self.mod
        return (a * b) % self.mod

    def add(self, a, b):
        a %= self.mod
        b %= self.mod
        return (a + b) % self.mod


# Uncomment the following lines if InputReader class is defined
# class InputReader:
#     def __init__(self, stream):
#         self.stream = stream

#     def nextInt(self):
#         return int(input())

#     def nextLong(self):
#         return int(input())

#     def readString(self):
#         return input()

#     def next(self):
#         return input()


if __name__ == "__main__":
    p = p02685()
    p.run()