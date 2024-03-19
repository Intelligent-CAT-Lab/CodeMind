import sys

n = int(sys.stdin.readline().strip())

for i in range(n, 1000):
    if i % 111 == 0:
        print(i)
        break