def primeFactor(N):
    res = []
    i = 2
    while i*i <= N:
        count = 0
        while N % i == 0:
            N //= i
            count += 1
        if count != 0:
            res.append(count)
        i += 1
    if N != 1:
        res.append(1)
    return res

N = int(input())
factors = primeFactor(N)
count = 0
for i in range(len(factors)):
    pow = factors[i]
    increase = 1
    while pow - increase >= 0:
        pow -= increase
        increase += 1
        count += 1

print(count)