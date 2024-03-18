n, x, t = map(int, input().split())
ans, tako = 0, 0
while n > tako:
    ans += t
    tako += x
print(ans)