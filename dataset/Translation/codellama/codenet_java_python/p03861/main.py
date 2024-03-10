import sys

a, b, x = map(int, sys.stdin.readline().split())
count = 0

if a % x == 0:
    count += 1

count += (b // x) - (a // x)

print(count)