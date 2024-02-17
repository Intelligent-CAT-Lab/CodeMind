a, b, c, k = [int(i) for i in "1 2 3 1".split()]
if k % 2 == 0:
    print(a - b)
else:
    print(b - a)