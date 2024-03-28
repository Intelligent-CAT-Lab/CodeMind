import math

class p02862:
    def __init__(self):
        self.mod = 1_000_000_007
        self.inf = 2_147_483_647

    def solve(self):
        x = int(input())
        y = int(input())
        if (2*y-x) % 3 != 0 or 2*y-x < 0:
            print(0)
            return
        a = (2*y-x) // 3
        if (2*x-y) % 3 != 0 or 2*x-y < 0:
            print(0)
            return
        b = (2*x-y) // 3
        fif = self.enumFIF(3000000, self.mod)
        print(self.C(a+b, a, self.mod, fif))

    def C(self, n, r, mod, fif):
        if n < 0 or r < 0 or r > n:
            return 0
        return (fif[