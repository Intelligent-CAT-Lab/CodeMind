from itertools import combinations

MOD = 10**9 + 7

def in_range(n, m):
    return combinations(m + n, n) % MOD

def solve(n, m, l, r):
    l_part = m
    r_part = n - m
    cache1 = [0] * (r + 1)
    cache2 = [0] * (r + 1)
    for x in range(1, len(cache1)):
        local_sum = 0
        for j in range(r_part + 1):
            c = combinations(r_part, j) % MOD
            number_of_x = l_part + j
            sub = number_of_x * x
            if number_of_x * x > r:
                break
            plus = c * (in_range(n, r - sub) - in_range(n, l - 1 - sub)) % MOD
            if j % 2 == 1:
                plus = -plus % MOD
            local_sum = (local_sum + plus) % MOD
        cache1[x] = local_sum * combinations(n, l_part) % MOD

    for x in range(1, len(cache2)):
        local_sum = 0
        for j in range(r_part + 1):
            c = combinations(r_part, j) % MOD
            number_of_x = l_part + j
            sub = number_of_x * x + l_part
            if number_of_x * x + l_part > r:
                break
            plus = c * (in_range(n, r - sub) - in_range(n, l - 1 - sub)) % MOD
            if j % 2 == 1:
                plus = -plus % MOD
            local_sum = (local_sum + plus) % MOD
        cache2[x] = local_sum * combinations(n, l_part) % MOD

    sum = (in_range(n, r) - in_range(n, l - 1)) % MOD
    for i in range(r + 1):
        plus = (cache1[i] - cache2[i]) % MOD
        sum = (sum - plus) % MOD

    return sum

# Test
n, m, l, r = 4, 2, 3, 7
print(solve(n, m, l, r))  # 52