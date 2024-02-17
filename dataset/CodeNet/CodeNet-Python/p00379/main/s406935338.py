a, n, m = list(map(int, input().split()))
ans = 0
for y in range(1, 50):
    x = (y + a)**n
    if 1 <= x <= m and y == sum(map(int, str(x))):
        ans += 1
print(ans)
