import math

def get_steps(n):
    count = 0
    while n > 1:
        n = (n + (n % 3 == 0) * 3 - n % 3) / 3
        count += 1
    return count

n = int(input())
print(get_steps(n))