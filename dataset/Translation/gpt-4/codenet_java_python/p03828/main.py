from collections import Counter

MOD = 1000000007

def prime_factorize(n):
    factors = Counter()
    a = 2
    while a * a <= n:
        while n % a == 0:
            factors[a] += 1
            n //= a
        a += 1
    if n > 1:
        factors[n] += 1
    return factors

def main():
    n = int(input())

    ex = [0] * 1001
    for i in range(2, n + 1):
        pf = prime_factorize(i)
        for p, e in pf.items():
            ex[p] += e

    ans = 1
    for i in range(2, n + 1):
        ans *= ex[i] + 1
        ans %= MOD

    print(ans)

if __name__ == "__main__":
    main()