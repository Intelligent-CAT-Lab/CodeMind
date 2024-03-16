import sys

class p01905:
    def __init__(self):
        self.N, self.M = self.get_ints()
        self.a = [self.get_int() for _ in range(self.M)]

    def solve(self):
        b = [True] * (2 * self.N - 1)
        for i in self.a:
            b[i + self.N - 1] = False

        for i in range(2 * self.N - 3, 0, -2):
            if b[i] == b[i - 1]:
                b[(i - 2) // 2] = True
            else:
                b[(i - 2) // 2] = False

        ans = sum(b[i * 2 + 1] and b[i * 2 + 2] for i in range(self.N - 1))
        print(ans)

    def get_int(self):
        return int(self.get_next())

    def get_ints(self):
        return map(int, self.get_next().split())

    def get_next(self):
        return sys.stdin.readline().strip()


if __name__ == "__main__":
    p01905().solve()