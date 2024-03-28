import sys

a, b, n = map(int, sys.stdin.readline().split())

k = 0
for i in range(1, n//a + 1):
    k += b

print(k)