import math

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def count_divisors(n):
    count = 0
    for i in range(1, n + 1):
        if n % i == 0:
            count += 1
    return count

def solve(n):
    ans = 0
    for i in range(1, n + 1):
        if is_prime(i) and count_divisors(i) == 8:
            ans += 1
    return ans

print(solve(105))