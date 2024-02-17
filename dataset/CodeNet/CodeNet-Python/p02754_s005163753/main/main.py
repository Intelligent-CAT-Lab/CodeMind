n, a, b = list(map(int, input().split()))
if n % (a + b) <= a:
    print(((n // (a + b)) * a + n % (a + b)))
else:
    print(((n // (a + b)) * a + a))
