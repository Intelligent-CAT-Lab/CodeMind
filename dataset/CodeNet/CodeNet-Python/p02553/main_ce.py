a, b, c, d = map(int, "1 2 1 1".split())
ans = -1000000000000000000
ans = max(ans, a * c, a * d, b * c, b * d)
print(ans)
