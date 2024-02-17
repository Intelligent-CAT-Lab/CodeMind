def rep_pow(a, k, p=10**9+7):
    # calculate exponentiation: a^k mod p
    ans = 1
    while k > 0:
        if k & 1:
            ans = ans * a % p
        a = a * a % p
        k >>= 1
    return ans
m, n = map(int, "2 3".split())
print(rep_pow(m, n))
