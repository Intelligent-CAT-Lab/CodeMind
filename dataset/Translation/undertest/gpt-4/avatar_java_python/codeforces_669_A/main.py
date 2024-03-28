def codeforces_669_A(n):
    total = 0
    if n == 2:
        return 1
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    return total


# Test case
n = 999999991
print(codeforces_669_A(n))