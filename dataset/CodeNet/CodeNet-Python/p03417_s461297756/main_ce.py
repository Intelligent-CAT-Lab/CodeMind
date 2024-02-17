n, m = map(int, "2 2".split())
if n >= 2 and m >= 2:
    print((n - 2) * (m - 2))
elif n == 1 and m > 1:
    print(m - 2)
elif m == 1 and n > 1:
    print(n - 2)
else:
    print(1)