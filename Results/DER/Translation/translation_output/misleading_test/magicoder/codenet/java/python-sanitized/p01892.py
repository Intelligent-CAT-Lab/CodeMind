import sys

class p01892:
    def __init__(self):
        self.A, self.B, self.N = map(int, sys.stdin.readline().split())

    def solve(self):
        ans = abs(self.A - self.B)
        for i in range(1, self.N + 1):
            for j in range(1, self.N + 1):
                if i * self.B % j != 0:
                    continue
                ans = min(ans, abs(self.A - i * self.B // j))
        print(ans)

if __name__ == "__main__":
    p01892().solve()