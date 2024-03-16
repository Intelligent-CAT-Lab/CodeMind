import sys

def read_line():
    line = input()
    if len(line) == 0:
        return None
    line_list = list(map(int, line.split()))
    return line_list

def main():
    N, M, MOD = map(int, read_line())
    dp = [[[0 for _ in range(N+1)] for _ in range(N+1)] for _ in range(M+1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N):
            for k in range(N):
                # add town unused
                if j != N:
                    dp[i+1][j+1][k] += (dp[i][j][k] * (N - j)) % MOD
                # add town used but not in loop
                dp[i+1][j][k] += (dp[i][j][k] * (j - k)) % MOD
                # add town used and in loop
                dp[i+1][j][j] += (dp[i][j][k] * k) % MOD
    print(dp[M][N][N])

if __name__ == "__main__":
    main()