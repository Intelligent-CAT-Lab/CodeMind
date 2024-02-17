def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a
def solve():
    import fractions
    A,B = map(int, "12 18".split())
    gcd = fractions.gcd(A,B)
    prime_factor = list(set(prime_factorize(gcd)))
    ans = int(len(prime_factor))
    for i in range(int(2**len(prime_factor))):
        i_temp = i
        j = 0
        composite = 1
        count = 0
        while i_temp != 0:
            if i_temp%2 == 0:
                pass
            elif i_temp%2 == 1:
                composite *= prime_factor[j]
                count += 1
            j += 1
            i_temp /= 2
        for j in prime_factor:
            if j == composite and count >= 2:
                ans -= 1
    print(ans + 1) 
solve()