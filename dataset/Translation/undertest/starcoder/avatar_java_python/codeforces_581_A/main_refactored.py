class main:
    a, b = map(int, input().split())
    count = 0
    while a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    print(count, a // 2 + b // 2)