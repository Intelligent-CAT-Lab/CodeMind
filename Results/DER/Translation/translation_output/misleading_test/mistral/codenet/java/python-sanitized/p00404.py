def search(x, y):
    x_min, y_min, x_max, y_max = 0, 0, 0, 0
    f, f1, f2 = 1, 0, 0
    for p in range(0, 1000000):
        if x_min <= x <= x_max and y_min <= y <= y_max:
            return (p % 3) + 1
        f = f1 + f2
        if p % 4 == 0:
            x_max += f
        elif p % 4 == 1:
            y_max += f
        elif p % 4 == 2:
            x_min -= f
        else:
            y_min -= f
        f2 = f1
        f1 = f
    return -1

x, y = map(int, input().split())
print(search(x, y))