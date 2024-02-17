N, K = list(map(int, input().split()))
ans = 1
s = 1
N -= 1
while 1:
    m = (s+K-1) // K
    if N < m:
        break
    s += m; N -= m
    ans += 1
print(ans)
