def p03781():
    x = int(input())
    i = 1
    while i * (i + 1) // 2 < x:
        i += 1
    print(i)

p03781()