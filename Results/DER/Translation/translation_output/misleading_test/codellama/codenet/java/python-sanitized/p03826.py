import sys

a, b = map(int, sys.stdin.readline().split())
print((a * a < b * b) * b or a)