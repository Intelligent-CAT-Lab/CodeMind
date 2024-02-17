from collections import defaultdict

INF = float("inf")

N, X, D = map(int, input().split())

if D == 0:
    print(1 if X == 0 else N + 1)
    quit()

if D < 0:
    X, D = -X, -D

memo = defaultdict(list)
for k in range(N + 1):
    l = k * X + (k - 1) * k // 2 * D
    r = k * X + (N - k + N - 1) * k // 2 * D
    memo[l % D].append((l, r))

ans = 0
for LR in memo.values():
    LR.sort()

    cur = -INF
    for l, r in LR:
        if cur < l:
            ans += (r - l) // D + 1
            cur = r
        if cur < r:
            ans += (r - cur) // D
            cur = r

print(ans)