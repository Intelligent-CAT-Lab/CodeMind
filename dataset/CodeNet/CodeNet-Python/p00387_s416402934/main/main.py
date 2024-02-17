a, b = list(map(int, input().split()))

if a >= b:
    print((1))
else:
    if b % a == 0:
        print((b // a))
    else:
        print((b // a + 1))

