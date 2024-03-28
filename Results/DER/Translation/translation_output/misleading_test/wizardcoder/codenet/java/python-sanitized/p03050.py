import math

def sum_of_divisors(n):
    sum = 0
    for i in range(1, int(math.sqrt(n))+1):
        if n % i == 0:
            if i == n/i:
                sum += i
            else:
                sum += i + n/i
    return sum

n = int(input())
print(sum_of_divisors(n))