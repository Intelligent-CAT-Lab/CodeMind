import math

def primes(n):
    rn = int(math.sqrt(n))
    sieve = [1] * (rn + 1)
    for i in range(2, rn + 1):
        j = i * 2
        while j <= rn:
            sieve[j] = 0
            j += i
    p = [i for i in range(2, rn + 1) if sieve[i] == 1]
    return p

def phi_func(n, p):
    ans = n
    for q in p:
        if n % q == 0:
            ans = ans * (q - 1) // q
            while n % q == 0:
                n //= q
    else:
        if n > 1:
            ans = ans * (n - 1) // n
    return ans

line = input()
n = int(line)
p = primes(n)
print(phi_func(n, p))
