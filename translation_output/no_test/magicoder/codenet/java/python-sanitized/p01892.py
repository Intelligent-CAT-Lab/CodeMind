import sys

class p01892:
    def __init__(self):
        self.A, self.B = 0, 0
        self.N = 0

    def solve(self):
        self.A = self.next_long()
        self.B = self.next_long()
        self.N = self.next_int()

        ans = abs(self.A - self.B)
        for i in range(1, self.N + 1):
            for j in range(1, self.N + 1):
                if i * self.B % j != 0:
                    continue
                ans = min(ans, abs(self.A - i * self.B // j))

        print(ans)

    def main(self):
        sys.stdout.flush()
        self.solve()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next(self):
        return sys.stdin.readline().rstrip()

if __name__ == '__main__':
    p01892().main()