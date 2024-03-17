import sys

class FastScanner:
    def __init__(self, file):
        self.file = file
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            s = None
            try:
                s = self.file.readline()
            except FileNotFoundException:
                e.printStackTrace()
            if s is None:
                return None
            self.st = StringTokenizer(s)
        return self.st.nextToken()

    def hasMoreTokens(self):
        while self.st is None or not self.st.hasMoreTokens():
            s = None
            try:
                s = self.file.readline()
            except FileNotFoundException:
                e.printStackTrace()
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

class p03581:
    def __init__(self):
        self.in = FastScanner(sys.stdin)
        self.out = PrintWriter(sys.stdout)

    def solve(self):
        mod = 1000000007
        M = 2222
        c = [[0] * M for _ in range(M)]
        c[0][0] = 1
        for i in range(1, M):
            c[i][0] = 1
            for j in range(1, M):
                c[i][j] = c[i - 1][j - 1] + c[i - 1][j]
                if