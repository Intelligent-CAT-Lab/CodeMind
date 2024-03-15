import math

class P03913:
    def run(self):
        a, b = map(int, input().split())
        self.solver(a, b)

    def solver(self, n, a):
        ans = n
        for m in range(2, 41):
            c = int(n**(