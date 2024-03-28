import sys

class FS:
    def __init__(self):
        self.buffer = sys.stdin.buffer
        self.ptr = 0
        self.buflen = 0
        self.has_next_byte = True

    def has_next(self):
        while self.ptr < self.buflen:
            if self.buffer[self.ptr]!= b'\n':
                return True
            self.ptr += 1
        self.ptr = 0
        try:
            self.buflen = self.buffer.readinto(self.buffer)
        except:
            self.has_next_byte = False
        return self.has_next_byte

    def next(self):
        if not self.has_next():
            raise StopIteration()
        result = b''
        while self.ptr < self.buflen:
            if self.buffer[self.ptr] == b'\n':
                self.ptr += 1
                break
            result += self.buffer[self.ptr]
            self.ptr += 1
        return result.decode()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        result = self.next()
        if result[0] == '-':
            return -int(result[1:])
        else:
            return int(result)

def main():
    r = FS()
    N = r.next_int()
    M = r.next_int()
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