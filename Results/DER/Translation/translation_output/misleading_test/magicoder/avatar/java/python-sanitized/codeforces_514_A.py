def solve(x):
    list = []
    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list.append(r)
            else:
                list.append(9 - r)
        else:
            list.append(r)
        x = x // 10

    pow = 0
    newNumber = 0

    for i in range(len(list)):
        newNumber = newNumber + list[i] * (10 ** pow)
        pow += 1

    return newNumber

# Test input
x = 5728
print(solve(x))  # Expected output: 4304