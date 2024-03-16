import math

N = int(input())

def prime_factor(n):
    res = []
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            n //= i
            count += 1
        if count != 0:
            res.append(count)
    if n != 1:
        res.append(1)
    return res

factors = prime_factor(N)
count = 0
for i in range(len(factors)):
    pow = factors[i]
    increase = 1
    while pow - increase >= 0:
        pow -= increase
        increase += 1
        count += 1
print(count)