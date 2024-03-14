class p03419:
    def __init__(self):
        self.n, self.m = map(int, input().split())

    def solve(self):
        if self.n == 2 or self.m == 2:
            print(0)
            return
        ans = max(1, self.n - 2) * max(1, self.m - 2)
        print(ans)

p03419().solve()