from collections import Counter

def prime_factors(n):
    factors = Counter()
    i = 2
    while i * i <= n:
        while n % i == 0:
            n //= i
            factors[i] += 1
        i += 1
    if n > 1:
        factors[n] += 1
    return factors

def main():
    N = int(input())
    factors_count = prime_factors(N)
    count = 0
    for factor, occ in factors_count.items():
        pow = occ
        increase = 1
        while pow - increase >= 0:
            pow -= increase
            increase += 1
            count += 1
    print(count)

if __name__ == "__main__":
    main()