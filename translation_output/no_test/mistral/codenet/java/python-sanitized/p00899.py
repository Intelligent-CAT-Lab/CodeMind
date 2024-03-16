import sys

def init():
    global N
    N = int(input())
    if N == 0:
        return
    solve()

def solve():
    strs = []
    for i in range(N):
        strs.append(input())
    eq = [False] * N
    for i in range(N):
        if eq[i]:
            continue
        for j in range(N):
            if i != j and not eq[j]:
                if strs[i].find(strs[j]) != -1:
                    eq[j] = True
    strs2 = []
    for i in range(N):
        if not eq[i]:
            strs2.append(strs[i])
    N2 = len(strs2)
    len = [[0] * N2 for _ in range(N2)]
    for i in range(N2):
        for j in range(N2):
            if i == j:
                continue
            offset = 0
            for offset in range(len[j][i]):
                if strs2[j].startswith(strs2[i][offset:]):
                    break
            len[j][i] = len[j][i] - offset
    dp = [[sys.maxsize] * N2 for _ in range(1 << N2)]
    for i in range(1 << N2):
        for j in range(N2):
            dp[i][j] = sys.maxsize
    for i in range(N2):
        dp[1 << i][i] = len[i][i]
    for i in range(1 << N2):
        for j in range(N2):
            if dp[i][j] >= sys.maxsize:
                continue
            for k in range(N2):
                if (i & (1 << k)) > 0:
                    continue
                new_idx = i | (1 << k)
                dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len[j][k])
    ans = sys.maxsize
    for i in range(N2):
        ans = min(ans, dp[((1 << N2) - 1)][i])
    print(ans)

if __name__ == "__main__":
    init()