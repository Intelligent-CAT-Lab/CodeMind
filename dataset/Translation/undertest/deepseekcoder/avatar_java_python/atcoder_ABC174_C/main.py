def atcoder_ABC174_C(n):
    num = 7
    res = 1

    while num < n:
        num = num * 10 + 7
        res += 1

    set_num = {num}

    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if num in set_num:
            res = -1
            break
        set_num.add(num)
        num = num * 10 + 7

    return res

print(atcoder_ABC174_C(260522))