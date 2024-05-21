def codeforces_669_A(n):
    total = 0
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    return total

n = 9999999991
print(codeforces_669_A(n))