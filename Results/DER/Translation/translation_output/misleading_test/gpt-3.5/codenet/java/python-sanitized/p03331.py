def digit(num):
    r = 0
    while True:
        r += num % 10
        num //= 10
        if num == 0:
            break
    return r

n = int(input())
ans = n
for a in range(2, n // 2 + 1):
    b = n - a
    sum_ = digit(a) + digit(b)
    ans = min(sum_, ans)

print(ans)