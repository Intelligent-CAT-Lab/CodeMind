def p03781():
    x = int(input())
    i = 1
    for i in range(1, x):
        if i * (i + 1) // 2 >= x:
            break
    print(i)

p03781()