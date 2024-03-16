def atcoder_ABC174_C(n):
    num = 7
    res = 1

    while num < n:
        num = num * 10 + 7
        res += 1

    seen = set()

    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if not num in seen:
            seen.add(num)
        else:
            res = -1
            break
        num = num * 10 + 7

    return res


# Test case
n = 260522
print(atcoder_ABC174_C(n))