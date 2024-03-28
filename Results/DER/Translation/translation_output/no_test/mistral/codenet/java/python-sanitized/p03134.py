import sys

def solve(cc, n, r, b):
    dp = [[0 for _ in range(n + 1)] for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        if cc[i] == '0':
            r += 2
        elif cc[i] == '1':
            r += 1
            b += 1
        else:
            b += 2
        for prevUseRed in range(i + 1):
            if prevUseRed + 1 <= r:
                dp[i + 1][prevUseRed + 1] += dp[i][prevUseRed]
                dp[i + 1][prevUseRed + 1] %= 1000000007
        for prevUseBlue in range(i - 1, -1, -1):
            if prevUseBlue + 1 <= b:
                dp[i + 1][prevUseRed] += dp[i][prevUseRed]
                dp[i + 1][prevUseRed] %= 1000000007
    combin = [[1 for _ in range(n + 1)] for _ in range(n + 1)]
    for i in range(2, n + 1):
        for j in range(1, i):
            combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % 1000000007
    tto = 0
    for i in range(min(r, n)):
        ways = dp[n][i]
        lr = r - i
        lb = b - (n - i)
        if lb < 0:
            continue
        ways *= combin[n][lr]
        ways %= 1000000007
        tto = (tto + ways) % 1000000007
    return tto

def main():
    cc = sys.stdin.readline().strip()
    n = len(cc)
    r = 0
    b = 0
    for i in range(n):
        if cc[i] == '0':
            r += 2
        elif cc[i] == '1':
            r += 1
            b += 1
        else:
            b += 2
    dp = [[0 for _ in range(n + 1)] for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        if cc[i] == '0':
            r += 2
        elif cc[i] == '1':
            r += 1
            b += 1
        else:
            b += 2
        for prevUseRed in range(i + 1):
            if prevUseRed + 1 <= r:
                dp[i + 1][prevUseRed + 1] += dp[i][prevUseRed]
                dp[i + 1][prevUseRed + 1] %= 1000000007
        for prevUseBlue in range(i - 1, -1, -1):
            if prevUseBlue + 1 <= b:
                dp[i + 1][prevUseRed] += dp[i][prevUseRed]
                dp