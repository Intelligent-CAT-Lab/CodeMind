n, m, d = map(int, input().split())
s = d * 2 if d != 0 else n
print((s / n / n) * (m - 1))