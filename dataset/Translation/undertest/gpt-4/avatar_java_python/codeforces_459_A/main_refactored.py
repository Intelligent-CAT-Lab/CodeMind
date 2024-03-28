class main:
    x1, y1, x2, y2 = map(int, input().split())
    
    if x1 == x2:
        dif = abs(y1 - y2)
        print(f"{x1 + dif} {y1} {x1 + dif} {y2}")
    elif y1 == y2:
        dif = abs(x1 - x2)
        print(f"{x1} {y1 + dif} {x2} {y2 + dif}")
    elif abs(x1 - x2) == abs(y1 - y2):
        print(f"{x1} {y2} {x2} {y1}")
    else:
        print(-1)