import sys

class P01905:
    def __init__(self):
        self.N = 0
        self.M = 0
        self.a = []

    def solve(self):
        self.N = self.next_int()
        self.M = self.next_int()

        self.a = [0] * self.N

        for i in range(self.M):
            self.a[i] = self.next_int()

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

    @staticmethod
    def main():
        sys.stdin = open(0)

        p = P01905()
        p.solve()

    # Input functions
    @staticmethod
    def next():
        return sys.stdin.readline().strip()

    @staticmethod
    def next_int():
        return int(P01905.next())

    @staticmethod
    def next_long():
        return int(P01905.next())

    @staticmethod
    def next_double():
        return float(P01905.next())

if __name__ == "__main__":
    P01905.main()