a, b, c = map(int, input().split())

if a >= b and a >= c:
    if b >= c:
        print(a * 100 + b + c)
    else:
        print(a * 100 + c + b)
elif b >= a and b >= c:
    if a >= c:
        print(b * 100 + a + c)
    else:
        print(b * 100 + c + a)
else:
    if a >= b:
        print(c * 100 + a + b)
    else:
        print(c * 100 + b + a)