class main:
    w, h, x, y = map(int, input().split())
    ans = (w * h) / 2
    if x == w // 2 and y == h // 2:
        a = 1
    print(ans, a)