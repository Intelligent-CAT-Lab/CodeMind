w = int(input())
h = int(input())

if w == 1 or h == 1:
    print(1)
else:
    c = (w * h) // 2 if (w * h) % 2 == 0 else (w * h) // 2 + 1
    print(c)