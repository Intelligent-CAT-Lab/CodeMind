import sys

class LightScanner:
    def __init__(self, inp=sys.stdin):
        self.reader = inp

    def string(self):
        return self.reader.readline().strip()

    def ints(self):
        return int(self.string())


class LightWriter:
    def __init__(self, out=sys.stdout):
        self.out = out

    def print(self, *args, **kwargs):
        print(*args, **kwargs, file=self.out)

    def ans(self, *args):
        print(*args, file=self.out, end=' ')

    def ln(self):
        print(file=self.out)


class I3y3sChallenge:
    def solve(self, testNumber, inp, out):
        n = inp.ints()
        if n == 2:
            out.ans(-1).ln()
            return
        ans = [[0] * (n - 1) for _ in range(n)]
        for i in range(n - 1):
            for j in range(n - 1):
                if i == j:
                    ans[i][j] = n
                else:
                    ans[i][j] = j + 1
        for i in range(n - 1):
            ans[n - 1][i] = (i + 1) % (n - 1) + 1
        for i in range(n):
            out.ans(*ans[i]).ln()


def main():
    inp = LightScanner()
    out = LightWriter()
    solver = I3y3sChallenge()
    solver.solve(1, inp, out)
    out.ln()


if __name__ == "__main__":
    main()