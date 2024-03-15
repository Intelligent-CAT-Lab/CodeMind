```python
import sys

class FastScanner:
    def __init__(self, f):
        self.br = open(f, 'r')
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            s = self.br.readline()
            if not s:
                return None
            self.st = s.split()
        return self.st.pop(0)

    def hasMoreTokens(self):
        while self.st is None or not self.st:
            s = self.br.readline()
            if not s:
                return False
            self.st = s.split()
        return True

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

class p03397:
    def __init__(self):
        self.inp = FastScanner("p03397.in")
        self.out = open("p03397.out", "w")
        self.mod = int(1e9 + 7)

    def add(self, x, y):
        x += y
        if x >= self.mod:
            x -= self.mod
        return x

    def solve(self):
        s = list(self.inp.next())
        go = [[0, 0], [2, 2], [1, 3], [2, 0], [5, 5], [4, 6], [5, 3], [8, 8], [7, 9], [8, 6]]
        start = len(go) - 1
        win = "W?W?L?W?L?"
        states = len(win)
        dp = [0] * states
        dp[start] = 1
        ndp = [0] * states

        for c in s:
            for i in range(states):
                if c == '0' or c == '?':
                    ndp[go[i][0]] = self.add(ndp[go[i][0]], dp[i])
                if c == '1' or c == '?':
                    ndp[go[i][1]] = self.add(ndp[go[i][1]], dp[i])
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

        self.out.write(str(res % self.mod))

    def run(self):
        self.solve()
        self.inp.br.close()
        self.out.close()

if __name__ == '__main__':
    p = p03397()
    p.run()
```
