import sys

n = int(input())
for i in range(n, 1000):
    if i % 111 == 0:
        print(i)
        sys.exit(0)