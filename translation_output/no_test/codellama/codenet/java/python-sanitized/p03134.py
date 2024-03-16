import sys
import math

def solve(sc, pw):
    n = int(sc.next())
    r = 0
    b = 0
    dp = [[0] * (n + 1) for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        if sc.next() == '0':
            r += 2
        elif sc.next() == '1':
            r += 1
            b += 1
        else:
            b += 2
        for prev_use_red in range(i + 1):
            if prev_use_red + 1 <= r:
                dp[i + 1][prev_use_red + 1] += dp[i][prev_use_red]
                dp[i + 1][prev_use_red + 1] %= 998244353
            prev_use_blue = i - prev_use_red
            if prev_use_blue + 1 <= b:
                dp[i + 1][prev_use_red] += dp[i][prev_use_red]
                dp[i + 1][prev_use_red] %= 998244353
    combin = [[0] * (n + 1) for _ in range(n + 1)]
    for i in range(n + 1):
        combin[i][0] = combin[i][i] = 1
    for i in range(2, n + 1):
        for j in range(1, i):
            combin[i][j] = (combin[i - 1][j - 1] + combin[i - 1][j]) % 998244353
    tto = 0
    for i in range(n + 1):
        ways = dp[n][i]
        lr = r - i
        lb = b - (n - i)
        if lb < 0:
            continue
        ways *= combin[n][lr]
        ways %= 998244353
        tto = (tto + ways) % 998244353
    pw.println(tto)

if __name__ == '__main__':
    sc = Scanner(sys.stdin)
    pw = PrintWriter(sys.stdout)
    solve(sc, pw)
    pw.close()