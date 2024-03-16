import sys

class p01892:
    def __init__(self):
        self.A, self.B = 0, 0
        self.N = 0

    def solve(self):
        self.A = self.nextLong()
        self.B = self.nextLong()
        self.N = self.nextInt()

        ans = abs(self.A - self.B)
        for i in range(1, self.N + 1):
            for j in range(1, self.N + 1):
                if i * self.B % j != 0:
                    continue
                ans = min(ans, abs(self.A - i * self.B // j))

        print(ans)

    def main(self):
        self.solve()

    def next(self):
        return sys.stdin.readline().rstrip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

if __name__ == "__main__":
    p01892().main()