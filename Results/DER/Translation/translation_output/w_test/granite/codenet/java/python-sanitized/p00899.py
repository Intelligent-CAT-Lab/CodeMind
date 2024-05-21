import sys

def solve():
    N = int(input())
    if N == 0:
        sys.exit()

    S = [input() for _ in range(N)]

    used = [False] * N
    for i in range(N):
        if used[i]:
            continue
        for j in range(N):
            if i == j:
                continue
            if used[j]:
                continue
            if S[i] in S[j]:
                used[j] = True

    S2 = [S[i] for i in range(N) if not used[i]]
    N2 = len(S2)

    dp = [[0] * N2 for _ in range(1 << N2)]
    for i in range(1 << N2):
        for j in range(N2):
            if dp[i][j]!= 0:
                continue
            for k in range(N2):
                if (i >> k) & 1:
                    continue
                dp[i | (1 << k)][k] = max(dp[i | (1 << k)][k], dp[i][j] + len(S2[j]))

    ans = max(dp[(1 << N2) - 1])
    print(ans)

while True:
    solve()