a, b, c, d = map(int, input().split())
print(max(a * c, b * d, a * d, b * c))