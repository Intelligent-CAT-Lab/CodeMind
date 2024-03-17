def codeforces_514_A(x):
    list_ = []

    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list_.append(r)
            else:
                list_.append(9 - r)
        else:
            list_.append(r)
        x = x // 10

    pow_ = 0
    new_number = 0

    for i in range(len(list_)):
        new_number = new_number + list_[i] * (10 ** pow_)
        pow_ += 1

    return new_number

# Test input
x = 5728
# Expected output
print(codeforces_514_A(x))  # 4221