import sys

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

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        self.out.write(c)
        self.breaked = False
        return self

    def print(self, s):
        self.out.write(s)
        self.breaked = False
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ans(self, i):
        return self.ans(str(i))

    def ans(self, *n):
        for n1 in n:
            self.ans(n1)
        return self

    def ln(self):
        self.print('\n')
        self.breaked = True
        if self.autoflush:
            self.out.flush()
        return self

    def close(self):
        self.out.close()

class LightScanner:
    def __init__(self, inp):
        self.inp = inp
        self.tokenizer = None

    def string(self):
        if self