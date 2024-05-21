x, y = map(int, input().split())

if x >= 0:
    if y >= 0:
        if x > y:
            if y == 0:
                print(x - y + 1)
            else:
                print(x - y + 2)
        else:
            print(y - x)
    else:
        print(abs(abs(y) - x) + 1)
else:
    if y >= 0:
        if y == 0:
            print(abs(abs(x) - y))
        else:
            print(abs(abs(x) - y) + 1)
    else:
        if x > y:
            print(x - y + 2)
        else:
            print(y - x)