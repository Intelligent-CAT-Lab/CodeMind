```python
import sys
import math

class p03039:
    def __init__(self):
        self.INPUT = ""
        self.mod = 998244353
        self.inf = 2**31-1

    def solve(self):
        n = self.ni()
        m = self.ni()
        k = self.ni()
        fif = self.enumFIF(1000000, self.mod)

        xsum = 0
        ysum = 0

        xa = self.C(n*m-2,k-2,fif) * fif[0][k-2] % self.mod
        xb = 0
        for i in range(m+1):
            tmp = (i * (m-i) % self.mod * n % self.mod * n % self.mod * 2) % self.mod
            xb += tmp
            xb %= self.mod
        xc = xa * xb % self.mod * self.C(k,2,fif) % self.mod
        xsum = xc * fif[1][k] % self.mod
        # print(xa, xb, xc)
        # print(xsum)

        ya = self.C(n*m-2,k-2,fif) * fif[0][k-2] % self.mod
        yb = 0
        for i in range(n+1):
            tmp = (i * (n-i) % self.mod * m % self.mod * m % self.mod * 2) % self.mod
            yb += tmp
            yb %= self.mod
        yc = ya * yb % self.mod * self.C(k,2,fif) % self.mod
        ysum = yc * fif[1][k] % self.mod

        # print(ysum)

        print((xsum+ysum)%self.mod)

    @staticmethod
    def C(n, r, fif):
        if n < 0 or r < 0 or r > n:
            return 0
        return (fif[0][n] * fif[1][
