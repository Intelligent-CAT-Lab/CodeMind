import math

def prime_factors(n):
    factors = []
    i = 2
    while i * i <= n:
        if n % i == 0:
            factors.append(i)
            n = n // i
        else:
            i += 1
    if n > 1:
        factors.append(n)
    return factors

def main():
    n = int(input())
    print(n, end=":")
    for factor in prime_factors(n):
        print(" ", factor)

if __name__ == "__main__":
    main()



$ python prime_factors.py
12
12: 2 2 3