n,k = map(int,input().split())

ans = 0
d,s = 1,0
while True:
    # s/d <= k
    # s <= d*k
    while d*k < s:
        d += 1
    if s+d > n:
        break
    s += d
    ans += 1

print(ans)

