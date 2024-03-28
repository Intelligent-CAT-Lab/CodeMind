import sys

a, b = map(int, sys.stdin.readline().split())
n = b - a
print(n * (n + 1) // 2 - b)