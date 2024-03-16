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
            factors.append((i, cnt))
    if tmp != 1:
        factors.append((tmp, 1))
    if len(factors) == 0:
        factors.append((n, 1))
    return factors

def add_map(x, y):
    if x in factor_map:
        factor_map[x] += y
    else:
        factor_map[x] = y

if __name__ == "__main__":
    N = int(input())
    factor_map = {}
    for i in range(2, N + 1):
        for prime, count in factorization(i):
            add_map(prime, count)
    
    values = sorted(factor_map.values(), reverse=True)
    
    ans = 0
    for v in values:
        if v >= 74:
            ans += 1
    for i in range(len(values)):
        if values[i] >= 24:
            for j in range(len(values)):
                if i == j:
                    continue
                if values[j] >= 2:
                    ans += 1
    for i in range(len(values)):
        if values[i] >= 14:
            for j in range(len(values)):
                if i == j:
                    continue
                if values[j] >= 4:
                    ans += 1
    for i in range(len(values)):
        if values[i] >= 4:
            for j in range(i+1, len(values)):
                if values[j] >= 4:
                    for k in range(len(values)):
                        if i == k or j == k:
                            continue
                        if values[k] >= 2:
                            ans += 1
    print(ans)