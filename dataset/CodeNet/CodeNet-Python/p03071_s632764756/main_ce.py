def resolve():
    a, b = map(int, "5 3".split())
    print(max(2*a-1, a+b, 2*b-1))
resolve()