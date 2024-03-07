import sys

class LightScanner:
    def __init__(self, inp):
        self.reader = inp

    def string(self):
        if not self.tokenizer or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def ints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except IOException as e:
            raise UncheckedIOException(e)
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, len(s))
            self.breaked = False
        except IOException as e:
            raise UncheckedIOException(e)
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
        self.print(sys.lineSeparator())
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except IOException as e:
                raise UncheckedIOException(e)
        return self

    def close(self):
        try:
            self.out.close()
        except IOException as e:
            raise UncheckedIOException(e)

class I3y3sChallenge:
    def solve(self, testNumber, inp, out):
        # out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP)
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

if __name__ == '__main__':
    inp = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    solver = I3y3sChallenge()
    solver.solve(1, inp, out)
    out.close()