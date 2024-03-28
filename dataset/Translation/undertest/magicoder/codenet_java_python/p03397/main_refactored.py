class main:
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
    
        def hasMoreTokens(self):
            while self.s == '':
                self.s = self.f.readline()
            return self.s != ''
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return long(self.next())
    
        def nextDouble(self):
            return float(self.next())
    
    
    def add(x, y):
        x += y
        if x >= 10**9 + 7:
            x -= 10**9 + 7
        return x
    
    
    def solve(inp):
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
        print(res % (10**9 + 7))
    
    
    def runIO():
        inp = FastScanner(sys.stdin)
        solve(inp)
    
    
    if __name__ == "__main__":
        runIO()