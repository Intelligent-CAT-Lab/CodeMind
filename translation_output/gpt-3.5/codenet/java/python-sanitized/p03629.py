import sys

class InputReader:
    def __init__(self):
        self.curbuf = 0
        self.lenbuf = 0
        self.inp = sys.stdin.buffer.read()

    def hasNextByte(self):
        while self.curbuf < self.lenbuf:
            return True
        return False

    def readByte(self):
        if self.hasNextByte():
            val = self.inp[self.curbuf]
            self.curbuf += 1
            return val
        return -1

    def isSpaceChar(self, c):
        return not (c >= 33 and c <= 126)

    def skip(self):
        while self.hasNextByte() and self.isSpaceChar(self.inp[self.curbuf]):
            self.curbuf += 1

    def hasNext(self):
        self.skip()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise ValueError("NoSuchElementException")
        sb = bytearray()
        b = self.readByte()
        while not self.isSpaceChar(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode()

    def nextInt(self):
        if not self.hasNext():
            raise ValueError("NoSuchElementException")
        c = self.readByte()
        while self.isSpaceChar(c):
            c = self.readByte()
        minus = False
        if c == 45:
            minus = True
            c = self.readByte()
        res = 0
        while not self.isSpaceChar(c):
            if c < 48 or c > 57:
                raise ValueError("InputMismatchException")
            res = res * 10 + c - 48
            c = self.readByte()
        return -res if minus else res

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        arr = []
        for _ in range(n):
            arr.append(self.nextInt())
        return arr

def solve():
    a = list(ir.next())
    n = len(a)
    dp = [[[0, 0] for _ in range(26)] for _ in range(n + 1)]

    for i in range(26):
        dp[n][i] = [i, 1]

    for i in range(n - 1, -1, -1):
        for j in range(26):
            for k in range(2):
                dp[i][j][k] = dp[i + 1][j][k]
        
        cur = ord(a[i]) - ord('a')
        mi = 2 * n
        for j in range(26):
            mi = min(mi, dp[i + 1][j][1])

        for j in range(26):
            if dp[i + 1][j][1] == mi:
                dp[i][cur][0] = j
                dp[i][cur][1] = dp[i + 1][j][1] + 1
                break

    mi = 2 * n
    cur = -1
    for i in range(26):
        mi = min(mi, dp[0][i][1])

    for i in range(26):
        if dp[0][i][1] == mi:
            cur = i
            break

    ret = [chr(ord('a') + cur)]
    for i in range(n):
        if dp[i][cur][0] == dp[i + 1][cur][0] and dp[i][cur][1] == dp[i + 1][cur][1]:
            continue
        ret.append(chr(ord('a') + dp[i][cur][0]))
        cur = dp[i][cur][0]
    
    print("".join(ret))

ir = InputReader()
solve()