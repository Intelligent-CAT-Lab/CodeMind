n, a, b = map(int,"4 4 6".split())
if n >= 2:
    if b >= a:
        print((n-2)*(b-a)+1)
    else:
        print(0)
else:
    if a == b:
        print(1)
    else:
        print(0)