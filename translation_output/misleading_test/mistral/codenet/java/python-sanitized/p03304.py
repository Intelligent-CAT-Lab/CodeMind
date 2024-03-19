n, m, d = map(int, input().split())
s = d == 0 and n or (n - d) * 2
print((s/n/n)*(m-1))