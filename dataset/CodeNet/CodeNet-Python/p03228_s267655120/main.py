a, b, k= map(int, input().split())

for i in range(k):
    if i % 2 == 0:
        if a % 2 == 1:
            a -= 1
        a //= 2
        b += a
    else:
        if b % 2 == 1:
            b -= 1
        b //= 2
        a += b

print(a, b)