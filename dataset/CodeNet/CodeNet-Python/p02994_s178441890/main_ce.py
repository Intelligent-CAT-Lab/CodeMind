n, l = map(int, "5 2".split())
if l >= 0:
    print(l * (n - 1) + (n - 1) * n // 2)
elif l + n - 1 < 0:
    print(l * (n - 1) + (n - 1) * n // 2 - (n - 1))
else:
    print(l * n + (n - 1) * n // 2)