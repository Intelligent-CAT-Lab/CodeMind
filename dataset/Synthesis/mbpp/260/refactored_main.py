n = 3
if n == 0 or n == 1: 
    print(1)
print(2 * newman_prime(n - 1) + newman_prime(n - 2))