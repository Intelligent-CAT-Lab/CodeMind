class p02927:
    def __init__(self):
        self.M, self.D = map(int, input().split())
        self.ans = 0

    def solve(self):
        for m in range(1, self.M + 1):
            for d in range(1, self.D + 1):
                d1, d2 = d % 10, d // 10
                if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
                    self.ans += 1
        print(self.ans)

p02927().solve()