def prime_factors(n):
    i = 2
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            print(i, end=' ')
    print(n)

n = int(input())
print(n, ':', end=' ')
prime_factors(n)