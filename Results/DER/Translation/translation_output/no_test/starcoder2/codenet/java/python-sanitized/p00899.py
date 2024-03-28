import sys

def solve():
    N = int(sys.stdin.readline())
    if N == 0:
        return
    str = []
    for i in range(N):
        str.append(sys.stdin.readline().strip())

    eq = [False] * N
    for i in range(N):
        if eq[i]:
            continue
        for j in range(N):
            if i != j and not eq[j] and str[i].find(str[j]) != -1:
                eq[j] = True

    str2 = []
    for i in range(N):
        if not eq[i]:
            str2.append(str[i])
    N2 = len(str2)

    len = [[0] * N2 for i in range(N2)]
    for i in range(N2):
        for j in range(N2):
            if i == j:
                continue
            offset = 0
            l = len(str2[i])
            for offset in range(l):
                if str2[j].startswith(str2[i][offset:]):
                    break
            len[i][j] = len(str2[j]) - (l - offset)

    dp = [[1000000000] * N2 for i in range(1 << N2)]
    for i in range(N2):
        dp[1 << i][i] = len(str2[i])
    for i in range(1 << N2):
        for j in range(N2):
            if dp[i][j] >= 1000000000:
                continue
            for k in range(N2):
                if (i & (1 << k)) > 0:
                    continue
                newIdx = i | (1 << k)
                dp[newIdx][k] = min(dp[newIdx][k], dp[i][j] + len[j][k])

    ans = 1000000000
    tmp = (1 << N2) - 1
    for i in range(N2):
        ans = min(ans, dp[tmp][i])
    print(ans)

while True:
    solve()