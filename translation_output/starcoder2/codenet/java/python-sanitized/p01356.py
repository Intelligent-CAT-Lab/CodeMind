import math

n, m, a, b, p, q = map(int, input().split())
if a == 1 and b == 1:
    div = m // (p + q)
    div = min(div, n)
    ans = min(abs(div * (p + q) - m), abs((div + 1) * (p + q) - m))
    print(ans)
    exit()

lim = 0
while p * pow(a, lim) + q * pow(b, lim) <= m:
    lim += 1
lim = min(lim, n)
lim = min(lim, 40)
pending1 = []
pending2 = []
powA = [1] * 42
powB = [1] * 42
for i in range(1, 42):
    powA[i] = powA[i - 1] * a
    powB[i] = powB[i - 1] * b
for t in range(2):
    max = (t == 0 and lim // 2) or ((lim + 1) // 2)
    for i in range(1 << max):
        s = 0
        for j in range(max):
            if (i & (1 << j)) > 0:
                s += p * powA[j + (t == 1 and lim // 2) or 0] + q * powB[j + (t == 1 and lim // 2) or 0]
                if s > INF:
                    break
        if t == 0:
            pending