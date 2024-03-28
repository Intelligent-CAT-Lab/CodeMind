import sys

n = int(sys.stdin.readline())
m = n
for i in range(n - 1, -1, -1):
    if m % i == 0:
        print(i, end=' ')
        m = i