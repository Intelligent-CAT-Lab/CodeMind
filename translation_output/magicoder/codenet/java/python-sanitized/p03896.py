import sys

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.breaked = True

    def print(self, c):
        self.out.write(c)
        self.breaked = False

    def print(self, s):
        self.out.write(s)
        self.breaked = False

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        self.print(s)

    def ans(self, i):
        self.ans(str(i))

    def ans(self, *n):
        for n1 in n:
            self.ans(n1)

    def ln(self):
        self.print(sys.line_separator)
        self.breaked = True

class LightScanner:
    def __init__(self, inp):
        self.inp = inp

    def string(self):
        return self.inp.readline().strip()

    def ints(self):
        return int(self.string())

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
            out.ans(ans[i]).ln()

if __name__ == "__main__":
    inp = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    solver = I3y3sChallenge()
    solver.solve(1, inp, out)
    out.close()