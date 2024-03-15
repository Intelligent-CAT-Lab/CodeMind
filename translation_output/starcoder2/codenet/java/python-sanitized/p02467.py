import math

n = int(input())
print(n, end=':')
for i in range(2, int(math.sqrt(n)) + 1):
    while n % i == 0:
        n = n // i
        print(' ', i, end='')
print(' ', n)