import math

def get_smallest_prime_factor(n, p):
    if n == 1:
        return p
    res = 1
    for i in range(2, int(math.pow(i, n))):
        if p % math.pow(i, n) == 0:
            res = i
    return res

n = int(input())
p = int(input())
print(get_smallest_prime_factor(n, p))