n = int(input())
total = 0
if n == 2:
    print(1)
else:
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)