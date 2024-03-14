import sys

class p03419:

    def __init__(self):
        self.n, self.m = map(int, sys.stdin.readline().split())

    def solve(self):
        if self.n == 2 or self.m == 2:
            print(0)
            return
        print(max(1, self.n - 2) * max(1, self.m - 2))

p03419().solve()