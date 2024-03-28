import sys
import itertools

MOD = 1000000007


def main():
    l, r = map(int, input().split())
    n = len(bin(r)) - 2
    # bit position, x in range, y in range, msb flipped
    dp = [[[[0 for _ in range(2)] for _ in range(2)] for _ in range(2)] for _ in range(n+1)]
    
    for x, y, msb in itertools.product(range(2), range(2), range(2)):
        dp[0][x][y][msb] = 1
        print_dp(dp, 0, x, y, msb)

    for i in range(1, n+1):
        for x, y, msb in itertools.product(range(2), range(2), range(2)):
            # flip neither, x needs to be in range
            if x == 1 or get_bit(l, i - 1) == 0:
                # y is in range if already in range or current bit is 1
                dp[i][x][y][msb] += dp[i - 1][x][y or get_bit(r, i - 1)][msb]
                dp[i][x][y][msb] %= MOD

            # flip both, y needs to be in range
            if y == 1 or get_bit(r, i - 1) == 1:
                # msb gets flipped
                # x is in range if already in range or current bit is 0
                dp[i][x][y][msb] += dp[i - 1][x or (1 - get_bit(l, i - 1))][y][1]
                dp[i][x][y][msb] %= MOD

            # flip only y, both need to be in range and msb needs to have been flipped
            if (x == 1 or get_bit(l, i - 1) == 0) and (y == 1 or get_bit(r, i - 1) == 1) and msb == 1:
                dp[i][x][y][msb] += dp[i - 1][x][y][1]
                dp[i][x][y][msb] %= MOD

            print_dp(dp, i, x, y, msb)

    print(dp[n][0][0][0])


def print_dp(dp, i, x, y, msb):
    # Debug print function can be left empty or filled with an appropriate print statement
    pass


def get_bit(n, i):
    return (n >> i) & 1


if __name__ == "__main__":
    main()