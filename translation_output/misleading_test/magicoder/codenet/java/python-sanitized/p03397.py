import sys

class FastScanner:
    def __init__(self, f):
        self.f = f
        self.s = ''

    def next(self):
        while self.s == '':
            self.s = self.f.readline()
        word = ''
        for ch in self.s:
            if ch == ' ' or ch == '\n':
                self.s = self.s[len(word)+1:]
                return word
            word += ch
        self.s = ''
        return word

    def nextInt(self):
        return int(self.next())

    def hasMoreTokens(self):
        while self.s == '':
            self.s = self.f.readline()
        return self.s != ''

class p03397:
    def __init__(self):
        self.inp = FastScanner(sys.stdin)
        self.mod = int(1e9 + 7)

    def add(self, x, y):
        x += y
        if x >= self.mod:
            x -= self.mod
        return x

    def solve(self):
        s = self.inp.next()
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
                    ndp[next] = self.add(ndp[next], dp[st])
                if c == '1' or c == '?':
                    next = go[st][1]
                    ndp[next] = self.add(ndp[next], dp[st])
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
        print(res % self.mod)

    def run(self):
        self.solve()

p03397().run()