import sys
from io import BufferedReader, BufferedWriter, BytesIO, FileIO
import os
import math

class Kattio:
    def __init__(self, i: BufferedReader = BufferedReader(BytesIO(os.read(0, os.fstat(0).st_size)), 1),
                 o: BufferedWriter = BufferedWriter(BytesIO(), 1)):
        self.i = i
        self.o = o

    def hasMoreTokens(self):
        return self.peekToken() != None

    def getInt(self):
        return int(self.nextToken())

    def getDouble(self):
        return float(self.nextToken())

    def getLong(self):
        return int(self.nextToken())

    def getWord(self):
        return self.nextToken()

    def peekToken(self):
        if not hasattr(self, 'st') or not self.st or not hasattr(self, 'token'):
            try:
                while not hasattr(self, 'st') or not self.st or not self.st.hasMoreTokens():
                    self.line = self.r.readline()
                    if not self.line:
                        return None
                    self.st = self.line.split()
                self.token = self.st.pop(0)
            except Exception as e:
                pass
        return self.token

    def nextToken(self):
        ans = self.peekToken()
        self.token = None
        return ans

class Solve:
    mod = int(1e9) + 7

    def __init__(self, io):
        self.io = io

    def waysToPair(self, x):
        if self.memoWaysToPair[x] != -1:
            return self.memoWaysToPair[x]

        if x % 2 == 1:
            self.memoWaysToPair[x] = 0
        elif x == 0:
            self.memoWaysToPair[x] = 1
        else:
            self.memoWaysToPair[x] = self.waysToPair(x - 2) * (x - 1) % self.mod

        return self.memoWaysToPair[x]

    def paired(self, x, y):
        return self.f[y] - self.f[x - 1]

    def inside(self, a, x, y):
        return x <= a <= y

    def caldp(self, x, y):
        if self.dp[x][y] != -1:
            return self.dp[x][y]

        notPairedinXY = (y - x + 1) - self.paired(x, y)

        for i in range(1, self.k + 1):
            p1 = self.inside(self.a[i], x, y)
            p2 = self.inside(self.b[i], x, y)
            if p1 != p2:
                self.dp[x][y] = 0
                return self.dp[x][y]

        self.dp[x][y] = self.waysToPair(notPairedinXY)

        for z in range(x + 1, y):
            notPairedinZY = (y - (z + 1) + 1) - self.paired(z + 1, y)
            self.dp[x][y] = (self.dp[x][y] - self.caldp(x, z) * self.waysToPair(notPairedinZY) + self.mod * self.mod) % self.mod

        return self.dp[x][y]

    def main(self):
        self.n = self.io.getInt()
        self.n *= 2
        self.k = self.io.getInt()
        self.a = [0] * (self.k + 1)
        self.b = [0] * (self.k + 1)
        self.f = [0] * (self.n + 1)

        for i in range(1, self.k + 1):
            self.a[i] = self.io.getInt()
            self.b[i] = self.io.getInt()
            self.f[self.a[i]] = 1
            self.f[self.b[i]] = 1

        for i in range(1, self.n):
            self.f[i] += self.f[i - 1]

        self.dp = [[-1 for _ in range(self.n + 1)] for _ in range(self.n + 1)]

        self.memoWaysToPair = [-1 for _ in range(self.n + 1)]

        res = 0
        for x in range(1, self.n + 1):
            for y in range(x, self.n + 1):
                notPairedOutSideXY = (self.n - (y - x + 1)) - (self.f[self.n] - self.paired(x, y))
                res = (res + self.caldp(x, y) * self.waysToPair(notPairedOutSideXY) % self.mod) % self.mod

        self.io.o.write(str(res))


def main():
    io = Kattio()
    solve = Solve(io)
    solve.main()
    io.o.flush()

if __name__ == "__main__":
    main()