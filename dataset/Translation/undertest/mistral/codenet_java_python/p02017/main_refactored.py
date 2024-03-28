class main:
    h, w, x, y = map(int, input().split())
    if (h * w % 2 == 1 and (x + y) % 2 == 1):
        print("No")
    else:
        print("Yes")