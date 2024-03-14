def atcoder_ABC174_C():
    n = int(input())
    num = 7
    res = 1

    while num < n:
        num = num * 10 + 7
        res += 1

    set_num = {7}

    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if num not in set_num:
            set_num.add(num)
        else:
            res = -1
            break
        num = (num * 10 + 7) % n

    print(res)

atcoder_ABC174_C()