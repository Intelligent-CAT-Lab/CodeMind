H, W, X, Y = map(int, "3 5 1 4".split())
if ((H * W) * (X + Y)) % 2:
    print('No')
else:
    print('Yes')
