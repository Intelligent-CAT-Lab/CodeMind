import sys
from itertools import combinations

class FastScanner:
    def __init__(self):
        self._stream = sys.stdin.buffer
        self._buffer = bytearray(1024)
        self._pos = 0
        self._len = 0

    def _read_into_buffer(self):
        self._pos = 0
        self._len = self._stream.readinto(self._buffer)
        if self._len == 0:
            raise EOFError

    def _read_next_byte(self):
        while self._pos >= self._len:
            self._read_into_buffer()
        byte = self._buffer[self._pos]
        self._pos += 1
        return byte

    def next_token(self):
        byte = self._read_next_byte()
        while byte <= 32:
            byte = self._read_next_byte()
        start_pos = self._pos - 1
        while 32 < byte:
            byte = self._read_next_byte()
        return self._buffer[start_pos:self._pos-1].decode()

    def next_int(self):
        return int(self.next_token())

    def next_long(self):
        return int(self.next_token())  # Python int can handle long integers

class p02997:
    def solve(self):
        N = self.scan.next_int()
        K = self.scan.next_int()
        if N == 2:
            if K == 0:
                print(1)
                print("1 2")
            else:
                print(-1)
            return

        max_comb = self.combination(N - 1, 2)
        if K > max_comb:
            print(-1)
            return

        M = N - 1 + (max_comb - K)
        print(M)
        for i in range(2, N + 1):
            print(f"1 {i}")

        cnt = max_comb - K
        if cnt > 0:
            for i in range(2, N):
                for j in range(i + 1, N + 1):
                    print(f"{i} {j}")
                    cnt -= 1
                    if cnt <= 0:
                        return

    def make_comb_dp(self, n):
        self.dp = [[0] * (n + 1) for _ in range(n + 1)]
        for i in range(n + 1):
            self.dp[i][0] = 1
            self.dp[i][i] = 1
        for i in range(2, n + 1):
            for j in range(1, min(i, n - i + 1)):
                self.dp[i][j] = self.dp[i - 1][j - 1] + self.dp[i - 1][j]

    def combination(self, n, k):
        if not hasattr(self, 'dp'):
            self.make_comb_dp(n)
        return self.dp[n][k]

    def __init__(self):
        self.scan = FastScanner()
        self.solve()

if __name__ == '__main__':
    _ = p02997()