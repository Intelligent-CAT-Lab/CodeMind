import math

def prime_factor(N):
    res = []
    for i in range(2, int(math.sqrt(N)) + 1):
        count = 0
        while N % i == 0:
            N //= i
            count += 1
        if count!= 0:
            res.append(count)
    if N!= 1:
        res.append(1)
    return res

N = int(input())
factors = prime_factor(N)
count = 0
for i in factors:
    pow = i
    increase = 1
    while pow - increase >= 0:
        pow -= increase
        increase += 1
        count += 1
print(count)