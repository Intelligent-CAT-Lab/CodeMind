import math
import sys

n, m = map(float, input().split())

for i in range(m - int(n % m)):
    print(int(n / m), end=" ")

for i in range(int(m - (n % m)), m):
    print(math.ceil(n / m), end=" ")