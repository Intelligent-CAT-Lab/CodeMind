def p03281(n):
    ans = 0
    for i in range(1, n+1):
        if i % 2 == 1:
            divcount = 0
            for k in range(1, n+1):
                if i % k == 0:
                    divcount += 1
            if divcount == 8:
                ans += 1
    return ans

print(p03281(105))