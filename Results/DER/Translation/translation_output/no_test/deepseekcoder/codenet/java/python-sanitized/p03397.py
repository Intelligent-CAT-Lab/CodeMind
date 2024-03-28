import sys

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.buffer = bytearray(sys.stdin.read(), sys.stdin.buffer.read)
        self.offset = 0
        self.bufferSize = 0
        self.delimiter = '\n'

    def next(self):
        if self.bufferSize == self.offset:
            self.buffer = bytearray(sys.stdin.read(), sys.stdin.buffer.read)
            self.offset = 0
            self.bufferSize = 0
            if len(self.buffer) == 0:
                return None
        pos = self.buffer.find(self.delimiter.encode(), self.offset)
        if pos == -1:
            pos = len(self.buffer)
            self.offset = pos
            self.bufferSize = pos
            return self.buffer[:pos]
        self.offset = pos + len(self.delimiter)
        self.bufferSize = self.offset
        return self.buffer[pos:self.offset - len(self.delimiter)]

    def has_next(self):
        if self.bufferSize == self.offset:
            self.buffer = bytearray(sys.stdin.read(), sys.stdin.buffer.read)
            self.offset = 0
            self.bufferSize = 0
            if len(self.buffer) == 0:
                return False
        return True

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())


class p03397:
    def __init__(self):
        self.inp = FastScanner(sys.stdin)
        self.out = sys.stdout

    def add(self, x, y):
        x += y
        if x >= mod:
            x -= mod
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
        self.out.write(str(res % mod))

    def run(self):
        self.solve()
        self.out.close()


mod = int(1e9 + 7)
p03397().run()