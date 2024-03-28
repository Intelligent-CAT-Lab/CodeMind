import math
from collections import defaultdict

def factorization(n):
    factors = []
    temp = n
    for i in range(2, int(math.sqrt(n)) + 1):
        if temp % i == 0:
            count = 0
            while temp % i == 0:
                count += 1
                temp //= i
            factors.append((i, count))
    if temp != 1:
        factors.append((temp, 1))
    if len(factors) == 0:
        factors.append((n, 1))
    return factors

def add_map(x, y):
    if x in factors_map:
        factors_map[x] += y
    else:
        factors_map[x] = y

if __name__ == "__main__":
    N = int(input())
    factors_map = defaultdict(int)
    for i in range(2, N + 1):
        for base, exp in factorization(i):
            add_map(base, exp)

    values = sorted(factors_map.values(), reverse=True)
    ans = 0
    for i in range(len(values)):
        if values[i] >= 74:
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
            for j in range(i + 1, len(values)):
                if values[j] >= 4:
                    for k in range(len(values)):
                        if i == k or j == k:
                            continue
                        if values[k] >= 2:
                            ans += 1
    print(ans)