def p03826():
    a, b, c, d = map(int, input().split())
    a, b = a*b, c*d
    print(max(a, b))

p03826()