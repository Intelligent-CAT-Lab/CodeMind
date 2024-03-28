import sys

n, m = map(int, input().split())
for i in range(m // n, 0, -1):
    if m % i == 0:
        print(i)
        break