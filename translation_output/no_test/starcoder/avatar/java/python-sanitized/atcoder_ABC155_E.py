import sys
import math

def main():
    input = sys.stdin.readline
    MOD = 10 ** 9 + 7
    S = '0' + input().rstrip()
    c = list(S)
    N = len(c)
    dp = [[math.inf] * 2 for _ in range(N + 1)]
    dp[N][0] = int(c[0])
    dp[N][1] = 10 - int(c[0])

    for i in range(N - 1, -1, -1):
        for j in range(2):
            for k in range(10):
                tmp = int(c[i]) + j
                tmp = k - tmp
                if tmp < 0:
                    dp[i][1] = min(dp[i][1], dp[i + 1][j] + tmp + 10 + k)
                else:
                    dp[i][0] = min(dp[i][0], dp[i + 1][j] + tmp + k)

    print(dp[0][0])

if __name__ == '__main__':
    main()