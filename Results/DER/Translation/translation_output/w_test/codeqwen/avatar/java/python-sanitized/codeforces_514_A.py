def reverse_number(n):
    new_number = 0
    power = 0
    while n > 0:
        r = n % 10
        if 9 - r < r:
            if n // 10 == 0 and 9 - r == 0:
                new_number = new_number + r
            else:
                new_number = new_number + 9 - r
        else:
            new_number = new_number + r
        n = n // 10
        power += 1
    return new_number * (10 ** (power - 1))

print(reverse_number(5728))