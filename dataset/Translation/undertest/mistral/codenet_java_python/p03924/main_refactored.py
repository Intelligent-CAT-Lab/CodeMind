class main:
    import sys
    
    def next_int():
        global buf, ptr, buflen
        while ptr < buflen:
            if not is_printable(buf[ptr]):
                ptr += 1
            else:
                yield buf[ptr]
                ptr += 1
    
    def is_printable(c):
        return 33 <= c and c <= 126
    
    def skip_unprintable():
        global ptr
        while has_next() and not is_printable(next()):
            ptr += 1
    
    def has_next():
        skip_unprintable()
        return next_byte() != -1
    
    def next_byte():
        global buf, ptr, buflen
        if not has_next():
            raise NoSuchElementException()
        return buf[ptr - 1]
    
    def next_int():
        global buf, ptr, buflen
        if not has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = next_byte()
        if b == '-':
            minus = True
            b = next_byte()
        if not (b >= '0' and b <= '9'):
            raise NumberFormatException()
        while True:
            if b >= '0' and b <= '9':
                n *= 10
                n += b - '0'
            elif b == -1 or not is_printable(b):
                return minus * n if minus else n
            else:
                raise NumberFormatException()
            b = next_byte()
    
    if __name__ == '__main__':
        N, M = map(int, next_int().split())
        MOD = 1000000007
        dp = [[[0 for _ in range(N + 1)] for _ in range(M + 1)] for _ in range(N + 1)]
        dp[0][1][1] = 1
        for i in range(M):
            for j in range(N):
                for k in range(N):
                    # add town unused
                    if j != N:
                        dp[i + 1][j + 1][k] += (int)(((10 ** (N - j)) % MOD) * (N - j))
                        dp[i + 1][j + 1][k] %= MOD
                    # add town used but not in loop
                    dp[i + 1][j][k] += (int)(((10 ** (j - k)) % MOD) * (j - k))
                    dp[i + 1][j][k] %= MOD
                    # add town used and in loop
                    dp[i + 1][j][j] += (int)(((10 ** (j * k)) % MOD) * k)
                    dp[i + 1][j][j] %= MOD
        print(dp[M][N][N])