import math

def get_prime_factors(n):
    if n == 1:
        return 0

    prime_factors = {}
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            count += 1
            n //= i
        if count > 0:
            prime_factors[i] = count

    if n != 1:
        prime_factors[n] = 1

    return prime_factors

def get_prime_factor_count(prime_factors):
    count = 0
    for p_count in prime_factors.values():
        i = 1
        while p_count >= i:
            p_count -= i
            count += 1
            i += 1

    return count

def main():
    n = int(input("Enter a number: "))
    prime_factors = get_prime_factors(n)
    print(get_prime_factor_count(prime_factors))

if __name__ == "__main__":
    main()