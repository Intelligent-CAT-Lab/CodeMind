import math

class p03913:
    def __init__(self):
        self.sc = Scanner(System.in)

    def run(self):
        n, a = self.sc.nextLong(), self.sc.nextLong()
        self.solver(n, a)

    def solver(self, n, a):
        ans = n
        for m in range(2, 41):
            c = int(math.pow(n,