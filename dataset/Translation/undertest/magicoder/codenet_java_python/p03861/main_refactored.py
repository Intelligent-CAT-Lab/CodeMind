class main:
    a, b, x = map(int, input().split())
    count = b // x - a // x
    if a % x == 0:
        count += 1
    print(count)