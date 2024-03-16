n, m = map(int, input().split())
if n == 2 or m == 2:
    print(0)
else:
    print(max(1, n - 2) * max(1, m - 2))