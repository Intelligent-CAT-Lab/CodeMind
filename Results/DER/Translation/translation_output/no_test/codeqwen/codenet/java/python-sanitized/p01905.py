import sys

class p01905:
    def solve(self):
        self.N = int(sys.stdin.readline())
        self.M = int(sys.stdin.readline())

        self.a = [int(sys.stdin.readline()) for _ in range(self.M)]

        b = [True] * (self.N * 2 - 1)
        for i in range(self.M):
            b[self.a[i] + self.N - 1] = False

        for i in range(self.N * 2 - 2, 0, -2):
            if b[i] and b[i - 1]:
                b[(i - 2) // 2] = True
            elif b[i] or b[i - 1]:
                b[(i - 2) // 2] = True
            else:
                b[(i - 2) // 2] = False

        ans = 0
        for i in range(self.N - 1):
            if b[i * 2 + 1] and b[i * 2 + 2]:
                ans += 1

        print(ans)

if __name__ == "__main__":
    p = p01905()
    p.solve()