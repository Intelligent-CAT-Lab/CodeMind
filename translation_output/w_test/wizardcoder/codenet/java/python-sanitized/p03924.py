import sys

class FS:
    def __init__(self):
        self.buffer = sys.stdin.buffer
        self.buflen = 0
        self.ptr = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.buffer.readinto(self.buffer)
            except:
                return False
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration()
        sb = []
        while self.hasNextByte() and self.isPrintableChar(self.buffer[self.ptr]):
            sb.append(chr(self.buffer[self.ptr]))
            self.ptr += 1
        return ''.join(sb)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration()
        n = 0
        minus = False
        if self.buffer[self.ptr] == ord('-'):
            minus = True
            self.ptr += 1
        if not ('0' <= chr(self.buffer[self.ptr]) <= '9'):
            raise NumberFormatException()
        while self.hasNextByte() and ('0' <= chr(self.buffer[self.ptr]) <= '9'):
            n *= 10
            n += self.buffer[self.ptr] - ord('0')
            self.ptr += 1
        return -n if minus else n

def main():
    r = FS()
    N = r.nextInt()
    M = r.nextInt()
    MOD = 1000000007
    dp = [[[0]*(N+1) for _ in range(N+1)] for _ in range(M+1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(1, N+1):
            for k in range(1, N+1):
                # add town unused
                if j!= N:
                    dp[i+1][j+1][k] += dp[i][j][k]*(N-j)
                    dp[i+1][j+1][k] %= MOD
                # add town used but not in loop
                dp[i+1][j][k] += dp[i][j][k]*(j-k)
                dp[i+1][j][k] %= MOD
                # add town used and in loop
                dp[i+1][j][j] += dp[i][j][k]*k
                dp[i+1][j][j] %= MOD
    print(dp[M][N][N])

if __name__ == '__main__':
    main()