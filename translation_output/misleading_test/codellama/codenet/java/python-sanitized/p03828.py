import math

def prime_factorize(n):
    factors = []
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            factors.append(i)
            n //= i
    if n > 1:
        factors.append(n)
    return factors

def main():
    n = int(input())
    exponents = [0] * 1001
    for i in range(2, n + 1):
        factors = prime_factorize(i)
        for factor in factors:
            exponents[factor] += 1
    ans = 1
    for i in range(2, n + 1):
        ans *= exponents[i] + 1
        ans %= 1000000007
    print(ans)

if __name__ == "__main__":
    main()