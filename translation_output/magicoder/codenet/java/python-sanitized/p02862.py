import sys
import math

class p02862:
    def __init__(self):
        self.INPUT = ""
        self.mod = 1000000007
        self.inf = sys.maxsize // 2

    def solve(self):
        x = self.ni()
        y = self.ni()
        if ((2*y-x)%3!=0 or 2*y-x<0):
            print(0)
            return
        a = (2*y-x)//3
        if ((2*x-y)%3!=0 or 2*x-y<0):
            print(0)
            return
        b = (2*x-y)//3
        fif = self.enumFIF(3000000, self.mod)
        print(self.C(a+b,a,self.mod,fif))

    @staticmethod
    def C(n, r, mod, fif):
        if n < 0 or r < 0 or r > n:
            return 0
        return (fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod)

    @staticmethod
    def enumFIF(n, mod):
        f = [0