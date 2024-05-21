import sys
import math

n, m = map(int, input().split())

for i in range(m - (n % m)):
    print(math.floor(n / m), end=" ")

for i in range(m - (n % m), m):
    print(math.ceil(n / m), end=" ")