import sys

class FS:
    def __init__(self):
        self.buffer = bytearray(sys.stdin.read())
        self.ptr = 0
        self.buflen = len(self.buffer)

    def has_next_byte(self):
        return self.ptr < self.buflen

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        s = []
        b = self.read_byte()
        while self.is_printable_char(b):
            s.append(chr(b))
            b = self.read_byte()
        return ''.join(s)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())


def main():
    r = FS()
    N = r.next_int()
    M = r.next_int()
    MOD = 1000000007
    dp = [[[0] * (N + 1) for _ in range(N + 1)] for _ in range(M + 1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N + 1):
            for k in range(N + 1):
                if j != N:
                    dp[i + 1][j + 1][k] += dp[i][j][k] * (N - j) % MOD
                    dp[i + 1][j + 1][k] %= MOD
                dp[i + 1][j][k] += dp[i][j][k] * (j - k) % MOD
                dp[i + 1][j][k] %= MOD
                dp[i + 1][j][j] += dp[i][j][k] * k % MOD
                dp[i + 1][j][j] %= MOD
    print(dp[M][N][N])


if __name__ == "__main__":
    main()