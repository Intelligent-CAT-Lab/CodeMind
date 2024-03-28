import math

def count_pairs(n):
    count = 0
    for i in range(1, int(math.sqrt(n))+1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                count += m
    return count

n = int(input())
print(count_pairs(n))