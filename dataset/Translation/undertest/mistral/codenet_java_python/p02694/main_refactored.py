class main:
    x = int(input())
    count = 0
    a = 100
    while a < x:
        a = a + a // 100
        count += 1
    print(count)