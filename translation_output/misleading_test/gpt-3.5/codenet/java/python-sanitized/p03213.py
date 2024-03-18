import math

def factorization(n):
    factors = []
    tmp = n
    for i in range(2, int(math.sqrt(n)) + 1):
        if tmp % i == 0:
            cnt = 0
            while tmp % i == 0:
                cnt += 1
                tmp //= i
            factors.append([i, cnt])
    if tmp != 1:
        factors.append([tmp, 1])
    
    if len(factors) == 0:
        factors.append([n, 1])
    
    return factors

map = {}
def add_map(x, y):
    if x in map:
        map[x] += y
    else:
        map[x] = y

N = int(input())
for i in range(2, N + 1):
    factors = factorization(i)
    for factor in factors:
        add_map(factor[0], factor[1])

values = list(map.values())
values.sort(reverse=True)

ans = 0
for val in values:
    if val >= 74:
        ans += 1
for i in range(len(values)):
    if values[i] >= 24:
        for j in range(len(values)):
            if i != j and values[j] >= 2:
                ans += 1
for i in range(len(values)):
    if values[i] >= 14:
        for j in range(len(values)):
            if i != j and values[j] >= 4:
                ans += 1
for i in range(len(values)):
    if values[i] >= 4:
        for j in range(i + 1, len(values)):
            if values[j] >= 4:
                for k in range(len(values)):
                    if i != k and j != k and values[k] >= 2:
                        ans += 1

print(ans)