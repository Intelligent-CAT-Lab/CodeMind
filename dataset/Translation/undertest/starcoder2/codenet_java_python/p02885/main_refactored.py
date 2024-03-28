class main:
    a, b = map(int, input().split())
    if a > 2 * b:
        print(a - 2 * b)
    else:
        print(0)