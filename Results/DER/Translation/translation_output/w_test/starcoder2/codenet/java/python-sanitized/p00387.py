import sys

a, b = map(int, sys.stdin.readline().split())
print(max(1, (b+a-1)//a))