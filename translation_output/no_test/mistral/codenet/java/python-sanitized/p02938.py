import sys

MOD = 1000000007

def getBit(n, i):
    return (n >> i) & 1

def print(dp, i, x, y, msb):
    # print(dp[i][x][y][msb])
    pass

def go():
    inp = sys.stdin.readline().strip()
    l, r = map(int, inp.split())
    n = len(bin(r))
    dp = [[[0 for _ in range(2)] for _ in range(2)] for _ in range(2)]
    for x in range(2):
        for y in range(2):
            for msb in range(2):
                dp[0][x][y][msb] = 1
                print(dp, 0, x, y, msb)
    for i in range(1, n+1):
        for x in range(2):
            for y in range(2):
            for msb in range(2):
                # flip neither, x needs to be in range
                if x == 1 or getBit(l, i-1) == 0:
                    # y is in range if already in range or current bit is 1
                    dp[i][x][y][msb] += dp[i-1][x][y | getBit(r, i-1)][msb]
                    dp[i][x][y][msb] %= MOD
                # flip both, y needs to be in range
                if y == 1 or getBit(r, i-1) == 1:
                    # msb gets flipped
                    # x is in range if already in range or current bit is 0
                    dp[i][x][y][msb] += dp[i-1][x | (1-getBit(l, i-1))][y][1]
                    dp[i][x][y][msb] %= MOD
                # flip only y, both need to be in range and msb needs to have been flipped
                if ((x == 1 or getBit(l, i-1) == 0)
                    and (y == 1 or getBit(r, i-1) == 1)
                    and msb == 1):
                    dp[i][x][y][msb] += dp[i-1][x][y][1]
                    dp[i][x][y][msb] %= MOD
                print(dp, i, x, y, msb)
    print(dp[n][0][0][0])

if __name__ == "__main__":
    go()