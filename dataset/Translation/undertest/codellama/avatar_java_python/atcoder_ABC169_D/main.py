import math

def prime_factor(n):
    factors = []
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            n //= i
            count += 1
        if count != 0:
            factors.append(count)
    if n != 1:
        factors.append(1)
    return factors

def main():
    n = int(input())
    factors = prime_factor(n)
    count = 0
    for i in range(len(factors)):
        pow = factors[i]
        increase = 1
        while pow - increase >= 0:
            pow -= increase
            increase += 1
            count += 1
    print(count)

if __name__ == "__main__":
    main()