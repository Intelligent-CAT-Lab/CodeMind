n, a, b = list(map(int, "8 3 4".split()))
if n % (a + b) <= a:
    print(((n // (a + b)) * a + n % (a + b)))
else:
    print(((n // (a + b)) * a + a))
