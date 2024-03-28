import sys

class Euclid:
    def gcd(self, x, y):
        if x < y:
            x, y = y, x
        if x == 0:
            return y
        else:
            return self.gcd(y % x, x)

class Compute:
    def cumulativeSum(self, A, k):
        ans = 0
        B = [0] * (len(A) + 1)
        B[0] = 0
        for i in range(1, len(B)):
            B[i] = B[i - 1]