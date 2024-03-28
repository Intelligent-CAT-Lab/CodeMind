def p02742():
    w, h = map(int, input().split())

    if w == 1 or h == 1:
        return 1
    c = (w*h)//2 if (w*h)%2 == 0 else (w*h)//2+1
    return c

print(p02742())