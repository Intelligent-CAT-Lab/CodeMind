import sys

class FS:
    def __init__(self):
        self.data = sys.stdin.read().split()
        self.i = 0

    def nextInt(self):
        res = int(self.data[self.i])
        self.i += 1
        return res


def main():
    r = FS()
    N = r.nextInt()
    M = r.nextInt()
    MOD = 1000000007
    dp = [[[0]*(N+1) for _ in range(N+1)] for _ in range(M+1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N+1):
            for k in range(N+1):
                if j != N:
                    dp[i+1][j+1][k] = (dp[i+1][j+1][k] + dp[i][j][k]*(N-j)) % MOD
                dp[i+1][j][k] = (dp[i+1][j][k] + dp[i][j][k]*(j-k)) % MOD
                dp[i+1][j][j] = (dp[i+1][j][j] + dp[i][j][k]*k) % MOD
    print(dp[M][N][N])


if __name__ == "__main__":
    main()