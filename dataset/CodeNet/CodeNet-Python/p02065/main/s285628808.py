from collections import Counter
N, K, mod = list(map(int, input().split()))
dp = [Counter() for _ in range(2*N)]

dp[0][(None, (0,))] = 1
for i in range(2*N-1):
    for (left, top), v in list(dp[i].items()):
        if len(top) > K+1:
            continue
        if left == None:
            if top and i+1 - top[0] <= K:
                dp[i+1][(i+1, top)] = (dp[i+1][(i+1, top)] + v) % mod 
        elif (i+1 - left <= K) and len(top) > 1 and (i+1 - top[1] <= K):
            dp[i+1][(i+1, top[1:])] = (dp[i+1][(i+1, top[1:])] + v) % mod
        if top and (i+1 - top[-1] <= K):
            top = list(top)
            top.append(i+1)
            top = tuple(top)
            dp[i+1][(left, top)] = (dp[i+1][(left, top)] + v) % mod

res = 0
for (left, top), v in list(dp[2*N-1].items()):
    if len(top) == 1:
        assert left == 2*N - 1
        res = (res + v) % mod
print(res)

