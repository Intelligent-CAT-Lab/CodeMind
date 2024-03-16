import sys

class FastScanner:
    def __init__(self, f):
        self.f = f
        self.tokens = None

    def next(self):
        while True:
            if self.tokens is None or not self.tokens:
                self.tokens = self.f.readline().split()
            if self.tokens:
                return self.tokens.pop(0)
            raise StopIteration

    def has_next(self):
        while self.tokens is None or not self.tokens:
            line = self.f.readline()
            if not line:
                return False
            self.tokens = line.split()
        return True

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())


def add(x, y):
    x += y
    if x >= 10**9 + 7:
        x -= 10**9 + 7
    return x


def solve(inp, out):
    s = inp.next()
    go = [[0, 0], [2, 2], [1, 3], [2, 0], [5, 5], [4, 6], [5, 3], [8, 8], [7, 9], [8, 6]]
    start = len(go) - 1
    win = "W?W?L?W?L?"
    states = len(win)
    dp = [0] * states
    dp[start] = 1
    ndp = [0] * states
    for c in s:
        ndp = [0] * states
        for st in range(states):
            if c == '0' or c == '?':
                next = go[st][0]
                ndp[next] = add(ndp[next], dp[st])
            if c == '1' or c == '?':
                next = go[st][1]
                ndp[next] = add(ndp[next], dp[st])
        dp, ndp = ndp, dp
    res = 0
    for i in range(states):
        if dp[i] == 0:
            continue
        w = win[i]
        if w == '?':
            raise AssertionError()
        if w == 'W':
            res += dp[i]
    out.write(str(res % (10**9 + 7)))


def run(inp, out):
    solve(inp, out)


def run_io():
    inp = FastScanner(sys.stdin)
    out = sys.stdout
    solve(inp, out)


if __name__ == "__main__":
    run_io()