import sys

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.br = open(file, "r")
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            s = self.br.readline()
            if s is None:
                return None
            self.st = StringTokenizer(s)
        return self.st.nextToken()

    def hasMoreTokens(self):
        while self.st is None or not self.st.hasMoreTokens():
            s = self.br.readline()
            if s is None:
                return False
            self.st = StringTokenizer(s)
        return True

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

class p03397:
    def __init__(self):
        self.in = FastScanner(sys.stdin)
        self.out = FastScanner(sys.stdout)

    def solve(self):
        s = self.in.next().toCharArray()
        go = [[0, 0], [2, 2], [1, 3], [2, 0], [5, 5], [4, 6], [5, 3], [8, 8], [7, 9], [8, 6]]
        start = len(go) - 1
        win = "W?W?L?W?L?"
        states = len(win)
        dp = [0] * states
        dp[start] = 1
        ndp = [0] * states
        for c in s:
            Arrays.fill(ndp, 0)
            for st in range(states):
                if c == '0' or c == '?':
                    next = go[st][0]
                    ndp[next] = self.add(ndp[next], dp[st])
                if c == '1' or c == '?':
                    next = go[st][1]
                    ndp[next] = self.add(ndp[next], dp[st])
            tmp = dp
            dp = ndp
            ndp = tmp
        res = 0
        for i in range(states):
            if dp[i] == 0:
                continue
            w = win[i]
            if w == '?':
                raise AssertionError()
            if w == 'W':
                res += dp[i]
        self.out.println(res % mod)

    def add(self, x, y):
        x += y
        if x >= mod:
            x -= mod
        return x

    def run(self):
        try:
            self.in = FastScanner(open("p03397.in", "r"))
            self.out = FastScanner(open("p03397.out", "w"))

            self.solve()

            self.out.close()
        except FileNotFoundException as e:
            e.printStackTrace()

    def runIO(self):
        self.in = FastScanner(sys.stdin)
        self.out = FastScanner(sys.stdout)

        self.solve()

        self.out.close()

if __name__ == "__main__":
    p03397().runIO()