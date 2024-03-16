import math

def get_sum_of_divisors(n):
    sum = 0
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                sum += m
    return sum

n = int(input())
print(get_sum_of_divisors(n))