import sys
from io import StringIO

class Scanner:
    def __init__(self, s=None):
        if s is None:
            self.s = sys.stdin.read().strip()
        else:
            self.s = s.strip()
        self.tokens = None

    def reset(self):
        self.tokens = None

    def next(self):
        if self.tokens is None:
            self.tokens = self.s.split()
        else:
            self.tokens = self.tokens[1:]
        if not self.tokens:
            raise StopIteration()
        return self.tokens[0]

    def next_int(self):
        return int(self.next())

    def next_line(self):
        return self.next()

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def has_next(self):
        if self.tokens is None:
            self.tokens = self.s.split()
        return bool(self.tokens)


class PrintWriter:
    def __init__(self, s=None):
        if s is None:
            self.s = StringIO()
        else:
            self.s = s

    def write(self, s):
        self.s.write(s)

    def flush(self):
        sys.stdout.write(self.s.getvalue())
        self.s.truncate(0)
        self.s.seek(0)

    def close(self):
        self.flush()
        sys.stdout.close()


class p03134:
    def __init__(self):
        self.mod = 998244353

    def solve(self, sc, pw):
        cc = sc.next()
        n = len(cc)
        r = 0
        b = 0
        dp = [[0] * (n + 1) for _ in range(n + 1)]
        dp[0][0] = 1
        for i in range(n):
            if cc[i] == '0':
                r += 2
            elif cc[i] == '1':
                r += 1
                b += 1
            else:
                b += 2
            for prev_use_red in range(i + 1):
                if prev_use_red + 1 <= r:
                    dp[i + 1][prev_use_red + 1] += dp[i][prev_use_red]
                    dp[i + 1][prev_use_red + 1] %= self.mod
                prev_use_blue = i - prev_use_red
                if prev_use_blue + 1 <= b:
                    dp[i + 1][prev_use_red] += dp[i][prev_use_red]
                    dp[i + 1][prev_use_red] %= self.mod
        combin = [[0] * (n + 1) for _ in range(n + 1)]
        for i in range(n + 1):
            combin[i][0] = combin[i][i] = 1
        for i in range(2, n + 1):
            for j in range(1, i):
                combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j])