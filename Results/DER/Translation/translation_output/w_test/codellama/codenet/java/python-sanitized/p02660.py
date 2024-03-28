import math

def prime_factors(n):
    if n == 1:
        return 0

    factors = {}
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            count += 1
            n //= i
        if count > 0:
            factors[i] = count

    if n != 1:
        factors[n] = 1

    ans = 0
    for p_count in factors.values():
        i = 1
        while p_count >= i:
            p_count -= i
            ans += 1
            i += 1

    return ans


# Test case
n = 24
print(prime_factors(n))