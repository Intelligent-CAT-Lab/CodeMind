import sys

n, a, b = map(int, sys.stdin.readline().split())
print(min(a * n, b))