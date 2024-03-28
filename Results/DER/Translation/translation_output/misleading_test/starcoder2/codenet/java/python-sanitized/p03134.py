import sys

def main():
    n = int(input())
    r = 0
    b = 0
    dp = [[0 for i in range(n + 1)] for j in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        if i == 0:
            r += 2
        else:
            r += 1
            b += 1
        for prevUseRed in range(i + 1):
            if prevUseRed + 1 <= r:
                dp[i + 1][prevUseRed + 1] += dp[i][prevUseRed]
                dp[i + 1][prevUseRed + 1] %= mod
            prevUseBlue = i - prevUseRed
            if prevUseBlue + 1 <= b:
                dp[i + 1][prevUseRed] += dp[i][prevUseRed]
                dp[i + 1][prevUseRed] %= mod
    combin = [[0 for i in range(n + 1)] for j in range(n + 1)]
    for i in range(n + 1):
        combin[i][0] = combin[i][i] = 1
    for i in range(2, n + 1):
        for j in range(1, i):
            combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % mod
    tto = 0
    for i in range(min(r, n) + 1):
        ways = dp[n][i]
        lr = r - i
        lb = b - (n - i)
        if lb < 0:
            continue
        ways *= combin[n][lr]
        ways %= mod
        tto = (tto + ways) % mod
    print(tto)

if __name__ == '__main__':
    main()