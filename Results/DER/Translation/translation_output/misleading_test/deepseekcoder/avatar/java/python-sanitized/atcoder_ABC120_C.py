def atcoder_ABC120_C(s1):
    ans = 0
    c1 = 0
    c0 = 0

    for i in s1:
        if i == '1':
            if c0 > 0:
                c0 -= 1
                ans += 1
            else:
                c1 += 1
        else:
            if c1 > 0:
                c1 -= 1
                ans += 1
            else:
                c0 += 1

    return ans * 2

s1 = input()
print(atcoder_ABC120_C(s1))