class main:
    n = int(input())
    count = 0
    while n > 1:
        n = (n + (n % 3 == 0 and 0 or 3 - n % 3)) / 3
        count += 1
    print(count)