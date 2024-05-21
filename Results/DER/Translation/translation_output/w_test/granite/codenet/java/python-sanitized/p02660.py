def prime_factors(n):
    factors = {}
    while n % 2 == 0:
        if 2 not in factors:
            factors[2] = 0
        factors[2] += 1
        n = n / 2
    for i in range(3, int(n**0.5) + 1, 2):
        while n % i == 0:
            if i not in factors:
                factors[i] = 0
            factors[i] += 1
            n = n / i
    if n > 2:
        factors[n] = 1
    return factors

def main():
    n = int(input())
    if n == 1:
        print(0)
        return
    factors = prime_factors(n)
    ans = 0
    for factor_count in factors.values():
        i = 1
        while factor_count >= i:
            factor_count -= i
            ans += 1
            i += 1
    print(ans)

if __name__ == "__main__":
    main()