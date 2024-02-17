a, b, c, d = list(map(int, input().split()))
ans = -1000000000000000000
ans = max(ans, a * c, a * d, b * c, b * d)
print(ans)
