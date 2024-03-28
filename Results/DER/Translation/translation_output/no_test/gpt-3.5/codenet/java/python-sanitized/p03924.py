import sys
from collections import deque

MOD = 1000000007

class FS:
    def __init__(self):
        self.input_buffer = deque()
        self.buffer_size = 0

    def next(self):
        while not self.input_buffer or self.input_buffer[0] == " " or self.input_buffer[0] == "\n":
            self.input_buffer.extend(sys.stdin.readline().split())
        return self.input_buffer.popleft()

    def nextInt(self):
        return int(self.next())

def main():
    r = FS()
    N = int(r.nextInt())
    M = int(r.nextInt())

    dp = [[[0 for _ in range(N+1)] for _ in range(N+1)] for _ in range(M+1]
    dp[0][1][1] = 1

    for i in range(M):
        for j in range(N+1):
            for k in range(N+1):
                if j != N:
                    dp[i+1][j+1][k] += (dp[i][j][k] * (N-j)) % MOD
                    dp[i+1][j+1][k] %= MOD
                dp[i+1][j][k] += (dp[i][j][k] * (j-k)) % MOD
                dp[i+1][j][k] %= MOD
                dp[i+1][j][j] += (dp[i][j][k] * k) % MOD
                dp[i+1][j][j] %= MOD

    print(dp[M][N][N])

if __name__ == "__main__":
    main()