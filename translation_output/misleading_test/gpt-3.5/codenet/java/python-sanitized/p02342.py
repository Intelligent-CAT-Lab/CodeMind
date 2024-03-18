import sys

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.ptr = 0

    def hasNextByte(self):
        return self.ptr < len(self.buffer)

    def readByte(self):
        if self.hasNextByte():
            self.ptr += 1
            return self.buffer[self.ptr - 1]
        else:
            return -1

    @staticmethod
    def isPrintableChar(c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        sb = ""
        b = self.readByte()
        while self.isPrintableChar(b):
            sb += chr(b)
            b = self.readByte()
        return sb

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:
            raise NumberFormatException()
        while True:
            if 48 <= b <= 57:
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise NumberFormatException()
        return int(nl)

def partition(n, k):
    if n < 0:
        return 0
    if n == 0:
        return 1
    mod = 1000000007
    if k > n:
        k = n
    dp = [[0 for _ in range(k+1)] for _ in range(n+1)]
    dp[0][0] = 1
    for i in range(n+1):
        dp[i][1] = 1
    for i in range(2, k+1):
        dp[0][i] = 1
        dp[1][i] = 1

    for i in range(1, n+1):
        for j in range(2, k+1):
            if i - j >= 0:
                dp[i][j] = dp[i][j-1] + dp[i-j][j]
                dp[i][j] %= mod
            else:
                dp[i][j] = dp[i][j-1]

    return dp[n][k]

if __name__ == "__main__":
    scanner = FastScanner()

    n = scanner.nextInt()
    k = scanner.nextInt()

    print(partition(n-k, k))