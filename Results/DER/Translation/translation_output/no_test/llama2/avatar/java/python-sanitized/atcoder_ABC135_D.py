import sys

def main():
    M = 1000000007
    s = sys.stdin.readline().strip()
    dp = [[0] * 13 for _ in range(len(s) + 1)]
    dp[0][0] = 1
    for i in range(1, len(s) + 1):
        ch = s[i - 1]
        for j in range(13):
            if ch == '?':
                for k in range(10):
                    l = j - k
                    if l < 0:
                        l += 13
                    dp[i][j] += dp[i - 1][map[l]]
                    if dp[i][j] >= M:
                        dp[i][j] -= M
            else:
                l = j - (ord(ch) - ord('0'))
                if l < 0:
                    l += 13
                dp[i][j] = dp[i - 1][map[l]]
    print(dp[len(s)][5])


if __name__ == '__main__':
    main()